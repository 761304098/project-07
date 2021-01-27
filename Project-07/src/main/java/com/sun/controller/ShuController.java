package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.San;
import com.sun.bean.Shu;
import com.sun.service.ShuServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShuController {
   @Autowired
    private ShuServiceImpl shuService;

    @RequestMapping("/getShuAll")
    public String getShuAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForAll();
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuAll");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuName1")
    public String getShuName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("双飞燕");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName1");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuName2")
    public String getShuName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("雷柏");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName2");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuName3")
    public String getShuName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("海盗船");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName3");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuName4")
    public String getShuName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("达尔优");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName4");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuName5")
    public String getShuName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("富勒");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName5");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuName6")
    public String getShuName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("红火牛");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName6");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuName7")
    public String getShuName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("血手幽灵");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName7");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuName8")
    public String getShuName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForName("戴尔");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuName8");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuPrice1")
    public String getShuPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForPrice1();
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuPrice1");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuPrice2")
    public String getShuPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForPrice2();
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuPrice2");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuPrice3")
    public String getShuPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForPrice3();
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuPrice3");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuPrice4")
    public String getShuPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForPrice4();
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuPrice4");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuOne1")
    public String getShuOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("竞技游戏");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne1");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuOne2")
    public String getShuOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("商务舒适");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne2");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuOne3")
    public String getShuOne3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("经济实用");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne3");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuOne4")
    public String getShuOne4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("移动便携");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne4");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuOne5")
    public String getShuOne5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("时尚个性");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne5");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuOne6")
    public String getShuOne6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("有线");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne6");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuOne7")
    public String getShuOne7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("无线");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuOne7");
        return "/list/shuList.jsp";
    }

    @RequestMapping("/getShuTwo1")
    public String getShuTwo1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("USB");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuTwo1");
        return "/list/shuList.jsp";
    }
    @RequestMapping("/getShuTwo2")
    public String getShuTwo2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Shu> shus = shuService.queryForOne("PS/2");
        PageInfo page=new PageInfo(shus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShuTwo2");
        return "/list/shuList.jsp";
    }



}
