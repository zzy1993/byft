package com.zhiyuan.uber.controller;


import com.zhiyuan.uber.domain.Message;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UberRestController {

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Hi Uber";
    }

    @RequestMapping(value = "/hello/{userName}", method = RequestMethod.GET)
    public Message helloMessage(@PathVariable String userName){
        return new Message(userName, "Hello " + userName);
    }

}
