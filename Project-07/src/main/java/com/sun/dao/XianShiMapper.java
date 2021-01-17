package com.sun.dao;

import com.sun.bean.XianShi;
import com.sun.bean.Ying;

import java.util.List;

public interface XianShiMapper {
    public List<XianShi> queryForAll();
    public List<XianShi> queryForName(String name);
    public List<XianShi> queryForPrice1();
    public List<XianShi> queryForPrice2();
    public List<XianShi> queryForPrice3();
    public List<XianShi> queryForPrice4();
    public List<XianShi> queryForChi1();
    public List<XianShi> queryForChi2();
    public List<XianShi> queryForChi3();
    public List<XianShi> queryForChi4();
    public List<XianShi> queryForChi5();
    public List<XianShi> queryForLei(String lei);
    public List<XianShi> queryForMian(String mian);
}
