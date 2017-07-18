package com.phillip.services.notification.models;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

public abstract class BaseObject {

	public String toJson() throws JsonGenerationException,
			JsonMappingException, IOException {

		return (new ObjectMapper()).writeValueAsString(this);
	}
}
