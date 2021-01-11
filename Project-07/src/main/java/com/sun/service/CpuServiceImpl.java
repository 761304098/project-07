package com.sun.service;

import com.sun.bean.Cpu;
import com.sun.dao.CpuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CpuServiceImpl implements CpuService{
    @Autowired
    private CpuMapper cpuMapper;

    public List<Cpu> queryForCpu() {
        return cpuMapper.queryForCpu();
    }

    public List<Cpu> queryForBrand(String bread) {
        return cpuMapper.queryForBrand(bread);
    }

    public List<Cpu> queryForPrice1() {
        return cpuMapper.queryForPrice1();
    }

    public List<Cpu> queryForPrice2() {
        return cpuMapper.queryForPrice2();
    }

    public List<Cpu> queryForPrice3() {
        return cpuMapper.queryForPrice3();
    }

    public List<Cpu> queryForSeries(String series) {
        return cpuMapper.queryForSeries(series);
    }

    public List<Cpu> queryForSlot(String slot) {
        return cpuMapper.queryForSlot(slot);
    }

    public List<Cpu> queryForCore(String core) {
        return cpuMapper.queryForCore(core);
    }
}
