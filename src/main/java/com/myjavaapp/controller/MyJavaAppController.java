package com.myjavaapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class MyJavaAppController {
	@GetMapping("/getValue")
	public String getall() {
		return "Myself Yoganathan D.....";
	}
}
