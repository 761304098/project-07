package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Nei;
import com.sun.bean.San;
import com.sun.service.SanServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class SanController {
   @Autowired
    private SanServiceImpl sanService;
    @RequestMapping("/getSanAll")
    public String getSanAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForAll();
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanAll");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanName1")
    public String getSanName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("超频三");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName1");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName2")
    public String getSanName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("九州风神");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName2");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName3")
    public String getSanName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("Tt");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName3");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName4")
    public String getSanName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("NZXT");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName4");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName5")
    public String getSanName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("安钛克");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName5");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName6")
    public String getSanName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("酷冷至尊");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName6");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName7")
    public String getSanName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("雷神");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName7");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanName8")
    public String getSanName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForName("华硕");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanName8");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanPrice1")
    public String getSanPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForPrice1();
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanPrice1");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanPrice2")
    public String getSanPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForPrice2();
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanPrice2");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanPrice3")
    public String getSanPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForPrice3();
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanPrice3");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanPrice4")
    public String getSanPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForPrice1();
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanPrice4");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanOne1")
    public String getSanOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForOne("CPU");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanOne1");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanOne2")
    public String getSanOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForOne("笔记本");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanOne2");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanOne3")
    public String getSanOne3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForOne("显卡");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanOne3");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanOne4")
    public String getSanOne4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForOne("水冷");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanOne4");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanOne5")
    public String getSanOne5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForOne("风扇");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanOne5");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanTwo1")
    public String getSanTwo1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForTwo("水冷");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanTwo1");
        return "/list/sanList.jsp";
    }
    @RequestMapping("/getSanTwo2")
    public String getSanTwo2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForTwo("风冷");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanTwo2");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanTwo3")
    public String getSanTwo3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForTwo("热管");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanTwo3");
        return "/list/sanList.jsp";
    }

    @RequestMapping("/getSanTwo4")
    public String getSanTwo4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<San> sans = sanService.queryForTwo("散热片");
        PageInfo page=new PageInfo(sans,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getSanTwo4");
        return "/list/sanList.jsp";
    }






}
