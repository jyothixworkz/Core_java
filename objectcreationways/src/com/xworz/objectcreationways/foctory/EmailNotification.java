package com.xworz.objectcreationways.foctory;

public class EmailNotification implements Notification {
	@Override
	public void notifyUser() {
		System.out.println("email");
		// TODO Auto-generated method stub
		Notification.super.notifyUser();
	}

}
