package com.xlinyu.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by gavin on 30/09/2016.
 */
@Controller
public class IndexController {

    @RequestMapping({"/", "/index", "/index"})
    public String index(){
        return "index";
    }

}
