package com.hand.springcloud.controller;

import com.hand.china.springcloud.entities.Emp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class EmpController_Consumer
{
    //private static final String REST_URL_PREFIX = "http://localhost:8001";
    private static final String REST_URL_PREFIX = "http://MICROSERVICE-DEPT";


    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping(value="/consumer/emp/add")
    public boolean add(Emp emp)
    {
        return restTemplate.postForObject(REST_URL_PREFIX+"/emp/add", emp, Boolean.class);
    }

    @RequestMapping(value="/consumer/emp/get/{id}")
    public Emp get(@PathVariable("id") Long id)
    {
            return restTemplate.getForObject(REST_URL_PREFIX+"/emp/get/"+id, Emp.class);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value="/consumer/emp/list")
    public List<Emp> list()
    {
        return restTemplate.getForObject(REST_URL_PREFIX+"/emp/list", List.class);
    }
}

