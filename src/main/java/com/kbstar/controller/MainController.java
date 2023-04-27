package com.kbstar.controller;

import com.fasterxml.jackson.databind.jsonFormatVisitors.JsonArrayFormatVisitor;
import org.json.simple.JSONArray;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Random;

@Controller
public class MainController {
    @RequestMapping("")
    public String main(){
        return "index";
    }
    @RequestMapping("/index")
    public String index(Model model){
        model.addAttribute("center","dashboard");
        return "index";
    }
    @RequestMapping("/livechart")
    public String livechart(Model model){
        model.addAttribute("center","livechart");
        return "index";
    }



}
