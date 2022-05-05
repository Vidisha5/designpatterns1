package com.example.factory1;

public class Notificationfactory {

	
	public static Notification createNotification(String channel) {
		if(channel.equals("Sms")) {
			return new SmsNotification();
		}
		else if(channel.equals("Email")) {
			return new EmailNotification();
		}
		else if(channel.equals("Push")) {
			return new PushNotification();
		}
		return null;
		
	}
}
