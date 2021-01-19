package com.sun.service;

import com.sun.bean.Shu;
import com.sun.dao.ShuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class ShuServiceImpl implements ShuService{
    @Autowired
    private ShuMapper shuMapper;
    public List<Shu> queryForAll() {
        return shuMapper.queryForAll();
    }

    public List<Shu> queryForName(String name) {
        return shuMapper.queryForName(name);
    }

    public List<Shu> queryForPrice1() {
        return shuMapper.queryForPrice1();
    }

    public List<Shu> queryForPrice2() {
        return shuMapper.queryForPrice2();
    }

    public List<Shu> queryForPrice3() {
        return shuMapper.queryForPrice3();
    }

    public List<Shu> queryForPrice4() {
        return shuMapper.queryForPrice4();
    }

    public List<Shu> queryForOne(String one) {
        return shuMapper.queryForOne(one);
    }

    public List<Shu> queryForTwo(String two) {
        return shuMapper.queryForTwo(two);
    }
}
