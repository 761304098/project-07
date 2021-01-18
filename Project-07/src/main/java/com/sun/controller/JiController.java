package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Gu;
import com.sun.bean.JiXiang;
import com.sun.bean.Nei;
import com.sun.service.JiServiceImpl;
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
public class JiController {
    @Autowired
    private JiServiceImpl jiService;

    @RequestMapping("/getJiAll")
    public String getJiAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForAll();
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiAll");
        return "/list/jiList.jsp";
    }

    @RequestMapping("/getJiName1")
    public String getJiName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("航嘉");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName1");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName2")
    public String getJiName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("鑫谷");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName2");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName3")
    public String getJiName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("aigo");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName3");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName4")
    public String getJiName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("金河田");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName4");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName5")
    public String getJiName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("先马");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName5");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName6")
    public String getJiName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("Tt");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName6");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName7")
    public String getJiName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("影驰");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName7");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiName8")
    public String getJiName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForName("九州风神");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiName8");
        return "/list/jiList.jsp";
    }

    @RequestMapping("/getJiPrice1")
    public String getJiPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForPrice1();
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiPrice1");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiPrice2")
    public String getJiPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",150);
        map.put("price2",200);
        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForPrice2(map);
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiPrice2");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiPrice3")
    public String getJiPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",200);
        map.put("price2",300);
        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForPrice2(map);
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiPrice3");
        return "/list/jiList.jsp";
    }

    @RequestMapping("/getJiPrice4")
    public String getJiPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForPrice3();
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiPrice4");
        return "/list/jiList.jsp";
    }

    @RequestMapping("/getJiLei1")
    public String getJiLei1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForLei("台式机");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiLei1");
        return "/list/jiList.jsp";
    }
    @RequestMapping("/getJiLei2")
    public String getJiLei2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForLei("游戏机箱");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiLei2");
        return "/list/jiList.jsp";
    }

    @RequestMapping("/getJiLei3")
    public String getJiLei3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<JiXiang> jiXiangs = jiService.queryForLei("服务器机箱");
        PageInfo page=new PageInfo(jiXiangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJiLei3");
        return "/list/jiList.jsp";
    }


}
