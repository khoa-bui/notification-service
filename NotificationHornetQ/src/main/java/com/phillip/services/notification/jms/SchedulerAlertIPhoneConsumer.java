/**
 * 
 */
package com.phillip.services.notification.jms;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.phillip.services.notification.interfaces.ISender;
import com.phillip.services.notification.models.FirebaseResponse;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service("schedulerAlertIPhoneConsumer")
public class SchedulerAlertIPhoneConsumer extends BaseAlertConsumer implements
		MessageListener {

	@Autowired
	@Qualifier("schedulerAlertIphoneQueue")
	Queue schedulerAlertIphoneQueue;

	@Autowired
	@Qualifier("notificationProxy")
	private ISender notificationProxy;

	@PostConstruct
	public void init() throws Exception {

		super.init();
		MessageConsumer notificationsQueueConsumer = notificationsQueueSession
				.createConsumer(schedulerAlertIphoneQueue);

		notificationsQueueConsumer.setMessageListener(this);

		notificationsQueueConnection.start();

	}

	@PreDestroy
	public void destroy() throws Exception {

		if (notificationsQueueConnection != null) {

			notificationsQueueConnection.close();
		}

	}

	@Override
	public void onMessage(Message message) {

		if (message instanceof MapMessage) {

			try {

				MapMessage mapMessage = (MapMessage) message;

				String topic = getCorrectTopic(mapMessage.getInt("notifyType"));
				
				if (null == topic) {
					topic = config.getSchedulerTopic();
				}
				String fireBaseMessage = getFireBaseMessage(extractMapFromMessage(mapMessage));

				if (!StringUtils.isEmpty(fireBaseMessage)) {
					FirebaseResponse response = notificationProxy.send(
							fireBaseMessage, topic);

					System.out.println("The FirebaseResponse Message is : "
							+ response.getRawBody());
				}

			} catch (JMSException ex) {

				throw new RuntimeException(ex);

			}

		} else {

			throw new IllegalArgumentException(
					"Message must be of type TextMessage");

		}

	}

}
