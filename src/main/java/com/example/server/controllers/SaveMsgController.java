package com.example.server.controllers;

import com.example.server.models.SaveMessage;
import com.example.server.services.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
@RequestMapping("/ssd")
public class SaveMsgController {

    @Autowired
    private MessageService messageService;

    @PostMapping("/savemessage")
    public SaveMessage saveMessage (@RequestBody SaveMessage saveMessage){
        System.out.println("triggered----" + saveMessage);
        return messageService.saveMsg(saveMessage);
    }

//    @RequestMapping(method = RequestMethod.POST, value = "/message")
//    public SaveMessage saveMessage (@RequestBody SaveMessage saveMessage){
//        System.out.println("triggered----");
//        return messageService.saveMsg(saveMessage);
//    }

}
