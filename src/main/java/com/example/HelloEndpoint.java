package com.example;

import javax.ws.rs.GET;
import javax.ws.rs.Path;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@Path("/hello")
public class HelloEndpoint {

	private GreetingProps props;

	@Autowired
	public HelloEndpoint(GreetingProps props) {
		this.props = props;
	}
	
	@GET
	public String hello() {
		return props.getHelloMessage();
	}
	
}
