package com.hand.springcloud.service.impl;

import com.hand.china.springcloud.entities.Emp;
import com.hand.china.springcloud.entities.He;
import com.hand.springcloud.dao.EmpDao;
import com.hand.springcloud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmpServiceImpl implements EmpService
{
    @Autowired
    private EmpDao dao ;

    @Override
    public boolean add(Emp emp)
    {
        return dao.addEmp(emp);
    }

    @Override
    public boolean UpdateEmp(Emp emp){
        return dao.UpdateEmp(emp);
    }


    @Override
    public Emp get(Long id)
    {
        return dao.findById(id);
    }


    @Override
    public List<He> findByDeptCode(String department_code)
    {
        return dao.findByDeptCode(department_code);
    }

    @Override
    public List<Emp> list()
    {
        return dao.findAll();
    }
}