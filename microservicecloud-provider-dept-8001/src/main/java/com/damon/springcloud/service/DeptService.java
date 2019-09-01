package com.damon.springcloud.service;

import com.damon.springcloud.entities.Dept;

import java.util.List;

public interface DeptService {
    boolean add(Dept dept);
    Dept get(long id);
    List<Dept> list();
}
