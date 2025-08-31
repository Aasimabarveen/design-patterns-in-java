package org.example.factorymethod.notificationfactory;

import org.example.factorymethod.notificationtype.*;
public abstract class NotificationFactory{
    public abstract Notification createNotification();
}