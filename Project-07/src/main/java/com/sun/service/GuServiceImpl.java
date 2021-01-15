package com.sun.service;

import com.sun.bean.Gu;
import com.sun.dao.GuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class GuServiceImpl  implements GuService{
    @Autowired
    private GuMapper guMapper;

    public List<Gu> queryForAll() {
        return guMapper.queryForAll();
    }

    public List<Gu> queryForName(String name) {
        return guMapper.queryForName(name);
    }

    public List<Gu> queryForPrice1() {
        return guMapper.queryForPrice1();
    }

    public List<Gu> queryForPrice2(Map<String, Object> map) {
        return guMapper.queryForPrice2(map);
    }

    public List<Gu> queryForPrice3() {
        return guMapper.queryForPrice3();
    }

    public List<Gu> queryForRong1() {
        return guMapper.queryForRong1();
    }

    public List<Gu> queryForRong2(Map<String, Object> map) {
        return guMapper.queryForRong2(map);
    }

    public List<Gu> queryForRong3() {
        return guMapper.queryForRong3();
    }

    public List<Gu> queryForLei(String lei) {
        return guMapper.queryForLei(lei);
    }
}
