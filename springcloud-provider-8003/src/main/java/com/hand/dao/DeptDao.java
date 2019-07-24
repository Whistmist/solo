package com.hand.dao;

import com.hand.entities.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * Created by HuangHeng on 2019/7/24
 */
@Mapper
public interface DeptDao
{
     boolean addDept(Dept dept);

     Dept findById(Long id);

     List<Dept> findAll();
}
