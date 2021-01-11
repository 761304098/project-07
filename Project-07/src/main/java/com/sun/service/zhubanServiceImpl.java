package com.sun.service;

import com.sun.bean.zhuban;
import com.sun.dao.zhubanMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class zhubanServiceImpl  implements zhubanService{
    @Autowired
    private zhubanMapper zhubanMapper;
    public List<zhuban> queryForAll() {
        return  zhubanMapper.queryForAll();
    }

    public List<zhuban> queryForName(String name) {
        return zhubanMapper.queryForName(name);
    }

    public List<zhuban> queryForPrice1() {
        return zhubanMapper.queryForPrice1();
    }

    public List<zhuban> queryForPrice2() {
        return zhubanMapper.queryForPrice2();
    }

    public List<zhuban> queryForPrice3() {
        return zhubanMapper.queryForPrice3();
    }

    public List<zhuban> queryForGroup(String group) {
        return zhubanMapper.queryForGroup(group);
    }

    public List<zhuban> queryForSlot(String slot) {
        return zhubanMapper.queryForSlot(slot);
    }

    public List<zhuban> queryForType(String type) {
        return zhubanMapper.queryForType(type);
    }

    public List<zhuban> queryForChip(String chip) {
        return zhubanMapper.queryForChip(chip);
    }

}
