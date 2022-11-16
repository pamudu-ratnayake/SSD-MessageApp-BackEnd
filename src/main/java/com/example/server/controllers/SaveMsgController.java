package com.example.server.controllers;

import com.example.server.models.SaveMessage;
import com.example.server.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class SaveMsgController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/savemessage")
    public SaveMessage saveMessage (@RequestBody SaveMessage saveMessage){
        System.out.println("triggered----");
        return messageService.saveMsg(saveMessage);
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/message")
//    public SaveMessage saveMessage (@RequestBody SaveMessage saveMessage){
//        System.out.println("triggered----");
//        return messageService.saveMsg(saveMessage);
//    }

}
