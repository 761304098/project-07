package com.sun.dao;

import com.sun.bean.Cpu;
import com.sun.bean.zhuban;

import java.util.List;

public interface zhubanMapper {
    public List<zhuban> queryForAll();
    public List<zhuban> queryForName(String name);
    public List<zhuban> queryForPrice1();
    public List<zhuban> queryForPrice2();
    public List<zhuban> queryForPrice3();
    public List<zhuban> queryForGroup(String group);
    public List<zhuban> queryForSlot(String slot);
    public List<zhuban> queryForType(String type);
    public List<zhuban> queryForChip(String chip);

}
