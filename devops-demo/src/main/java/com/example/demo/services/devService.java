package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class devService {
	public String[] getFood() {
		return new String[]
				{"pizza","burger","noodles"	};
	}
}
