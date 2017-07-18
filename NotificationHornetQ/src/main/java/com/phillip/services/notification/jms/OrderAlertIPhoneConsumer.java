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

/**
 * @author Bui Dang Khoa
 * 
 */
@Service("orderAlertIPhoneConsumer")
public class OrderAlertIPhoneConsumer extends BaseAlertConsumer implements MessageListener {
	

	@Autowired
	@Qualifier("orderAlertIphoneQueue")
	Queue orderAlertIphoneQueue;

	@PostConstruct
	public void init() throws Exception {
		super.init();
		MessageConsumer notificationsQueueConsumer = notificationsQueueSession
				.createConsumer(orderAlertIphoneQueue);

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

				System.out.println("The Notification Message is : \n" + text);

			} catch (JMSException ex) {

				throw new RuntimeException(ex);

			}

		} else {

			throw new IllegalArgumentException(
					"Message must be of type TextMessage");

		}

	}



}
