package com.sun.service;

import com.sun.bean.Ying;

import java.util.List;

public interface YingService {
    public List<Ying> queryForAll();
    public List<Ying> queryForName(String name);
    public List<Ying> queryForPrice1();
    public List<Ying> queryForPrice2();
    public List<Ying> queryForPrice3();
    public List<Ying> queryForPrice4();
    public List<Ying> queryForRong1();
    public List<Ying> queryForRong2(int rong);
    public List<Ying> queryForRong3();
    public List<Ying> queryForHuan(String huan);
    public List<Ying> queryForZhuan(int zhuan);
    public List<Ying> queryForJie(String jie);
}
