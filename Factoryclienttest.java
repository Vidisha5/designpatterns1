package com.example.factory1;

public class Factoryclienttest {

	public static void main(String[] args) {
		Notification notification=Notificationfactory.createNotification("Email");
		System.out.println(notification.notifyUser());
	}
}
