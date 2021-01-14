package com.sun.dao;

import com.sun.bean.Nei;

import java.util.List;

public interface NeiMapper {
    public List<Nei> queryForAll();
    public List<Nei> queryForName(String name);
    public List<Nei> queryForPrice1();
    public List<Nei> queryForPrice2();
    public List<Nei> queryForPrice3();
    public List<Nei> queryForPrice4();
    public List<Nei> queryForLei(String lei);
    public List<Nei> queryForTao(String tao);
    public List<Nei> queryForZhu1();
    public List<Nei> queryForZhu2(String zhu);
    public List<Nei> queryForZhu3();
}
