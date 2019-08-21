package com.test.controller;

import com.test.entity.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.util.StringUtils;
import org.springframework.validation.BindingResult;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.Map;

/**
 * Created by zhang_htao on 2019/8/13.
 */
@Controller
@SessionAttributes({"user"})
public class TestController {

    @RequestMapping(value = "/test")
    public String test(){
        return "Hello";
    }

    @RequestMapping(value = "testSessionAttribute")
    public String testSessionAttribute(Map<String,Object> map){
        map.put("user",new User(1,"admin","13","adminhahaha"));
        return "Hello";
    }

   /* @ModelAttribute
    public void getUser(@RequestParam(value = "id",required = false) Integer id,Map<String,Object> map){
        if(!StringUtils.isEmpty(id)){
            User user = new User(1,"admin","13","adminhahaha");
            map.put("userInfo",user);
        }
    }*/

    @PutMapping("account")
    public String userUpdate(@ModelAttribute(value = "userInfo") User user, Model model, HttpServletRequest request,BindingResult bindingResult){
        if(bindingResult.getErrorCount()!=0){
            bindingResult.getFieldErrors().forEach(o->{
                System.out.println("111" + o.getField()+ ":"+o.getObjectName());
            });
        }
        model.addAttribute("userInfo",user);
        System.out.println(user.toString());
        return "Hello";
    }


    @RequestMapping("testView")
    public String testView(){
        return "viewResolver";
    }


    @RequestMapping("/convert")
    public String convert(@RequestParam("user") User user, BindingResult bindingResult){
        if(bindingResult.getErrorCount() != 0){
            List<ObjectError> allErrors = bindingResult.getAllErrors();
            allErrors.forEach(o->{
                System.out.println(o.toString());
            });
        }
        System.out.println(user);
        return "viewResolver";
    }


    /*@InitBinder
    public void initBinder(WebDataBinder webDataBinder){
        webDataBinder.setDisallowedFields("age");
    }*/
}
