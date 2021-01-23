package com.sun.service;

import com.sun.bean.Sheng;
import com.sun.dao.ShengMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShengServiceImpl implements ShengService{
    @Autowired
    private ShengMapper shengMapper;


    public List<Sheng> queryForAll() {
        return shengMapper.queryForAll();
    }

    public List<Sheng> queryForName(String name) {
        return shengMapper.queryForName(name);
    }

    public List<Sheng> queryForPrice1() {
        return shengMapper.queryForPrice1();
    }

    public List<Sheng> queryForPrice2() {
        return shengMapper.queryForPrice2();
    }

    public List<Sheng> queryForPrice3() {
        return shengMapper.queryForPrice3();
    }

    public List<Sheng> queryForPrice4() {
        return shengMapper.queryForPrice4();
    }

    public List<Sheng> queryForOne(String one) {
        return shengMapper.queryForOne(one);
    }

    public List<Sheng> queryForTwo(String two) {
        return shengMapper.queryForTwo(two);
    }

    public List<Sheng> queryForThree(String three) {
        return shengMapper.queryForThree(three);
    }

    public List<Sheng> queryForFour(String four) {
        return shengMapper.queryForFour(four);
    }
}
