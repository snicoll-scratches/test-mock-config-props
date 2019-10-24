package com.example.demo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.ConstructorBinding;
import org.springframework.boot.context.properties.bind.DefaultValue;

@ConfigurationProperties("test")
public class OnConstructorTestProperties {

	private final String name;

	@ConstructorBinding
	public OnConstructorTestProperties(@DefaultValue("test") String name) {
		this.name = name;
	}

	public String getName() {
		return this.name;
	}

}
