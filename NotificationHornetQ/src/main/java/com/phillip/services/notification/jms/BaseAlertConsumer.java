/**
 * 
 */
package com.phillip.services.notification.jms;

import javax.annotation.PostConstruct;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service
public class BaseAlertConsumer {

	@Autowired
	@Qualifier("hornetQConnectionFactory")
	ConnectionFactory hornetQConnectionFactory;

	Connection notificationsQueueConnection;

	Session notificationsQueueSession = null;


	@PostConstruct
	public void init() throws Exception {
		synchronized (this) {
			if (null == notificationsQueueConnection) {
				notificationsQueueConnection = hornetQConnectionFactory
						.createConnection();

				notificationsQueueSession = notificationsQueueConnection
						.createSession(false, Session.AUTO_ACKNOWLEDGE);
			}

		}

	}
}
