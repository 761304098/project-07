package com.sun.service;

import com.sun.bean.Nei;
import com.sun.dao.NeiMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class NeiServiceImpl implements NeiService{
    @Autowired
    private NeiMapper neiMapper;

    public List<Nei> queryForAll() {
        return neiMapper.queryForAll();
    }

    public List<Nei> queryForName(String name) {
        return neiMapper.queryForName(name);
    }

    public List<Nei> queryForPrice1() {
        return neiMapper.queryForPrice1();
    }

    public List<Nei> queryForPrice2() {
        return neiMapper.queryForPrice2();
    }

    public List<Nei> queryForPrice3() {
        return neiMapper.queryForPrice3();
    }

    public List<Nei> queryForPrice4() {
        return neiMapper.queryForPrice4();
    }

    public List<Nei> queryForLei(String lei) {
        return neiMapper.queryForLei(lei);
    }

    public List<Nei> queryForTao(String tao) {
        return neiMapper.queryForTao(tao);
    }

    public List<Nei> queryForZhu1() {
        return neiMapper.queryForZhu1();
    }

    public List<Nei> queryForZhu2(String zhu) {
        return neiMapper.queryForZhu2(zhu);
    }

    public List<Nei> queryForZhu3() {
        return neiMapper.queryForZhu3();
    }
}
