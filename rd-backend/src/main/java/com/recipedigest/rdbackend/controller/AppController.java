package com.recipedigest.rdbackend.controller;


import java.util.HashMap;
import java.util.Map;

@RestController
public class AppController {





public Map<String,Integer> CalculateSize(){
    HashMap<String, Integer>  versionInfo= new HashMap<String,Integer>();
    versionInfo.put("RecipeDigest", 1);
    return  versionInfo;

}






}
