/**
 * 
 */
package com.phillip.services.notification.util;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @author Bui Dang Khoa
 *
 */
public class PropertyFactory {

	private static ApplicationContext ctx = new AnnotationConfigApplicationContext(
			PropertiesUtil.class);

	private static PropertiesUtil config = ctx.getBean(PropertiesUtil.class);

	public static PropertiesUtil getPropertiesUtil() {
		return config;
	}

}
