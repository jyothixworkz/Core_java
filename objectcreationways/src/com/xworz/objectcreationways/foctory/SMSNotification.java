package com.xworz.objectcreationways.foctory;

public class SMSNotification implements Notification {
	 @Override
	public void notifyUser() {
		System.out.println("sms");
		Notification.super.notifyUser();
	}

}
