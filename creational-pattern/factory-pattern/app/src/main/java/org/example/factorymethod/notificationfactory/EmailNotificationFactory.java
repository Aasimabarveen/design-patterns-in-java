package org.example.factorymethod.notificationfactory;

import org.example.factorymethod.notificationtype.*;

public class EmailNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){
        return new EmailNotification();
    }
}