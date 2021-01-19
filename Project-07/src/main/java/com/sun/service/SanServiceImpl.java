package com.sun.service;

import com.sun.bean.San;
import com.sun.dao.SanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SanServiceImpl implements SanService{
    @Autowired
    private SanMapper sanMapper;
    public List<San> queryForAll() {
        return sanMapper.queryForAll();
    }

    public List<San> queryForName(String name) {
        return  sanMapper.queryForName(name);
    }

    public List<San> queryForPrice1() {
        return sanMapper.queryForPrice1();
    }

    public List<San> queryForPrice2() {
        return sanMapper.queryForPrice2();
    }

    public List<San> queryForPrice3() {
        return sanMapper.queryForPrice3();
    }

    public List<San> queryForPrice4() {
        return sanMapper.queryForPrice4();
    }

    public List<San> queryForOne(String one) {
        return sanMapper.queryForOne(one);
    }

    public List<San> queryForTwo(String two) {
        return sanMapper.queryForTwo(two);
    }
}
