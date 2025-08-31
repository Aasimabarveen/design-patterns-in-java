package org.example.factorymethod.client;

import org.example.factorymethod.notificationfactory.NotificationFactory;
import org.example.factorymethod.notificationfactory.EmailNotificationFactory;
import org.example.factorymethod.notificationtype.Notification;

public class NotificationApp {
    public static void main(String[] args) {
        NotificationFactory createEmail = new EmailNotificationFactory();
        Notification email = createEmail.createNotification();
        email.notifyUser();
    }
}