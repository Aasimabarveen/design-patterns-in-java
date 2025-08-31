package org.example.factorymethod.notificationfactory;

import org.example.factorymethod.notificationtype.*;

public class SmsNotificationFactory extends NotificationFactory{
    @Override
    public Notification createNotification(){
        return new SmsNotification();
    }
}