package org.feidao.controller;

import org.feidao.starter.StartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by feidao on 2019-09-19.
 */
@RestController
@RequestMapping(value = "/starter")
public class WebController {

    @Autowired
    private StartService startService;

    @RequestMapping(value = "/print")
    public String print(){
        String str = startService.print();
        return str;
    }


}
