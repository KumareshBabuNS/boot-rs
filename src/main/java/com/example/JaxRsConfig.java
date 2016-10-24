package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JaxRsConfig extends ResourceConfig {

	public JaxRsConfig() {
		register(HelloEndpoint.class);
	}
	
}
