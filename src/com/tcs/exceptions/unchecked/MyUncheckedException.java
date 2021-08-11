package com.tcs.exceptions.unchecked;

public class MyUncheckedException extends IllegalArgumentException {
	public MyUncheckedException(String message) {
		super(message);
	}
}
