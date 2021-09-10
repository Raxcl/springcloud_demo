package com.hand.springcloud.dao;

import com.hand.china.springcloud.entities.Emp;
import com.hand.china.springcloud.entities.He;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface EmpDao
{
    public boolean addEmp(Emp emp);

    public boolean UpdateEmp(Emp emp);


    public Emp findById(Long id);

    public List<He> findByDeptCode(String department_code);

    public List<Emp> findAll();


}