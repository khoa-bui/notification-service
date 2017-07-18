/**
 * 
 */
package com.phillip.services.notification;

import javax.jms.ConnectionFactory;
import javax.jms.Queue;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jms.core.JmsTemplate;
/**
 * @author Bui Dang Khoa
 * 
 */
@Configuration
public class JmsHornetQConfiguration {

	@Bean
	public JmsTemplate hornetQJmsTemplate() {

		JmsTemplate jmsTemplate = new JmsTemplate(
				hornetQConnectionFactory());
		return jmsTemplate;
	}

	@Bean
	public ConnectionFactory hornetQConnectionFactory() {
		 // Gets the JNDI context
        Context jndiContext;
        ConnectionFactory connectionFactory = null;
		try {
			jndiContext = new InitialContext();
			// Looks up the administered objects
		    connectionFactory = (ConnectionFactory)
		                jndiContext.lookup("java:/ConnectionFactory");
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connectionFactory;
	}
	
	@Bean
	public Queue priceAlertIphoneQueue() {
		return getJmsQueue("java:/jms/queue/price-iphone-queue");
	}
	
	@Bean
	public Queue priceAlertAndroidQueue() {
		return getJmsQueue("java:/jms/queue/price-android-queue");
	}
	
	@Bean
	public Queue orderAlertAndroidQueue() {
		return getJmsQueue("java:/jms/queue/order-android-queue");
	}
	
	@Bean
	public Queue orderAlertIphoneQueue() {
		return getJmsQueue("java:/jms/queue/order-iphone-queue");
	}
	
	@Bean
	public Queue orderAlertIpadQueue() {
		return getJmsQueue("java:/jms/queue/order-ipad-queue");
	}
	
	@Bean
	public Queue schedulerAlertAndroidQueue() {
		return getJmsQueue("java:/jms/queue/android-queue");
	}
	
	@Bean
	public Queue schedulerAlertIpadQueue() {
		return getJmsQueue("java:/jms/queue/ipad-queue");
	}
	
	@Bean
	public Queue schedulerAlertIphoneQueue() {
		return getJmsQueue("java:/jms/queue/iphone-queue");
	}
	
	@Bean
	public Queue getJmsQueue(String jndi) {
		 // Gets the JNDI context
        Context jndiContext;
        Queue queue = null;
		try {
			jndiContext = new InitialContext();
			// Looks up the administered objects
		    queue = (Queue)
		                jndiContext.lookup(jndi);
			
		} catch (NamingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
		return queue;
	}
}
