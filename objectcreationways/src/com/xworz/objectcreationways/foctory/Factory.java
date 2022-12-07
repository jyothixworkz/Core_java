package com.xworz.objectcreationways.foctory;

public class Factory {
	public static Notification createNotification(String value) {

		if (value == null) {
			return null;
		}
		switch (value) {
		case "sms":
			return new SMSNotification();

		// break;
		case "email":
			return new EmailNotification();

		default:
			throw new IllegalArgumentException();

		}

	}

	public static void main(String[] args) {
		Notification notification = createNotification("sms");
		notification.notifyUser();
		Notification createNotification = createNotification("email");
		createNotification.notifyUser();

	}

}
