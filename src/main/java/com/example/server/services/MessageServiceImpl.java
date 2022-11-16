package com.example.server.services;

import com.example.server.models.SaveMessage;
import com.example.server.repositories.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

    @Autowired
    private MessageRepository messageRepository;


    @Override
    public SaveMessage saveMsg(SaveMessage saveMessage) {
        return messageRepository.save(saveMessage);
    }
}
