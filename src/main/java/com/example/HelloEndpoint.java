package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class HelloEndpoint {

	@GET
	public String hello() {
		return "Hello world!";
	}
	
}
