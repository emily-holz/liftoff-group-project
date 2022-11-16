package org.liftoff.project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomePage {

    @RequestMapping(value="")
    public String index(){
        return "index";
    }
}
