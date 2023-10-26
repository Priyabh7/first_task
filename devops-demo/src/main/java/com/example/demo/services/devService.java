package com.example.demo.services;

import org.springframework.stereotype.Service;

@Service
public class devService {
	public String[] getFood() {
				System.out.println("list of food: ");
		return new String[]
				{"pizza","burger","noodles"	};

	}
}
