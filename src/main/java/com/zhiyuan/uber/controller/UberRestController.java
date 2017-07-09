package com.zhiyuan.uber.controller;

import com.zhiyuan.uber.account.Account;
import com.zhiyuan.uber.domain.Message;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

//Controller(REST) File
@RestController
public class UberRestController {

    @Autowired
    private Account accountBean;

    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String welcome() {
        return "Hi Uber";
    }

    @RequestMapping(value = "/test/{userName}", method = RequestMethod.GET)
    public Message testMessage(@PathVariable String userName){
        return new Message(userName, "Hello " + userName);
    }

    @RequestMapping(value = "/account", method = RequestMethod.GET)
    public Account testAccount(){
        accountBean.setUsername("Zemin");
        return accountBean;
    }

}
