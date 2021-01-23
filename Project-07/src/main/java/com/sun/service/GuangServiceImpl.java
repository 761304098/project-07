package com.sun.service;

import com.sun.bean.Guang;
import com.sun.dao.GuangMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class GuangServiceImpl implements GuangService{
    @Autowired
    private GuangMapper guangMapper;
    public List<Guang> queryForAll() {
        return guangMapper.queryForAll();
    }

    public List<Guang> queryForName(String name) {
        return guangMapper.queryForName(name);
    }

    public List<Guang> queryForPrice1() {
        return guangMapper.queryForPrice1();
    }

    public List<Guang> queryForPrice2() {
        return guangMapper.queryForPrice2();
    }

    public List<Guang> queryForPrice3() {
        return guangMapper.queryForPrice3();
    }

    public List<Guang> queryForPrice4() {
        return guangMapper.queryForPrice4();
    }

    public List<Guang> queryForOne(String one) {
        return guangMapper.queryForOne(one);
    }

    public List<Guang> queryForTwo(String two) {
        return guangMapper.queryForTwo(two);
    }

    public List<Guang> queryForThree(String three) {
        return guangMapper.queryForThree(three);
    }

    public List<Guang> queryForFour(String four) {
        return guangMapper.queryForFour(four);
    }
}
