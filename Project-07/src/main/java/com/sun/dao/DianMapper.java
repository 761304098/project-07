package com.sun.dao;

import com.sun.bean.Dian;
import com.sun.bean.Gu;

import java.util.List;
import java.util.Map;

public interface DianMapper {
      public List<Dian> queryForAll();
      public List<Dian> queryForName(String name);
    public List<Dian> queryForPrice1();
    public List<Dian> queryForPrice2(Map<String,Object> map);
    public List<Dian> queryForPrice3();
    public List<Dian> queryForGong1();
    public List<Dian> queryForGong2(Map<String,Object> map);
    public List<Dian> queryForGong3();
    public List<Dian> queryForThree(String three);
 }
