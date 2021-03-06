package com.buaa.whatupmessengermessaging.service;

import com.buaa.whatupmessengermessaging.model.GroupMessage;
import com.buaa.whatupmessengermessaging.model.Message;
import com.buaa.whatupmessengermessaging.model.Notification;
import com.buaa.whatupmessengermessaging.model.Tuple;

import java.util.List;
import java.util.Map;

public
interface MessagingService {

    Map<Tuple, List<Message>> getMessagesAsc(String receiverId);
    Map<Tuple, List<Message>> getMessagesDesc(String receiverId);
    Map<Tuple, List<GroupMessage>> getGroupMessagesAsc(String receiverId);
    Map<Tuple, List<GroupMessage>> getGroupMessagesDesc(String receiverId);

    void dropMessages(String receiverId);
    void dropGroupMessages(String receiverId);

    void saveMessage(Message message);
    void saveGroupMessage(GroupMessage message);

    void sendNotification(String from, String to, Notification msg);
    void sendGroupNotification(String from, String to, Notification msg);

    void sendAllNotification(String from, Notification msg);
}
