package org.feidao.chapter51.controller;

import com.alibaba.fastjson.JSON;
import org.feidao.chapter51.common.RestResult;
import org.feidao.chapter51.model.Heroic;
import org.feidao.chapter51.service.RedisService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * Created by feidao on 2019-09-16.
 */
@RestController
@RequestMapping(value = "/redis")
public class RedisController {
    @Autowired
    private RedisService redisService;

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public String select() {
        return redisService.selectHeroic();
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam(value = "name") String name,
                      @RequestParam(value = "remarks") String remarks) {
        Heroic heroic = new Heroic();
        heroic.name = name;
        heroic.remarks = remarks;
        redisService.addHeroic(heroic);

        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("add success!");
        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete() {
        redisService.deleteHeroic();
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("delete success!");
        return JSON.toJSONString(restResult);
    }
}
