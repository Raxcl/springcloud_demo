package com.hand.springcloud.service;

import com.hand.china.springcloud.entities.Duo;
import com.hand.china.springcloud.entities.Emp;
import com.hand.china.springcloud.entities.He;

import java.util.List;

public interface EmpService
{
    public boolean add(Emp emp);
    public Emp    get(Long id);
    public List<He> findByDeptCode(String department_code);
    public List<Emp> list();
    public boolean UpdateEmp(Emp emp);

}