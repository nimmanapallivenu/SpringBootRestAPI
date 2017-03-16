package com.venu.boot.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author venu.nimmanapalli
 *
 */
@RestController
public class WelcomeController {

	@RequestMapping("")
	public String welcomoe() {

		return "Welcome to Spring Boot";
	}

}
