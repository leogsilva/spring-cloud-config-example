package com.configtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.stereotype.Component;

@Component
@RefreshScope
public class CheckReload {

	
	String foo ;

	@Autowired
	public CheckReload(@Value("${democonfigclient.message}") String foo) {
		System.err.println("Creating CheckReload with Value " + foo);
		this.foo = foo;
	}
	
	public String printReload() {
		return foo;
	}
}
