package com.gaspar44.book.impl;

import java.util.Random;

import com.gaspar44.book.api.Generator;
import com.gaspar44.book.api.NumberGenerator;

@Generator(use = false)
public class IsshnGenerator implements NumberGenerator{

	@Override
	public String generateNumber() {
		return "13-10637" + Math.abs(new Random().nextInt());
	}

}
