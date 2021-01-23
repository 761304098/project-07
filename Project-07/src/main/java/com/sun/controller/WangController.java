package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Shu;
import com.sun.bean.Wang;
import com.sun.service.WangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class WangController {
   @Autowired
    private WangServiceImpl wangService;

    @RequestMapping("/getWangAll")
    public String getWangAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForAll();
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangAll");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName1")
    public String getWangName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("Winyao");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName1");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName2")
    public String getWangName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("Mellanox");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName2");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName3")
    public String getWangName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("Intel");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName3");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName4")
    public String getWangName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("光润通");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName4");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName5")
    public String getWangName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("TP-LINK");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName5");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName6")
    public String getWangName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("磊科");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName6");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName7")
    public String getWangName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("腾达");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName7");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangName8")
    public String getWangName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForName("联想");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangName8");
        return "/list/wangList.jsp";
    }

    @RequestMapping("/getWangPrice1")
    public String getWangPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForPrice1();
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangPrice1");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangPrice2")
    public String getWangPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForPrice2();
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangPrice2");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangPrice3")
    public String getWangPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForPrice3();
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangPrice3");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangPrice4")
    public String getWangPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForPrice4();
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangPrice4");
        return "/list/wangList.jsp";
    }

    @RequestMapping("/getWangOne1")
    public String getWangOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForOne("以太网");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangOne1");
        return "/list/wangList.jsp";
    }

    @RequestMapping("/getWangOne2")
    public String getWangOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForOne("快速以太网");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangOne2");
        return "/list/wangList.jsp";
    }


    @RequestMapping("/getWangOne3")
    public String getWangOne3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForOne("千兆以太网");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangOne3");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangOne4")
    public String getWangOne4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForOne("万兆以太网");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangOne4");
        return "/list/wangList.jsp";
    }


    @RequestMapping("/getWangTwo1")
    public String getWangTwo1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForTwo("RJ45");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangTwo1");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangTwo2")
    public String getWangTwo2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForTwo("光纤");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangTwo2");
        return "/list/wangList.jsp";
    }

    @RequestMapping("/getWangThree1")
    public String getWangThree1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForThree("PCI-E");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangThree1");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangThree2")
    public String getWangThree2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForThree("PCI-X");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangThree2");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangThree3")
    public String getWangThree3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForThree("USB");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangThree3");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangFour1")
    public String getWangFour1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForFour("10/100Mbps");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangFour1");
        return "/list/wangList.jsp";
    }
    @RequestMapping("/getWangFour2")
    public String getWangFour2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForFour("10/100/1000Mbps");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangFour2");
        return "/list/wangList.jsp";
    }

    @RequestMapping("/getWangFour3")
    public String getWangFour3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForFour("1000Mbps");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangFour3");
        return "/list/wangList.jsp";
    }

    @RequestMapping("/getWangFour4")
    public String getWangFour4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Wang> wangs = wangService.queryForFour("10000Mbps");
        PageInfo page=new PageInfo(wangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getWangFour4");
        return "/list/wangList.jsp";
    }








}
