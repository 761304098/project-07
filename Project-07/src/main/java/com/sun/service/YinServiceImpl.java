package com.sun.service;

import com.sun.bean.Yin;
import com.sun.dao.YinMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class YinServiceImpl implements YinService {
    @Autowired
    private YinMapper yinMapper;
    public List<Yin> queryForAll() {
        return yinMapper.queryForAll();
    }

    public List<Yin> queryForName(String name) {
        return yinMapper.queryForName(name);
    }

    public List<Yin> queryForPrice1() {
        return yinMapper.queryForPrice1();
    }

    public List<Yin> queryForPrice2() {
        return yinMapper.queryForPrice2();
    }

    public List<Yin> queryForPrice3() {
        return yinMapper.queryForPrice3();
    }

    public List<Yin> queryForPrice4() {
        return yinMapper.queryForPrice4();
    }

    public List<Yin> queryForOne(String one) {
        return yinMapper.queryForOne(one);
    }

    public List<Yin> queryForTwo(String two) {
        return yinMapper.queryForTwo(two);
    }

    public List<Yin> queryForThree(String three) {
        return yinMapper.queryForThree(three);
    }

    public List<Yin> queryForFour(String four) {
        return yinMapper.queryForFour(four);
    }
}
