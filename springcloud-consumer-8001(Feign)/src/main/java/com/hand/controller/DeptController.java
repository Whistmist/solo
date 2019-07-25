package com.hand.controller;

import com.hand.entities.Dept;
import com.hand.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/24
 */
@RestController
public class DeptController {

    @Autowired
    DeptClientService deptClientService;
    //private static final String REST_URL_PREFIX = "http://127.0.0.1:8001";
    private static final String REST_URL_PREFIX = "http://SPRINGCLOUD-PROVIDER-8001";


    @RequestMapping(value = "/consumer/dept/add")
    public boolean add(Dept dept)
    {
        return this.deptClientService.add(dept);
    }

    @RequestMapping(value = "/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id)
    {
        return this.deptClientService.get(id);
    }

    @SuppressWarnings("unchecked")
    @RequestMapping(value = "/consumer/dept/list")
    public List<Dept> list()
    {
        return this.deptClientService.list();
    }

}
