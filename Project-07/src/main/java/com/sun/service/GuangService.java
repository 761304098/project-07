package com.sun.service;

import com.sun.bean.Guang;

import java.util.List;

public interface GuangService {
    public List<Guang> queryForAll();
    public List<Guang> queryForName(String name);
    public List<Guang> queryForPrice1();
    public List<Guang> queryForPrice2();
    public List<Guang> queryForPrice3();
    public List<Guang> queryForPrice4();
    public List<Guang> queryForOne(String one);
    public List<Guang> queryForTwo(String two);
    public List<Guang> queryForThree(String three);
    public List<Guang> queryForFour(String four);
}
