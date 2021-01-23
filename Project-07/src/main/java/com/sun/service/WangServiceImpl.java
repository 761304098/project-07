package com.sun.service;

import com.sun.bean.Wang;
import com.sun.dao.WangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class WangServiceImpl implements WangService{
    @Autowired
    private WangMapper wangMapper;

    public List<Wang> queryForAll() {
        return wangMapper.queryForAll();
    }

    public List<Wang> queryForName(String name) {
        return wangMapper.queryForName(name);
    }

    public List<Wang> queryForPrice1() {
        return wangMapper.queryForPrice1();
    }

    public List<Wang> queryForPrice2() {
        return wangMapper.queryForPrice2();
    }

    public List<Wang> queryForPrice3() {
        return wangMapper.queryForPrice3();
    }

    public List<Wang> queryForPrice4() {
        return wangMapper.queryForPrice4();
    }

    public List<Wang> queryForOne(String one) {
        return wangMapper.queryForOne(one);
    }

    public List<Wang> queryForTwo(String two) {
        return wangMapper.queryForTwo(two);
    }

    public List<Wang> queryForThree(String three) {
        return wangMapper.queryForThree(three);
    }

    public List<Wang> queryForFour(String four) {
        return wangMapper.queryForFour(four);
    }
}
