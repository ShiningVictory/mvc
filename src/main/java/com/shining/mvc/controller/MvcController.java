package com.shining.mvc.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {

	@GetMapping("/main")
	public String mvcTest() {
		return "index";
	}
}
