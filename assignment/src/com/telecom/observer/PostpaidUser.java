package com.telecom.observer;

public class PostpaidUser implements Subscriber{
	
	private String name;
	
	public PostpaidUser(String name) {
		super();
		this.name = name;
	}

	@Override
	public void update(String message) {
		System.out.println("Postpaid user [ "+ name +" ] received alert "+message);
		
	}
}
