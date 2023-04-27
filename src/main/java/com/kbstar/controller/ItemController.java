package com.kbstar.controller;

import com.kbstar.dto.Item;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/item")
public class ItemController {


    @RequestMapping("")
    public String main(){
        return "index";
    }

    @RequestMapping("/tables")
    public String tables(Model model){
        List<Item> list = new ArrayList<>();
        list.add(new Item(100,"bear1",500,"a.jpg",new Date()));
        list.add(new Item(101,"bear2",500,"b.jpg",new Date()));
        list.add(new Item(102,"bear3",500,"c.jpg",new Date()));
        list.add(new Item(103,"bear4",500,"d.jpg",new Date()));
        list.add(new Item(104,"bear5",500,"e.jpg",new Date()));
        list.add(new Item(105,"bear6",500,"a.jpg",new Date()));
        list.add(new Item(106,"bear7",500,"b.jpg",new Date()));
        list.add(new Item(107,"bear8",500,"c.jpg",new Date()));
        list.add(new Item(108,"bear9",500,"d.jpg",new Date()));
        list.add(new Item(109,"bear10",500,"e.jpg",new Date()));
        list.add(new Item(110,"bear11",500,"a.jpg",new Date()));
        list.add(new Item(111,"bear12",500,"b.jpg",new Date()));
        list.add(new Item(112,"bear13",500,"c.jpg",new Date()));
        list.add(new Item(113,"bear14",500,"d.jpg",new Date()));
        list.add(new Item(114,"bear15",500,"e.jpg",new Date()));
        list.add(new Item(115,"bear16",500,"a.jpg",new Date()));
        list.add(new Item(116,"bear17",500,"b.jpg",new Date()));
        list.add(new Item(117,"bear18",500,"c.jpg",new Date()));
        list.add(new Item(118,"bear19",500,"d.jpg",new Date()));
        list.add(new Item(119,"bear20",500,"e.jpg",new Date()));
        model.addAttribute("allitem",list);

        model.addAttribute("center","tables");
        return "index";
    }

}

