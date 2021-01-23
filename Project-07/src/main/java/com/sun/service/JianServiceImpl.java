package com.sun.service;

import com.sun.bean.Jian;
import com.sun.dao.JianMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JianServiceImpl implements JianService{
    @Autowired
    private JianMapper jianMapper;
    public List<Jian> queryForAll() {
        return jianMapper.queryForAll();
    }

    public List<Jian> queryForName(String name) {
        return jianMapper.queryForName(name);
    }

    public List<Jian> queryForPrice1() {
        return jianMapper.queryForPrice1();
    }

    public List<Jian> queryForPrice2() {
        return jianMapper.queryForPrice2();
    }

    public List<Jian> queryForPrice3() {
        return jianMapper.queryForPrice3();
    }

    public List<Jian> queryForPrice4() {
        return jianMapper.queryForPrice4();
    }

    public List<Jian> queryForOne(String one) {
        return jianMapper.queryForOne(one);
    }

    public List<Jian> queryForTwo(String two) {
        return jianMapper.queryForTwo(two);
    }

    public List<Jian> queryForThree(String three) {
        return jianMapper.queryForThree(three);
    }

    public List<Jian> queryForFour(String four) {
        return jianMapper.queryForFour(four);
    }
}
