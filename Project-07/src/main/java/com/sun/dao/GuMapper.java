package com.sun.dao;

import com.sun.bean.Gu;
import com.sun.bean.Ying;

import java.util.List;
import java.util.Map;

public interface GuMapper {
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
