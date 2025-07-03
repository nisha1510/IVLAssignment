package com.telecom.observer;

import java.util.ArrayList;
import java.util.List;

public class NetworkMonitoringSystem {
	
	private List<Subscriber> subList = new ArrayList<>();
	
	public void registerSubscriber(Subscriber s) {
		subList.add(s);
	}
	public void removeSubscriber(Subscriber s) {
		subList.remove(s);
	}
	public void notifyAllSubscriber(String meassage) {
		for(Subscriber s : subList) {
			s.update(meassage);
		}
	}
	public void detectNetworkOutage() {
		System.out.println("Network outage reported...");
		notifyAllSubscriber("Network outage in your area from 5pm to 10pm ");
	}
}
