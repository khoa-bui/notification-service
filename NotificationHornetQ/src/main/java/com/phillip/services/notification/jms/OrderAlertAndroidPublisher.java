package com.phillip.services.notification.jms;
/**
 * 
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.MessageProducer;
import javax.jms.Queue;
import javax.jms.TextMessage;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service("orderAlertAndroidPublisher")
public class OrderAlertAndroidPublisher extends BaseAlertConsumer/* implements MessageListener*/ {
	

	@Autowired
	@Qualifier("orderAlertAndroidQueue")
	Queue orderAlertAndroidQueue;

	@PostConstruct
	public void init() throws Exception {
		super.init();
		
		MessageProducer publisher = notificationsQueueSession.createProducer(orderAlertAndroidQueue);


		notificationsQueueConnection.start();
		
		for(int i = 0; i< 100; i++) {
			 TextMessage message = notificationsQueueSession.createTextMessage("Hello khoa! : " + i);
	            publisher.send(message);
		}

	}

	@PreDestroy
	public void destroy() throws Exception {

		if (notificationsQueueConnection != null) {

			notificationsQueueConnection.close();
		}

	}

}
