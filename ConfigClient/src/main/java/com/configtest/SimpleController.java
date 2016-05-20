package com.configtest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SimpleController {

	@Autowired CheckReload reload;

	@RequestMapping("/")
	String hello() {
		return "Hello " + reload.printReload();
	}

}
