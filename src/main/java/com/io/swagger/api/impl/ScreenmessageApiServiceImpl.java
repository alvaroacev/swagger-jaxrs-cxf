package com.io.swagger.api.impl;

import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.io.swagger.api.ScreenmessageApi;

public class ScreenmessageApiServiceImpl implements ScreenmessageApi {

	public Response screenmessage(String body) {
		Response response = Response.ok().type(MediaType.APPLICATION_XML).build();
		return response;

	}

}
