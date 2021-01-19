package com.sun.dao;

import com.sun.bean.Nei;
import com.sun.bean.San;

import java.util.List;

public interface SanMapper {
   public List<San> queryForAll();
   public List<San> queryForName(String name);
   public List<San> queryForPrice1();
   public List<San> queryForPrice2();
   public List<San> queryForPrice3();
   public List<San> queryForPrice4();
   public List<San> queryForOne(String one);
   public List<San> queryForTwo(String two);
}
