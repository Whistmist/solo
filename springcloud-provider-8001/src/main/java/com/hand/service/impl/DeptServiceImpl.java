package com.hand.service.impl;

import com.hand.dao.DeptDao;
import com.hand.entities.Dept;
import com.hand.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/24
 */
@Service
public class DeptServiceImpl implements DeptService
{
    @Autowired
    private DeptDao dao;

    @Override
    public boolean add(Dept dept)
    {
        return dao.addDept(dept);
    }

    @Override
    public Dept get(Long id)
    {
        return dao.findById(id);
    }

    @Override
    public List<Dept> list()
    {
        return dao.findAll();
    }

}
