package com.hand.service;

import com.hand.entities.Dept;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/24
 */
public interface DeptService
{
     boolean add(Dept dept);

     Dept get(Long id);

     List<Dept> list();
}
