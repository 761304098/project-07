package com.sun.service;

import com.sun.bean.XianShi;
import com.sun.dao.XianShiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class XianShiServiceImpl implements XianShiService{
     @Autowired
     private XianShiMapper xianShiMapper;
    public List<XianShi> queryForAll() {
        return xianShiMapper.queryForAll() ;
    }

    public List<XianShi> queryForName(String name) {
        return  xianShiMapper.queryForName(name);
    }

    public List<XianShi> queryForPrice1() {
        return xianShiMapper.queryForPrice1();
    }

    public List<XianShi> queryForPrice2() {
        return xianShiMapper.queryForPrice2();
    }

    public List<XianShi> queryForPrice3() {
        return xianShiMapper.queryForPrice3();
    }

    public List<XianShi> queryForPrice4() {
        return xianShiMapper.queryForPrice4();
    }

    public List<XianShi> queryForChi1() {
        return xianShiMapper.queryForChi1();
    }

    public List<XianShi> queryForChi2() {
        return xianShiMapper.queryForChi2();
    }

    public List<XianShi> queryForChi3() {
        return xianShiMapper.queryForChi3();
    }

    public List<XianShi> queryForChi4() {
        return xianShiMapper.queryForChi4();
    }

    public List<XianShi> queryForChi5() {
        return xianShiMapper.queryForChi5();
    }

    public List<XianShi> queryForLei(String lei) {
        return xianShiMapper.queryForLei(lei);
    }

    public List<XianShi> queryForMian(String mian) {
        return xianShiMapper.queryForMian(mian);
    }
}
