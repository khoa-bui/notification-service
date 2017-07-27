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

import com.phillip.services.notification.util.PropertiesUtil;
import com.phillip.services.notification.util.PropertyFactory;
/**
 * @author Bui Dang Khoa
 * 
 */
@Configuration
public class JmsHornetQConfiguration {

	private PropertiesUtil config = PropertyFactory
			.getPropertiesUtil();
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
	public Queue accountAlertAndroidQueue() {
		return getJmsQueue(config.getAccountAlertAndroidQueue());
	}
	
	@Bean
	public Queue accountAlertIphoneQueue() {
		return getJmsQueue(config.getAccountAlertIphoneQueue());
	}
	
	@Bean
	public Queue accountAlertIpadQueue() {
		return getJmsQueue(config.getAccountAlertIpadQueue());
	}
	
	@Bean
	public Queue priceAlertIphoneQueue() {
		return getJmsQueue(config.getPriceAlertIphoneQueue());
	}
	
	@Bean
	public Queue priceAlertAndroidQueue() {
		return getJmsQueue(config.getPriceAlertAndroidQueue());
	}
	
	@Bean
	public Queue orderAlertAndroidQueue() {
		return getJmsQueue(config.getOrderAlertAndroidQueue());
	}
	
	@Bean
	public Queue orderAlertIphoneQueue() {
		return getJmsQueue(config.getOrderAlertIphoneQueue());
	}
	
	@Bean
	public Queue orderAlertIpadQueue() {
		return getJmsQueue(config.getOrderAlertIpadQueue());
	}
	
	@Bean
	public Queue schedulerAlertAndroidQueue() {
		return getJmsQueue(config.getSchedulerAlertAndroidQueue());
	}
	
	@Bean
	public Queue schedulerAlertIpadQueue() {
		return getJmsQueue(config.getSchedulerAlertIpadQueue());
	}
	
	@Bean
	public Queue schedulerAlertIphoneQueue() {
		return getJmsQueue(config.getSchedulerAlertIphoneQueue());
	}
	
	
	private Queue getJmsQueue(String jndi) {
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
