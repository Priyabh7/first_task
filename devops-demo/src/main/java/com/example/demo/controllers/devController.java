package com.example.demo.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RequestMapping
@RestController
public class devController {
	public String[] getFood() {
		return new String[]
				{"pizza","burger","noodles"	};
	}
}
