package org.feidao.chapter1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-09.
 */
@RestController
public class HelloWordController {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    public String index(){
        return "Hello Word!";
    }
}
