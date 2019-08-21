package com.test.controller;

import com.test.entity.Animal;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.validation.Valid;
import java.util.Date;
import java.util.Map;

/**
 * Created by zhang_htao on 2019/8/17.
 */
@Controller
public class AnimalController {

    @RequestMapping(value = "/animal",method = RequestMethod.POST)
    public String getAnimal(@Valid Animal animal, BindingResult bindingResult){
        if(bindingResult.hasErrors()){
            bindingResult.getFieldErrors().forEach(e->{
                System.out.println(e.getField() + ":" + e.getDefaultMessage());
            });
        }
        System.out.println(animal);
        return "Hello";
    }


    @RequestMapping(value = "/testValidate",method = RequestMethod.POST)
    public String testValidate(@Valid Animal animal,BindingResult bindingResult,Map<String,Object> map){
        if(bindingResult.hasErrors()){
            map.put("animal",new Animal("adin",12,new Date()));
           return "index2";
        }
        System.out.println(animal);
        return "Hello";
    }
}
