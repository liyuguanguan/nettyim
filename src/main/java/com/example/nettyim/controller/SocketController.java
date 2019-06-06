package com.example.nettyim.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Author: liyu.guan
 * @Date: 2019/6/5 下午4:03
 */
@Controller
public class SocketController {
//
//    @RequestMapping("socket")
//    public ModelAndView socket(){
//        ModelAndView modelAndView = new ModelAndView();
//        modelAndView.setViewName("websocketserver");
//        return modelAndView;
//    }

    @RequestMapping("socket")
    public String socket(){
        return "websocketserver";
    }

}
