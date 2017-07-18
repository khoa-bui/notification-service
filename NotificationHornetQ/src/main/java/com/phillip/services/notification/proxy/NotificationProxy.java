/**
 * 
 */
package com.phillip.services.notification.proxy;

import java.io.UnsupportedEncodingException;

import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Service;

import com.phillip.services.notification.error.FirebaseException;
import com.phillip.services.notification.interfaces.ISender;
import com.phillip.services.notification.models.FireBaseTopic;
import com.phillip.services.notification.models.FirebaseResponse;
import com.phillip.services.notification.service.Firebase;
import com.phillip.services.notification.util.PropertiesUtil;
import com.phillip.services.notification.util.PropertyFactory;

/**
 * @author Bui Dang Khoa
 * 
 */
@Service("notificationProxy")
@PropertySource("classpath:settings.properties")
public class NotificationProxy implements ISender {

	private PropertiesUtil config = PropertyFactory
			.getPropertiesUtil();

	// private Firebase fireBase =null;
	private Firebase fireBase = new Firebase(config.getFireBaseUrl());

	@Override
	public FirebaseResponse send(String message, String topic) {

		FirebaseResponse response = null;
		topic = getCorrectTopic(FireBaseTopic.valueOf(topic));
		message = buildFireBaseMessage(message, topic);

		try {
			response = fireBase.post(message, config.getServerKey());
		} catch (UnsupportedEncodingException | FirebaseException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return response;
	}

	private String getCorrectTopic(FireBaseTopic topicEnum) {
		switch (topicEnum) {
		case PRICE:
			return config.getPriceTopic();
		case ORDER:
			return config.getOrderTopic();
		default:
			return config.getSchedulerTopic();
		}
	}

	private String buildFireBaseMessage(String originMsg, String topic) {
		return "{ " + "\"data\":" + originMsg + "," + "\"to\":\"" + topic
				+ "\"" + "}";
	}

}
