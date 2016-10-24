package com.example;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JaxRsConfig extends ResourceConfig {

	public JaxRsConfig() {
		register(HelloEndpoint.class);
	}
	
}
