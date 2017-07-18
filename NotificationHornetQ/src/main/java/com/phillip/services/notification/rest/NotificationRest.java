/**
 * 
 */
package com.phillip.services.notification.rest;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.phillip.services.notification.interfaces.ISender;
import com.phillip.services.notification.models.FirebaseResponse;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

/**
 * @author Bui Dang Khoa
 *
 */
@RestController
public class NotificationRest extends BaseRest {

	@Resource
	@Qualifier("notificationProxy")
	private ISender notificationProxy;
	
	@RequestMapping(value = "/notification/message/send", method = RequestMethod.POST)
	@ApiImplicitParams({ @ApiImplicitParam(name = "message", value = "Message formatted as JSON", required = true, dataType = "string", paramType = "query"),
		@ApiImplicitParam(name = "topic", value = "TOPIC example: {ORDER, PRICE, SCHEDULER}", required = true, dataType = "string", paramType = "query")})
	public @ResponseBody
	FirebaseResponse send(  @RequestParam("message") String message, @RequestParam("topic") String topic) {

		topic = topic.trim().toUpperCase();
		return notificationProxy.send(message, topic);
	}
}
