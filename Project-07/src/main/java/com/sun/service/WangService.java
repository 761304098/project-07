package com.sun.service;

import com.sun.bean.Wang;

import java.util.List;

public interface WangService {

    public List<Wang> queryForAll();
    public List<Wang> queryForName(String name);
    public List<Wang> queryForPrice1();
    public List<Wang> queryForPrice2();
    public List<Wang> queryForPrice3();
    public List<Wang> queryForPrice4();
    public List<Wang> queryForOne(String one);
    public List<Wang> queryForTwo(String two);
    public List<Wang> queryForThree(String three);
    public List<Wang> queryForFour(String four);
}
