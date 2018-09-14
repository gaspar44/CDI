package com.gaspar44.book.impl;

import java.util.Random;

import com.gaspar44.book.api.Generator;
import com.gaspar44.book.api.NumberGenerator;

@Generator(use = true)
public class IssnnGenerator implements NumberGenerator {

	@Override
	public String generateNumber() {
		return "25.529.100" + Math.abs(new Random().nextInt());
	}

}
