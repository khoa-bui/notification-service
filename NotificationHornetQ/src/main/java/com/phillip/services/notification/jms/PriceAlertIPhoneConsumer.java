/**
 * 
 */
package com.phillip.services.notification.jms;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.JMSException;
import javax.jms.Message;
import javax.jms.MessageConsumer;
import javax.jms.MessageListener;
import javax.jms.Queue;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.phillip.services.notification.interfaces.ISender;
import com.phillip.services.notification.models.FirebaseResponse;
import com.phillip.services.notification.parser.MessageJsonParser;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service("priceAlertIPhoneConsumer")
public class PriceAlertIPhoneConsumer extends BaseAlertConsumer implements
		MessageListener {

	@Autowired
	@Qualifier("priceAlertIphoneQueue")
	Queue priceAlertIphoneQueue;

	@Autowired
	@Qualifier("notificationProxy")
	private ISender notificationProxy;

	@PostConstruct
	public void init() throws Exception {
		super.init();
		MessageConsumer notificationsQueueConsumer = notificationsQueueSession
				.createConsumer(priceAlertIphoneQueue);

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

		if (message instanceof TextMessage) {

			try {

				String text = ((TextMessage) message).getText();

				System.out.println("The Notification Message is : " + text);

				String fireBaseMessage = MessageJsonParser
						.parsePriceMessage(text);

				if (!StringUtils.isEmpty(fireBaseMessage)) {

					FirebaseResponse response = notificationProxy.send(
							fireBaseMessage, config.getPriceTopic());

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
