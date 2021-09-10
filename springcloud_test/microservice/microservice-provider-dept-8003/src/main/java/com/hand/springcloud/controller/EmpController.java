package com.hand.springcloud.controller;

import com.hand.china.springcloud.entities.Emp;
import com.hand.china.springcloud.entities.He;
import com.hand.springcloud.service.EmpService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EmpController {
    @Autowired
    private EmpService service;

    @RequestMapping(value = "/emp/add", method = RequestMethod.POST)
    public boolean add(@RequestBody Emp emp) {
        return service.add(emp);
    }

    @RequestMapping(value = "/emp/update", method = RequestMethod.POST)
    public boolean update(@RequestBody Emp emp) {
        return service.UpdateEmp(emp);
    }

    @RequestMapping(value = "/emp/get/{id}", method = RequestMethod.GET)
    public Emp get(@PathVariable("id") Long id) {
        return service.get(id);
    }

    @RequestMapping(value = "/emp/findByDeptCode/{department_code}", method = RequestMethod.GET)
    public List<He> findByDeptCode(@PathVariable("department_code") String department_code) {
        return service.findByDeptCode(department_code);
    }

    @RequestMapping(value = "/emp/list", method = RequestMethod.GET)
    public List<Emp> list() {
        return service.list();
    }

    @Autowired
    private DiscoveryClient client;

    @RequestMapping(value = "/emp/discovery", method = RequestMethod.GET)
    public Object discovery() {
        List<String> list = client.getServices();
        System.out.println("**********" + list);

        List<ServiceInstance> srvList = client.getInstances("MICROSERVICECLOUD-DEPT");
        for (ServiceInstance element : srvList) {
            System.out.println(element.getServiceId() + "\t" + element.getHost() + "\t" + element.getPort() + "\t"
                    + element.getUri());
        }
        return this.client;

    }
}

