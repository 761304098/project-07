package com.sun.dao;

import com.sun.bean.Jian;
import com.sun.bean.Jian;

import java.util.List;

public interface JianMapper {
   public List<Jian> queryForAll();
   public List<Jian> queryForName(String name);
   public List<Jian> queryForPrice1();
   public List<Jian> queryForPrice2();
   public List<Jian> queryForPrice3();
   public List<Jian> queryForPrice4();
   public List<Jian> queryForOne(String one);
   public List<Jian> queryForTwo(String two);
   public List<Jian> queryForThree(String three);
   public List<Jian> queryForFour(String four);
}
