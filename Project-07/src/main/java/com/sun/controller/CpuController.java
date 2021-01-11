package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Cpu;
import com.sun.service.CpuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class CpuController {
    @Autowired
    private CpuServiceImpl cpuService;

    @RequestMapping("/getCpuAll")
    public String getCpu (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        Map<String ,Object> map=new HashMap<String, Object>();
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCpu();
        PageInfo page=new PageInfo(cpus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuAll");
        return "/list/cpuList.jsp";
    }


    @RequestMapping("/getCpuBrandForIntel")
    public String getBrand (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForBrand("Intel");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuBrandForIntel");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuBrandForAmd")
    public String getBrand1 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForBrand("AMD");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuBrandForAmd");
        return "/list/cpuList.jsp";
    }
    /*------------------------cpu价格*/
    @RequestMapping("/getCpuPrice1")
    public String getBrand2 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForPrice1();
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuPrice1");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuPrice2")
    public String getBrand3 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForPrice2();
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuPrice2");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuPrice3")
    public String getBrand4 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForPrice3();
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuPrice3");
        return "/list/cpuList.jsp";
    }

 /*--------------------------------------cpu系列*/

    @RequestMapping("/getCpuSeriesFori9")
    public String getBrand5 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("酷睿i9");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesFori9");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesFori5")
    public String getBrand6 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("酷睿i5");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesFori5");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesFori3")
    public String getBrand7 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("酷睿i3");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesFori3");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForBen")
    public String getBrand8 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("奔腾");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForBen");
        return "/list/cpuList.jsp";
    }

    @RequestMapping("/getCpuSeriesForSai")
    public String getBrand9 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("赛扬");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForSai");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForXE")
    public String getBrand10 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("Xeon E");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForXE");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForRT")
    public String getBrand11 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("Ryzen Threadripper");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForRT");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForR9")
    public String getBrand12 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("Ryzen 9");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForR9");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForR7")
    public String getBrand13 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("Ryzen 7");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForR7");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForR5")
    public String getBrand14 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("Ryzen 5");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForR5");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForR3")
    public String getBrand15 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("Ryzen 3");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForR3");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSeriesForAPU")
    public String getBrand16 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSeries("APU");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSeriesForAPU");
        return "/list/cpuList.jsp";
    }

    @RequestMapping("/getCpuSlotForL1200")
    public String getBrand17 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("LGA1200");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForL1200");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForL2066")
    public String getBrand18 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("LGA2066");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForL2066");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForL1151")
    public String getBrand19 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("LGA1151");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForL1151");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForL1150")
    public String getBrand20 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("LGA1150");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForL1150");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForST4")
    public String getBrand21 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("SocketTR4");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForST4");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForSTX4")
    public String getBrand22 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("SocketsTRX4");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForSTX4");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForA4")
    public String getBrand23 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("SocketAM4");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForA4");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForF2")
    public String getBrand24 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForSlot("SocketFM2+");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForF2");
        return "/list/cpuList.jsp";
    }
    /*--------------------------core*/
    @RequestMapping("/getCpuSlotForC16")
    public String getBrand25 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("十六核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC16");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForC12")
    public String getBrand26 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("十二核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC12");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForC10")
    public String getBrand27 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("十核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC10");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForC8")
    public String getBrand28 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("八核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC8");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForC6")
    public String getBrand29 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("六核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC6");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForC4")
    public String getBrand30 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("四核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC4");
        return "/list/cpuList.jsp";
    }
    @RequestMapping("/getCpuSlotForC2")
    public String getBrand31 (@RequestParam(value="pn",defaultValue = "1") Integer pn ,HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<Cpu> cpus = cpuService.queryForCore("双核心");
        PageInfo page=new PageInfo(cpus,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getCpuSlotForC2");
        return "/list/cpuList.jsp";
    }

}

