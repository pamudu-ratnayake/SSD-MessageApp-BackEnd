//package com.example.server.controllers;
//
//import com.example.server.models.ResponseDTO;
//import com.example.server.models.SaveMessage;
//import com.example.server.services.MessageService;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.http.MediaType;
//import org.springframework.web.bind.annotation.CrossOrigin;
//import org.springframework.web.bind.annotation.*;
//import org.springframework.web.bind.annotation.RequestMapping;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//@RequestMapping(path = "api", produces = MediaType.APPLICATION_JSON_VALUE)
//@CrossOrigin(origins = "http://localhost:3000")
//public class APIController {
//
//    @Autowired
//    private MessageService messageService;
//
//    @GetMapping(value = "/public")
//    public ResponseDTO publicEndpoint() {
//        return new ResponseDTO("All good. You DO NOT need to be authenticated to call /api/public.");
//    }
//
//    @GetMapping(value = "/private")
//    public ResponseDTO privateEndpoint() {
//        return new ResponseDTO("All good. You can see this because you are Authenticated.");
//    }
//
//    @GetMapping(value = "/private-scoped")
//    public ResponseDTO privateScopedEndpoint() {
//        return new ResponseDTO("All good. You can see this because you are Authenticated with a Token granted the 'read:messages' scope");
//    }
//
//    @PostMapping(value = "/savemessage")
//    public SaveMessage saveMessage (@RequestBody SaveMessage saveMessage){
//        System.out.println("triggered----");
//        return messageService.saveMsg(saveMessage);
//    }
//}
