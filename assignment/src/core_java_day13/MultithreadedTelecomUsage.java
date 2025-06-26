package core_java_day13;
/*
 Each customer call or sms creates a usage reacord.
 Multiple threads handle parallel logging (calls, msg, data usages)
 the system is old but critical - and it uses vector for thread safe operations
 */

import java.util.Vector;

class UsageRecord {
	String type;
	String detail;

	public UsageRecord(String type, String detail) {
		this.type = type;
		this.detail = detail;
	}

	@Override
	public String toString() {
		return type + ": " + detail;
	}
}

class UsageLogger {
	private Vector<UsageRecord> usageRecords = new Vector<>();

	public void logUsage(String type, String detail) {
		usageRecords.add(new UsageRecord(type, detail));
	}

	public void printUsage() {
		for (UsageRecord record : usageRecords) {
			System.out.println(record);
		}
	}
}

public class MultithreadedTelecomUsage {
	
	public static void main(String[] args) {
       
		UsageLogger logger = new UsageLogger();
 
        // Simulating multiple threads
        Thread callLogger = new Thread(() -> logger.logUsage("Call", "Duration: 5 mins"));
        Thread smsLogger = new Thread(() -> logger.logUsage("SMS", "To: +9188766568"));
        Thread dataLogger = new Thread(() -> logger.logUsage("Data", "Used: 200MB"));
 
        callLogger.start();
        smsLogger.start();
        dataLogger.start();
       // System.out.println();
 
        try {
            callLogger.join();
            smsLogger.join();
            dataLogger.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
 
        System.out.println("Usage Logs:");
        logger.printUsage();
	}
}
