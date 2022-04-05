package com.HotHashGames.website.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping
    public String displayIndexPage(){
        return "index";
    }

    @GetMapping("FatCatSplat")
    public String displayFatCatSplat(){
        return "FatCatSplat";
    }
}
