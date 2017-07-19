/**
 * 
 */
package com.phillip.services.notification.rest;

import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;

import javax.annotation.Resource;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.phillip.services.notification.interfaces.ISender;
import com.phillip.services.notification.models.FirebaseResponse;
import com.phillip.services.notification.models.MessageRestRequest;

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
	@ApiImplicitParams({ @ApiImplicitParam(name = "data", value = "Message formatted as JSON", required = true, dataType = "string")})
	public @ResponseBody
	FirebaseResponse send(@RequestBody MessageRestRequest data) {

		return notificationProxy.send(data.getMessage(), data.getTopic());
	}
}
