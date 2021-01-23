package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Jian;
import com.sun.bean.Yin;
import com.sun.service.YinServiceImpl;
import com.sun.service.YingServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class YinController {
   @Autowired
    private YinServiceImpl yinService;

    @RequestMapping("/getYinAll")
    public String getYinAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForAll();
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinAll");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName1")
    public String getYinName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("惠威");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName1");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName2")
    public String getYinName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("BOSE");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName2");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName3")
    public String getYinName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("SONOS");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName3");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName4")
    public String getYinName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("漫步者");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName4");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName5")
    public String getYinName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("声擎");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName5");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName6")
    public String getYinName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("JBL");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName6");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName7")
    public String getYinName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("麦博");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName7");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinName8")
    public String getYinName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForName("爱国者");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinName8");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinPrice1")
    public String getYinPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForPrice1();
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinPrice1");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinPrice2")
    public String getYinPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForPrice2();
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinPrice2");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinPrice3")
    public String getYinPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForPrice3();
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinPrice3");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinPrice4")
    public String getYinPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForPrice4();
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinPrice4");
        return "/list/yinList.jsp";
    }

    @RequestMapping("/getYinOne1")
    public String getYinOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("电脑");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne1");
        return "/list/yinList.jsp";
    }

    @RequestMapping("/getYinOne2")
    public String getYinOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("HiFi");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne2");
        return "/list/yinList.jsp";
    }
    @RequestMapping("/getYinOne3")
    public String getYinOne3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("笔记本");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne3");
        return "/list/yinList.jsp";
    }

    @RequestMapping("/getYinOne4")
    public String getYinOne4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("苹果");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne4");
        return "/list/yinList.jsp";
    }

    @RequestMapping("/getYinOne5")
    public String getYinOne5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("电视");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne5");
        return "/list/yinList.jsp";
    }

    @RequestMapping("/getYinOne6")
    public String getYinOne6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("木质");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne6");
        return "/list/yinList.jsp";
    }


    @RequestMapping("/getYinOne7")
    public String getYinOne7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("金属");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne7");
        return "/list/yinList.jsp";
    }


    @RequestMapping("/getYinOne8")
    public String getYinOne8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Yin> yins = yinService.queryForOne("塑料");
        PageInfo page=new PageInfo(yins,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYinOne8");
        return "/list/yinList.jsp";
    }






}
