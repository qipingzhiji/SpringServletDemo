package com.emp.controller;

import com.emp.dao.DepartmentsMapper;
import com.emp.dao.EmployeesMapper;
import com.emp.entity.Departments;
import com.emp.entity.DepartmentsExample;
import com.emp.entity.Employees;
import com.emp.entity.EmployeesExample;
import org.omg.CORBA.OBJ_ADAPTER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

/**
 * Created by zhang_htao on 2019/8/19.
 */
@RestController
public class HelloController {

    @Autowired
    private DepartmentsMapper departmentsMapper;
    @Autowired
    private EmployeesMapper employeesMapper;

    @RequestMapping("hello")
    public Object hello(){
        return  "hello";
    }

    @RequestMapping("depts")
    public Object allDepts(){
        DepartmentsExample departmentsExample = new DepartmentsExample();

        List<Departments> departments = departmentsMapper.selectByExample(departmentsExample);

        return departments;
    }

    @RequestMapping("employees")
    public Object allEmployees(){
        EmployeesExample employeesExample = new EmployeesExample();
        List<Employees> employees = employeesMapper.selectByExample(employeesExample);
        return employees;
    }

    @RequestMapping("fileUpload")
    public Object fileUpload(@RequestParam("filename") MultipartFile filename){
        System.out.println(filename.getOriginalFilename());
        return "success";

    }
}
