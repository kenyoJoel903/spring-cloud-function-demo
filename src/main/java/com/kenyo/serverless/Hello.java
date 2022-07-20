package com.kenyo.serverless;

import java.util.function.Function;

public class Hello implements Function<String, String> {

	@Override
	public String apply(String name) {
		return "Hello " + name;
	}

}
