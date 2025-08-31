package org.example.factorymethod.notificationtype;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS notification");
    }
}
