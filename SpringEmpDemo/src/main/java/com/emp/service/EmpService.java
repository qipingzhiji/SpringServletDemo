package com.emp.service;

import com.emp.dao.EmployeesMapper;
import com.emp.entity.Employees;
import com.emp.entity.EmployeesExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * Created by zhang_htao on 2019/8/20.
 */
@Service
public class EmpService {

    @Autowired
    private EmployeesMapper employeesMapper;

    @Transactional(propagation = Propagation.REQUIRED)
    public List<Employees> selectAllEmps(){
        List<Employees> employees = employeesMapper.selectByExample(new EmployeesExample());
        return employees;
    }
}
