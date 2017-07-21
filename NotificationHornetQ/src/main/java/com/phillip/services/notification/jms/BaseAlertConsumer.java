/**
 * 
 */
package com.phillip.services.notification.jms;

import java.io.IOException;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.annotation.PostConstruct;
import javax.jms.Connection;
import javax.jms.ConnectionFactory;
import javax.jms.JMSException;
import javax.jms.MapMessage;
import javax.jms.Session;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.phillip.services.notification.util.PropertiesUtil;
import com.phillip.services.notification.util.PropertyFactory;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service
public class BaseAlertConsumer {

	private static final int SCHEDULER_TOPIC = 1;
	private static final int PRICE_TOPIC = 2;
	private static final int ORDER_TOPIC = 3;
	private static final int ACCOUNT_TOPIC = 4;

	@Autowired
	@Qualifier("hornetQConnectionFactory")
	ConnectionFactory hornetQConnectionFactory;

	Connection notificationsQueueConnection;

	Session notificationsQueueSession = null;

	PropertiesUtil config = PropertyFactory.getPropertiesUtil();

	ObjectMapper mapper = new ObjectMapper();

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

	protected String getCorrectTopic(int topic) {
		switch (topic) {
		case SCHEDULER_TOPIC:
			return config.getSchedulerTopic();
		case PRICE_TOPIC:
			return config.getPriceTopic();
		case ORDER_TOPIC:
			return config.getOrderTopic();
		case ACCOUNT_TOPIC:
			return config.getAccountTopic();
		default:
			return null;
		}
	}

	/**
	 * Extract a Map from the given {@link MapMessage}.
	 * 
	 * @param message
	 *            the message to convert
	 * @return the resulting Map
	 * @throws JMSException
	 *             if thrown by JMS methods
	 */
	protected Map extractMapFromMessage(MapMessage message) throws JMSException {
		Map map = new HashMap();
		Enumeration en = message.getMapNames();
		while (en.hasMoreElements()) {
			String key = (String) en.nextElement();
			map.put(key, message.getObject(key));
		}
		return map;
	}

	protected String getFireBaseMessage(Map map) {
		String json = null;

		// convert map to JSON string
		try {
			json = mapper.writeValueAsString(map);
		} catch (JsonGenerationException e) {
			e.printStackTrace();
		} catch (JsonMappingException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}

		return json;
	}
}
