package com.sun.service;

import com.sun.bean.Gu;
import com.sun.bean.Xian;
import com.sun.dao.XianMapper;
import org.omg.CORBA.PRIVATE_MEMBER;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class XianServiceImpl implements XianService {
    @Autowired
    private XianMapper xianMapper;
    public List<Xian> queryForAll() {
        return  xianMapper.queryForAll();

    }

    public List<Xian> queryForName(String name) {
        return xianMapper.queryForName(name);
    }

    public List<Xian> queryForPrice1() {
        return xianMapper.queryForPrice1();
    }

    public List<Xian> queryForPrice2(Map<String, Object> map) {
        return xianMapper.queryForPrice2(map);
    }

    public List<Xian> queryForPrice3() {
        return xianMapper.queryForPrice3();
    }

    public List<Xian> queryForRong(String rong) {
        return xianMapper.queryForRong(rong);
    }

    public List<Xian> queryForJie(String jie) {
        return xianMapper.queryForJie(jie);
    }


}
