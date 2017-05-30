package com.io.swagger.api.impl;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.io.swagger.api.ScreenmessageApi;

public class ScreenmessageApiServiceImpl implements ScreenmessageApi {

	private static final Logger LOG = LoggerFactory.getLogger(ScreenmessageApiServiceImpl.class.getSimpleName());

	public Response screenmessage(String body) {
		Response response = Response.ok().type(MediaType.APPLICATION_XML).build();
		return response;

	}

}
