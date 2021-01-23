package com.sun.dao;

import com.sun.bean.Sheng;

import java.util.List;

public interface ShengMapper {
   public List<Sheng> queryForAll();
   public List<Sheng> queryForName(String name);
   public List<Sheng> queryForPrice1();
   public List<Sheng> queryForPrice2();
   public List<Sheng> queryForPrice3();
   public List<Sheng> queryForPrice4();
   public List<Sheng> queryForOne(String one);
   public List<Sheng> queryForTwo(String two);
   public List<Sheng> queryForThree(String three);
   public List<Sheng> queryForFour(String four);
}
