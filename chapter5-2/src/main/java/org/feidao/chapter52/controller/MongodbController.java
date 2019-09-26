package org.feidao.chapter52.controller;

import com.alibaba.fastjson.JSON;
import org.feidao.chapter52.common.RestResult;
import org.feidao.chapter52.model.Heroic;
import org.feidao.chapter52.service.MongodbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by feidao on 2019-09-17.
 */
@RestController
@RequestMapping(value = "/mongodb")
public class MongodbController {
    @Autowired
    private MongodbService mongodbService;

    @RequestMapping(value = "/select", method = RequestMethod.POST)
    public String select() {
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        List<Heroic> heroicList = mongodbService.findAll();
        if(null == heroicList || heroicList.size() == 0 ){
            restResult.setMsg("null ");
        }else{
            restResult.setData(heroicList);
        }

        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/selectByName", method = RequestMethod.POST)
    public String selectByName(@RequestParam(value = "name") String name) {
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        Heroic heroic = mongodbService.findHeroicByName(name);
        restResult.setData(heroic);
        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@RequestParam(value = "id") String id,
                      @RequestParam(value = "name") String name,
                      @RequestParam(value = "remarks") String remarks) {
        Heroic heroic = new Heroic();
        int iId = 0;
        try {
            iId = Integer.parseInt(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        heroic.id = iId;
        heroic.name = name;
        heroic.remarks = remarks;
        mongodbService.addHeroic(heroic);

        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("add success!");
        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/delete", method = RequestMethod.DELETE)
    public String delete(@RequestParam(value = "id") String id) {
        int iId = 0;
        try {
            iId = Integer.parseInt(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        mongodbService.deleteHeroic(iId);
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("delete success!");
        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/update", method = RequestMethod.POST)
    public String update(@RequestParam(value = "id") String id,
                      @RequestParam(value = "name") String name,
                      @RequestParam(value = "remarks") String remarks) {

        Heroic heroic = new Heroic();
        int iId = 0;
        try {
            iId = Integer.parseInt(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        heroic.id = iId;
        heroic.name = name;
        heroic.remarks = remarks;
        mongodbService.updateHeroic(heroic);

        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("update success!");
        return JSON.toJSONString(restResult);
    }
}
