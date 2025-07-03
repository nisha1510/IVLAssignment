package com.telecom.observer;

public class TelecomObserverPattern {
	
	public static void main(String[] args) {
		
		NetworkMonitoringSystem sys = new NetworkMonitoringSystem();
		
		Subscriber user1 = new PrepaidUser("Pawan");
		Subscriber user2 = new PostpaidUser("Preeti");
		Subscriber user3 = new CorporateClient("Chitti");
		
		sys.registerSubscriber(user1);
		sys.registerSubscriber(user2);
		sys.registerSubscriber(user3);
		
		//outage
		sys.detectNetworkOutage();
		
	}

}
