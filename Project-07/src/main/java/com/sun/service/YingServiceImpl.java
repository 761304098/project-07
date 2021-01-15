package com.sun.service;

import com.sun.bean.Ying;
import com.sun.dao.YingMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class YingServiceImpl implements YingService{
    @Autowired
    private YingMapper yingMapper;
    public List<Ying> queryForAll() {
        return yingMapper.queryForAll();
    }

    public List<Ying> queryForName(String name) {
        return yingMapper.queryForName(name);
    }

    public List<Ying> queryForPrice1() {
        return yingMapper.queryForPrice1();
    }

    public List<Ying> queryForPrice2() {
        return yingMapper.queryForPrice2();
    }

    public List<Ying> queryForPrice3() {
        return yingMapper.queryForPrice3();
    }

    public List<Ying> queryForPrice4() {
        return yingMapper.queryForPrice4();
    }

    public List<Ying> queryForRong1() {
        return yingMapper.queryForRong1();
    }

    public List<Ying> queryForRong2(int rong) {
        return yingMapper.queryForRong2(rong);
    }

    public List<Ying> queryForRong3() {
        return yingMapper.queryForRong3();
    }

    public List<Ying> queryForHuan(String huan) {
        return yingMapper.queryForHuan(huan);
    }

    public List<Ying> queryForZhuan(int zhuan) {
        return yingMapper.queryForZhuan(zhuan);
    }

    public List<Ying> queryForJie(String jie) {
        return yingMapper.queryForJie(jie);
    }
}
