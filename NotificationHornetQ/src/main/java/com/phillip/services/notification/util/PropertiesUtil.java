/**
 * 
 */
package com.phillip.services.notification.util;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

/**
 * @author Bui Dang Khoa
 * 
 */
@Configuration
@PropertySource("classpath:settings.properties")
public class PropertiesUtil {

	@Value("${firebase.url}")
	String fireBaseUrl;
	@Value("${firebase.serverKey}")
	String serverKey;
	@Value("${firebase.account.topic}")
	String accountTopic;
	@Value("${firebase.price.topic}")
	String priceTopic;
	@Value("${firebase.order.topic}")
	String orderTopic;
	@Value("${firebase.scheduler.topic}")
	String schedulerTopic;
	@Value("${apple.pricealert.iphone.queue}")
	String  priceAlertIphoneQueue;
	@Value("${google.pricealert.android.queue}")
	String  priceAlertAndroidQueue;
	@Value("${apple.orderalert.iphone.queue}")
	String  orderAlertIphoneQueue;
	@Value("${apple.orderalert.ipad.queue}")
	String  orderAlertIpadQueue;
	@Value("${google.orderalert.android.queue}")
	String  orderAlertAndroidQueue;
	@Value("${apple.accountalert.iphone.queue}")
	String  accountAlertIphoneQueue;
	@Value("${apple.accountalert.ipad.queue}")
	String  accountAlertIpadQueue;
	@Value("${google.accountalert.android.queue}")
	String  accountAlertAndroidQueue;
	@Value("${apple.iphone.queue}")
	String  schedulerAlertIphoneQueue;
	@Value("${apple.ipad.queue}")
	String  schedulerAlertIpadQueue;
	@Value("${google.android.queue}")
	String  schedulerAlertAndroidQueue;
	

	public String getFireBaseUrl() {
		return fireBaseUrl;
	}

	public void setFireBaseUrl(String fireBaseUrl) {
		this.fireBaseUrl = fireBaseUrl;
	}

	public String getServerKey() {
		return serverKey;
	}

	public void setServerKey(String serverKey) {
		this.serverKey = serverKey;
	}

	public String getPriceTopic() {
		return priceTopic;
	}

	public void setPriceTopic(String priceTopic) {
		this.priceTopic = priceTopic;
	}

	public String getOrderTopic() {
		return orderTopic;
	}

	public void setOrderTopic(String orderTopic) {
		this.orderTopic = orderTopic;
	}

	public String getSchedulerTopic() {
		return schedulerTopic;
	}

	public void setSchedulerTopic(String schedulerTopic) {
		this.schedulerTopic = schedulerTopic;
	}

	public String getPriceAlertIphoneQueue() {
		return priceAlertIphoneQueue;
	}

	public void setPriceAlertIphoneQueue(String priceAlertIphoneQueue) {
		this.priceAlertIphoneQueue = priceAlertIphoneQueue;
	}

	public String getPriceAlertAndroidQueue() {
		return priceAlertAndroidQueue;
	}

	public void setPriceAlertAndroidQueue(String priceAlertAndroidQueue) {
		this.priceAlertAndroidQueue = priceAlertAndroidQueue;
	}

	public String getOrderAlertIphoneQueue() {
		return orderAlertIphoneQueue;
	}

	public void setOrderAlertIphoneQueue(String orderAlertIphoneQueue) {
		this.orderAlertIphoneQueue = orderAlertIphoneQueue;
	}

	public String getOrderAlertIpadQueue() {
		return orderAlertIpadQueue;
	}

	public void setOrderAlertIpadQueue(String orderAlertIpadQueue) {
		this.orderAlertIpadQueue = orderAlertIpadQueue;
	}

	public String getOrderAlertAndroidQueue() {
		return orderAlertAndroidQueue;
	}

	public void setOrderAlertAndroidQueue(String orderAlertAndroidQueue) {
		this.orderAlertAndroidQueue = orderAlertAndroidQueue;
	}

	public String getSchedulerAlertIphoneQueue() {
		return schedulerAlertIphoneQueue;
	}

	public void setSchedulerAlertIphoneQueue(String schedulerAlertIphoneQueue) {
		this.schedulerAlertIphoneQueue = schedulerAlertIphoneQueue;
	}

	public String getSchedulerAlertIpadQueue() {
		return schedulerAlertIpadQueue;
	}

	public void setSchedulerAlertIpadQueue(String schedulerAlertIpadQueue) {
		this.schedulerAlertIpadQueue = schedulerAlertIpadQueue;
	}

	public String getSchedulerAlertAndroidQueue() {
		return schedulerAlertAndroidQueue;
	}

	public void setSchedulerAlertAndroidQueue(String schedulerAlertAndroidQueue) {
		this.schedulerAlertAndroidQueue = schedulerAlertAndroidQueue;
	}

	public String getAccountAlertIphoneQueue() {
		return accountAlertIphoneQueue;
	}

	public void setAccountAlertIphoneQueue(String accountAlertIphoneQueue) {
		this.accountAlertIphoneQueue = accountAlertIphoneQueue;
	}

	public String getAccountAlertIpadQueue() {
		return accountAlertIpadQueue;
	}

	public void setAccountAlertIpadQueue(String accountAlertIpadQueue) {
		this.accountAlertIpadQueue = accountAlertIpadQueue;
	}

	public String getAccountAlertAndroidQueue() {
		return accountAlertAndroidQueue;
	}

	public void setAccountAlertAndroidQueue(String accountAlertAndroidQueue) {
		this.accountAlertAndroidQueue = accountAlertAndroidQueue;
	}

	public String getAccountTopic() {
		return accountTopic;
	}

	public void setAccountTopic(String accountTopic) {
		this.accountTopic = accountTopic;
	}

}
