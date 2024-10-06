package com.mysite.sbbmybatis;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping("/messages")
public class MessageController {
    @Autowired
    private MessageService messageService;
    
    @GetMapping("/{id}")
    @ResponseBody
    public Message getMessage(@PathVariable("id") Integer id) {
        return messageService.getMessage(id);
    }

    @GetMapping("/create")
    public String create() {
        return "create-message";
    }

    @GetMapping("/api")
    @ResponseBody
    public List<Message> getMessagesLimit10() {
        return messageService.getMessagesLimit10();
    }
}
