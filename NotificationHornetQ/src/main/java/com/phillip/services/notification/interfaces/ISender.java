/**
 * 
 */
package com.phillip.services.notification.interfaces;

import com.phillip.services.notification.models.FireBaseTopic;
import com.phillip.services.notification.models.FirebaseResponse;


/**
 * @author Bui Dang Khoa
 *
 */
public interface ISender {

	public FirebaseResponse send(String message, String topic);
	
	public FirebaseResponse send(String message, FireBaseTopic topic);
}
