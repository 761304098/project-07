package com.sun.dao;

import com.sun.bean.Yin;

import java.util.List;

public interface YinMapper {
   public List<Yin> queryForAll();
   public List<Yin> queryForName(String name);
   public List<Yin> queryForPrice1();
   public List<Yin> queryForPrice2();
   public List<Yin> queryForPrice3();
   public List<Yin> queryForPrice4();
   public List<Yin> queryForOne(String one);
   public List<Yin> queryForTwo(String two);
   public List<Yin> queryForThree(String three);
   public List<Yin> queryForFour(String four);
}
