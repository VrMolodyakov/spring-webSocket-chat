package com.example.webSocketChat.Controller;

import com.example.webSocketChat.Messages.Message;
import com.example.webSocketChat.Messages.Name;
import org.springframework.messaging.handler.annotation.MessageMapping;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.messaging.handler.annotation.SendTo;
import org.springframework.stereotype.Controller;

@Controller
public class MessageController {

    @MessageMapping("/hello")
    @SendTo("/topic/chatting")
    public Message messageHandler(@Payload Name name) throws Exception{
        return new Message("Hello, " + name.getName() + " !");
    }
}
