package com.sun.service;

import com.sun.bean.Dian;
import com.sun.dao.DianMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class DianServiceImpl implements DianService {
    @Autowired
    private DianMapper dianMapper;

    public List<Dian> queryForAll() {
        return dianMapper.queryForAll();
    }

    public List<Dian> queryForName(String name) {
        return dianMapper.queryForName(name);
    }

    public List<Dian> queryForPrice1() {
        return dianMapper.queryForPrice1();
    }

    public List<Dian> queryForPrice2(Map<String, Object> map) {
        return dianMapper.queryForPrice2(map);
    }

    public List<Dian> queryForPrice3() {
        return dianMapper.queryForPrice3();
    }

    public List<Dian> queryForGong1() {
        return dianMapper.queryForGong1();
    }

    public List<Dian> queryForGong2(Map<String, Object> map) {
        return dianMapper.queryForGong2(map);
    }

    public List<Dian> queryForGong3() {
        return dianMapper.queryForGong3();
    }

    public List<Dian> queryForThree(String three) {
        return dianMapper.queryForThree(three);
    }
}
