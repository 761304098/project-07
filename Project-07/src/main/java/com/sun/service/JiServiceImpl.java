package com.sun.service;

import com.sun.bean.JiXiang;
import com.sun.dao.JiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class JiServiceImpl implements JiService {
     @Autowired
     private JiMapper jiMapper;
    public List<JiXiang> queryForAll() {
        return jiMapper.queryForAll();
    }

    public List<JiXiang> queryForName(String name) {
        return jiMapper.queryForName(name);
    }

    public List<JiXiang> queryForPrice1() {
        return jiMapper.queryForPrice1();
    }

    public List<JiXiang> queryForPrice2(Map<String, Object> map) {
        return jiMapper.queryForPrice2(map);
    }

    public List<JiXiang> queryForPrice3() {
        return jiMapper.queryForPrice3();
    }

    public List<JiXiang> queryForLei(String lei) {
        return jiMapper.queryForLei(lei);
    }
}
