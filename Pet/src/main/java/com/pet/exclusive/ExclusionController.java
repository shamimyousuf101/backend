package com.pet.exclusive;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ExclusionController {

    @RequestMapping(value = "/exclusive", method = RequestMethod.GET)
    @ResponseBody
    public String exclusive(){

        return "exclusive";
    }
}
