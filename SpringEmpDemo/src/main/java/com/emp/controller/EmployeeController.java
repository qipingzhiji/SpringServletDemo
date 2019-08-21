package com.emp.controller;

import com.emp.entity.Employees;
import com.emp.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.jws.WebParam;
import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhang_htao on 2019/8/20.
 */
@Controller
public class EmployeeController {
    @Autowired
    private EmpService empService;

    @RequestMapping(value = "emps",method = RequestMethod.GET)
    public  String emps(Map<String,Object> maps){
        List<Employees> employees = empService.selectAllEmps();
        maps.put("employees",employees);
        return "emps";
    }

    @RequestMapping("fileDownload")
    public ResponseEntity<byte[]> fileDownload(HttpServletRequest request)throws Exception{
        HttpSession session = request.getSession();
        ServletContext servletContext = session.getServletContext();
        InputStream resourceAsStream = servletContext.getResourceAsStream("WEB-INF/file/demo.txt");
        byte[] body = new byte[resourceAsStream.available()];
        resourceAsStream.read(body);
        HttpHeaders headers = new HttpHeaders();
        headers.add("Content-Disposition", "attachment;filename=abc.txt");
        headers.setContentType(MediaType.APPLICATION_OCTET_STREAM);
        HttpStatus httpStatus = HttpStatus.OK;
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<byte[]>(body,headers,httpStatus);
        return responseEntity;
    }
}
