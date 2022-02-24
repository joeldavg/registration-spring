package com.amigoscode.user.registration;

import java.util.function.Predicate;

import org.springframework.stereotype.Component;

@Component
public class EmailValidator implements Predicate<String> {

	@Override
	public boolean test(String t) {
		return true;
	}

}
