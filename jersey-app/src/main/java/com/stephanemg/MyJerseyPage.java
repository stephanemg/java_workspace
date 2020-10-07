package com.stephanemg;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/hello")
public class MyJerseyPage {
	@GET
	@Produces(MediaType.TEXT_HTML)
	public String sayHtmlHello() {
		return "Hello from Jersey";
	}
	
	@POST
	@Produces(MediaType.APPLICATION_JSON)
	@Consumes(MediaType.APPLICATION_JSON)
	public String sayHtmlHello(Hello hello) {
		return hello.toString();
	}
}
