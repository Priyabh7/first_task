package com.example.demo.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.services.devService;

@RequestMapping
@RestController
public class devController {
	@Autowired
	private devService service;
	public String[] getFood() {
		return this.service.getFood();
	}
}
