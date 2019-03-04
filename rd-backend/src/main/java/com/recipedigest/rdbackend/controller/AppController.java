package com.recipedigest.rdbackend.controller;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {

@RequestMapping("/buildinfo")
public Map<String,Integer> CalculateSize(){
    HashMap<String, Integer>  versionInfo= new HashMap<String,Integer>();
    versionInfo.put("RecipeDigest", 1);
    return  versionInfo;

}


}
