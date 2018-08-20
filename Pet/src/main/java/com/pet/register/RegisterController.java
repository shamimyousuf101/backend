package com.pet.register;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RegisterController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    @ResponseBody
    public String register(){

        return "hello register";
    }
}
