package com.sun.service;

import com.sun.bean.Cpu;

import java.util.List;
import java.util.Map;

public interface CpuService {
    public List<Cpu> queryForCpu();
    public List<Cpu> queryForBrand(String bread);
    public List<Cpu> queryForPrice1();
    public List<Cpu> queryForPrice2();
    public List<Cpu> queryForPrice3();
    public List<Cpu> queryForSeries(String series);
    public List<Cpu> queryForSlot(String slot);
    public List<Cpu> queryForCore(String core);
}
