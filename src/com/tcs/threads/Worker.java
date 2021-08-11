package com.tcs.threads;

public class Worker implements Runnable{
	@Override
	public void run() {
		System.out.println(Thread.currentThread());
		try {
			Thread.sleep(9999);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
