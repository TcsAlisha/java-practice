package com.tcs.final1.keyword;

public class Ticket {
	private final String movie="Sholay";
	private float price;
	
	public void sell() {
		
	}
	public final void sell(float price) {
		
	}
}
class Illegalticket extends Ticket{
	public void sell() {
		
	}
}