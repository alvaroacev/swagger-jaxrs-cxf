package com.io.swagger.api;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Response;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@Path("/")
@Api(value = "/", description = "")
public interface ScreenmessageApi  {

    @POST
    @Path("/screenmessage")
    @Consumes({ "application/xml" })
    @Produces({ "application/xml" })
    @ApiOperation(value = " a XML canonical message in the body containing the message to screened", tags={ "screenmessage" })
    public Response screenmessage(String body);
}

