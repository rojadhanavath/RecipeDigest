package com.recipedigest.rdbackend.controller;


import com.fasterxml.jackson.databind.util.JSONPObject;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;


import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

//should takes a keyword and return the JSON Output- Data-Steps

@RestController
public class RecipeController {


    @RequestMapping("/GetRecipe")
    public Map<String, String> generateRecipe(@RequestParam(value = "name", defaultValue = "simpleRecipe") String name){
        StringBuffer result = new StringBuffer();
        TreeMap<String,String> storage = new TreeMap<String,String>();

          storage.put("Step3", "chop everything");
          storage.put("Step4", "Mix everything" );
          storage.put("Step5", "Enjoy your dinner" );
          storage.put("Step1", "Heat the pan, add oil");
          storage.put("Step2","Take 2 eggs, onions, tomatoes" );


          for(Map.Entry<String,String> entry: storage.entrySet()){
              if(!storage.isEmpty()){
               String key = entry.getKey();
               result.append(entry.getValue());
              }
          }
          return storage;
    }
}
