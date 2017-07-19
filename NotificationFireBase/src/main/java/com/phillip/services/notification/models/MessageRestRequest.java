/**
 * 
 */
package com.phillip.services.notification.models;

/**
 * @author Bui Dang Khoa
 *
 */
public class MessageRestRequest {

	private String message;
	private FireBaseTopic topic;
	
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public FireBaseTopic getTopic() {
		return topic;
	}
	public void setTopic(FireBaseTopic topic) {
		this.topic = topic;
	}
	
	
}
