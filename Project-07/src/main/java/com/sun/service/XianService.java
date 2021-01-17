package com.sun.service;

import com.sun.bean.Gu;
import com.sun.bean.Xian;

import java.util.List;
import java.util.Map;

public interface XianService {
    public List<Xian> queryForAll();
    public List<Xian> queryForName(String name);
    public List<Xian> queryForPrice1();
    public List<Xian> queryForPrice2(Map<String,Object> map);
    public List<Xian> queryForPrice3();
    public List<Xian> queryForRong(String rong);
    public List<Xian> queryForJie(String jie);

}
