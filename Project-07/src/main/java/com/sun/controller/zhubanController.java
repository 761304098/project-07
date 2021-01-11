package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Cpu;
import com.sun.bean.zhuban;
import com.sun.service.zhubanService;
import com.sun.service.zhubanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class zhubanController {
    @Autowired
    private zhubanServiceImpl zhubanService;

    @RequestMapping("/getzhuAll")
    public String getzhuAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForAll();
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuAll");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName1")
    public String getzhuAll1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("华硕");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName1");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName2")
    public String getzhuAll2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("技嘉");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName2");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName3")
    public String getzhuAll3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("微星");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName3");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName4")
    public String getzhuAll4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("七彩虹");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName4");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName5")
    public String getzhuAll5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("映泰");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName5");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName6")
    public String getzhuAll6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("铭瑄");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName6");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName7")
    public String getzhuAll7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("梅捷");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName7");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuName8")
    public String getzhuAll8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForName("昂达");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuName8");
        return "/list/zhuList.jsp";
    }

    @RequestMapping("/getzhuPrice1")
    public String getzhuPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForPrice1();
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuPrice1");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuPrice2")
    public String getzhuPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForPrice2();
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuPrice2");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuPrice3")
    public String getzhuPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForPrice3();
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuPrice3");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuGroup1")
    public String getzhuGroup1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForGroup("Intel");
        PageInfo page=new PageInfo(zhubans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuGroup1");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuGroup2")
    public String getzhuGroup2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForGroup("AMD");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuGroup2");
        return "/list/zhuList.jsp";
    }

    @RequestMapping("/getzhuSlot1")
    public String getzhuSlot1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("LGA 1200");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot1");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot2")
    public String getzhuSlot2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("LGA 2066");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot2");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot3")
    public String getzhuSlot3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("LGA 1155");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot3");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot4")
    public String getzhuSlot4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("LGA 1151");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot4");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot5")
    public String getzhuSlot5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("LGA 1150");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot5");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot6")
    public String getzhuSlot6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("Socket TR4");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot6");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot7")
    public String getzhuSlot7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("Sockets TRX4");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot7");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot8")
    public String getzhuSlot8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("Socket AM4");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot8");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuSlot9")
    public String getzhuSlot9 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForSlot("Socket FM2+");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuSlot9");
        return "/list/zhuList.jsp";
    }

    @RequestMapping("/getzhuType1")
    public String getzhuType1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForType("ATX板型");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuType1");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuType2")
    public String getzhuType2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForType("Micro ATX板型");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuType2");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuType3")
    public String getzhuType3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForType("Mini-ITX板型");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuType3");
        return "/list/zhuList.jsp";
    }
    @RequestMapping("/getzhuType4")
    public String getzhuType4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForType("E-ATX板型");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuType4");
        return "/list/zhuList.jsp";
    }

    @RequestMapping("/getzhuChip1")
    public String getzhuChip1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForChip("显卡/声卡/网卡");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuChip1");
        return "/list/zhuList.jsp";
    }

    @RequestMapping("/getzhuChip2")
    public String getzhuChip2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        PageHelper.startPage(pn,3);
        List<zhuban> zhubans = zhubanService.queryForChip("声卡/网卡");
        PageInfo page=new PageInfo(zhubans,4);
        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getzhuChip2");
        return "/list/zhuList.jsp";
    }





}
