package com.tcs.errordemo;

public class ErrorDemo {
	public static void main(String[] args) {
		new ErrorDemo().infiniteMethod();
	}
	private void infiniteMethod() {
		infiniteMethod();
	}
}
//public class ErrorDemo {
//	  public static void main (String[] args) {
//	    Object error = new Error();
//	    Object runtimeException = new RuntimeException();
//	    System.out.print((error instanceof Exception) + ",");
//	    System.out.print(runtimeException instanceof Exception);
//	}}