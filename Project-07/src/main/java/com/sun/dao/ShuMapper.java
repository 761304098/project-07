package com.sun.dao;

import com.sun.bean.San;
import com.sun.bean.Shu;

import java.util.List;

public interface ShuMapper {
   public List<Shu> queryForAll();
   public List<Shu> queryForName(String name);
   public List<Shu> queryForPrice1();
   public List<Shu> queryForPrice2();
   public List<Shu> queryForPrice3();
   public List<Shu> queryForPrice4();
   public List<Shu> queryForOne(String one);
   public List<Shu> queryForTwo(String two);
}
