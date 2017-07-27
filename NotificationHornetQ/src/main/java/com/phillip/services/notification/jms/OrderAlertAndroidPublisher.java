package com.phillip.services.notification.jms;

/**
 * 
 */

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import javax.jms.MapMessage;
import javax.jms.MessageProducer;
import javax.jms.Queue;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service("orderAlertAndroidPublisher")
public class OrderAlertAndroidPublisher extends BaseAlertConsumer/*
																 * implements
																 * MessageListener
																 */{

	@Autowired
	@Qualifier("orderAlertAndroidQueue")
	Queue orderAlertAndroidQueue;

	@PostConstruct
	public void init() throws Exception {
		super.init();

		MessageProducer publisher = notificationsQueueSession
				.createProducer(orderAlertAndroidQueue);

		notificationsQueueConnection.start();

//		for (int i = 0; i < 100; i++) {
//			MapMessage message = notificationsQueueSession
//					.createMapMessage();
//			message.setString("title", "POEMS Price Alert");
//			message.setString("appToken", "2fdc45c4b3c6a47c38570fa76ee21e5db8d8a2634cd847c3089f28470ebea658");
//			message.setInt("appType", 8);
//			message.setString("collapseKey", "PriceAlert");
//			message.setString("message", "Your price alert has been triggered \n Stocks - SGX - SingTel \n Volume(K) Target: 200 \n 13 Jul 2017, 01:41PM");
//			message.setInt("notifyType", 2);
//			message.setString("CounterID", "ST/SG/SGX/SGT.SG");
//			message.setString("Exchange", "SGX");
//			message.setString("ProductKey", "ST");
//			message.setString("CompanyCode", "SGT.SG");
//			message.setString("CompanyName", "SingTel");
//			message.setString("PriceAlertId", "238476");
//			publisher.send(message);
//		}

	}

	@PreDestroy
	public void destroy() throws Exception {

		if (notificationsQueueConnection != null) {

			notificationsQueueConnection.close();
		}

	}

}
