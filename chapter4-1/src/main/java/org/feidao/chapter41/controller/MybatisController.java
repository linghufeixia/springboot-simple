package org.feidao.chapter41.controller;

import com.alibaba.fastjson.JSON;
import org.feidao.chapter41.common.RestResult;
import org.feidao.chapter41.model.Heroic;
import org.feidao.chapter41.service.MybatisService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by feidao on 2019-09-10.
 */
@RestController
@RequestMapping(value = "/mybatis")
public class MybatisController {
    @Autowired
    private MybatisService mybatisService;

    @RequestMapping(value = "/select")
    public String select(){
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        List<Heroic> heroicList = mybatisService.findList();
        if(null == heroicList || heroicList.size() == 0 ){
            restResult.setMsg("null ");
        }else{
            restResult.setData(heroicList);
        }

        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/add")
    public String add(@RequestParam(value = "name") String name,
                      @RequestParam(value = "remarks") String remarks){
        Heroic heroic = new Heroic();
        heroic.name = name;
        heroic.remarks = remarks;
        mybatisService.insertHeroic(heroic);

        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("add success!");
        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/delete")
    public String delete(@RequestParam(value = "id") String id ){
        int iId = 0;
        try {
            iId = Integer.parseInt(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        mybatisService.deleteHeroic(iId);
        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("delete success!");
        return JSON.toJSONString(restResult);
    }

    @RequestMapping(value = "/update")
    public String update(@RequestParam(value = "id") String id,
                       @RequestParam(value = "name") String name,
                       @RequestParam(value = "remarks") String remarks){
        int iId = 0;
        try {
            iId = Integer.parseInt(id);
        }catch (Exception e){
            e.printStackTrace();
        }
        Heroic heroic = new Heroic();
        heroic.id = iId;
        heroic.name = name;
        heroic.remarks = remarks;
        mybatisService.updateHeroic(heroic);


        RestResult restResult = new RestResult();
        restResult.setCode(200);
        restResult.setMsg("edit success!");
        return JSON.toJSONString(restResult);
    }


}
