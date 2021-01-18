package com.sun.service;

import com.sun.bean.JiXiang;

import java.util.List;
import java.util.Map;

public interface JiService {
    public List<JiXiang> queryForAll();
    public List<JiXiang> queryForName(String name);
    public List<JiXiang> queryForPrice1();
    public List<JiXiang> queryForPrice2(Map<String,Object> map);
    public List<JiXiang> queryForPrice3();
    public List<JiXiang> queryForLei(String lei);
}
