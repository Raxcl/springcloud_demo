package com.hand.china.springcloud.service;

import com.hand.china.springcloud.entities.Emp;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "MICROSERVICE-DEPT",fallbackFactory=EmpClientServiceFallbackFactory.class)
public interface EmpClientService
{
    @RequestMapping(value = "/emp/get/{id}",method = RequestMethod.GET)
    public Emp get(@PathVariable("id") long id);


    @RequestMapping(value = "/emp/list",method = RequestMethod.GET)
    public List<Emp> list();

    @RequestMapping(value = "/emp/add",method = RequestMethod.POST)
    public boolean add(Emp emp);
}

