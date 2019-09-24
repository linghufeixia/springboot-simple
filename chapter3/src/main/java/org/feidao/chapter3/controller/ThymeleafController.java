package org.feidao.chapter3.controller;

import org.feidao.chapter3.model.Heroic;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by feidao on 2019-09-10.
 */
@Controller
public class ThymeleafController {

    /**
     * 显示笑傲江湖的主要英雄人物
     * @return
     */
    @GetMapping("/list")
    public ModelAndView list(){
        ModelAndView modelAndView = new ModelAndView();

        List<Heroic> heroicList = new ArrayList<>();
        heroicList.add(new Heroic(1,"令狐冲", "独孤九剑传人之一，华山派岳不群之徒。后被逐出师门。任盈盈之夫，结尾与妻子封剑退隐。"));
        heroicList.add(new Heroic(2,"任盈盈", "日月神教教主任我行之女，日月神教圣姑。令狐冲之妻，结尾与丈夫同退隐江湖。"));
        heroicList.add(new Heroic(3,"左冷禅", "五岳剑派盟主，嵩山派掌门，练得假辟邪剑法，为掀起武林风波祸首最后为令狐冲所杀。"));
        heroicList.add(new Heroic(4,"任我行", "日月神教教主，任盈盈之父。后因年老体衰，晕眩而逝。"));
        heroicList.add(new Heroic(5,"岳不群", "华山派掌门，后成为五岳派掌门，江湖人称“君子剑”，其实是个双面伪君子。最后误被仪琳杀死。"));
        heroicList.add(new Heroic(6,"东方不败", "日月神教教主，因练葵花宝典而自宫变成了太监。"));
        heroicList.add(new Heroic(7,"风清扬", "华山派剑宗，岳不群和宁中则之师叔。传授令狐冲独孤九剑之人。"));
        heroicList.add(new Heroic(8,"方证大师", "少林寺方丈。"));
        heroicList.add(new Heroic(9,"冲虚道长", "武当派掌门。"));

        modelAndView.addObject("list", heroicList);
        modelAndView.setViewName("list");
        return modelAndView;
    }



}
