package com.sun.service;

import com.sun.bean.Gu;

import java.util.List;
import java.util.Map;

public interface GuService {
    public List<Gu> queryForAll();
    public List<Gu> queryForName(String name);
    public List<Gu> queryForPrice1();
    public List<Gu> queryForPrice2(Map<String,Object> map);
    public List<Gu> queryForPrice3();
    public List<Gu> queryForRong1();
    public List<Gu> queryForRong2(Map<String,Object> map);
    public List<Gu> queryForRong3();
    public List<Gu> queryForLei(String lei);
}
