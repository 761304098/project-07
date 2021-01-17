package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.XianShi;
import com.sun.bean.Ying;
import com.sun.service.XianServiceImpl;
import com.sun.service.XianShiServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class XianShiController {
    @Autowired
    private XianShiServiceImpl xianShiService;
    @RequestMapping("/getXianShiAll")
    public String getXianShiAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForAll();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiAll");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiName1")
    public String getXianShiName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("三星");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName1");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiName2")
    public String getXianShiName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("HKC");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName2");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiName3")
    public String getXianShiName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("AOC");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName3");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiName4")
    public String getXianShiName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("优派");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName4");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiName5")
    public String getXianShiName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("明基");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName5");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiName6")
    public String getXianShiName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("飞利浦");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName6");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiName7")
    public String getXianShiName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("蚂蚁电竞");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName7");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiName8")
    public String getXianShiName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForName("创维");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiName8");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiPrice1")
    public String getXianShiPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForPrice1();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiPrice1");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiPrice2")
    public String getXianShiPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForPrice2();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiPrice2");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiPrice3")
    public String getXianShiPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForPrice3();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiPrice3");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiPrice4")
    public String getXianShiPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForPrice4();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiPrice4");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiChi1")
    public String getXianShiChi1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForChi1();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiChi1");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiChi2")
    public String getXianShiChi2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForChi2();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiChi2");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiChi3")
    public String getXianShiChi3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForChi3();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiChi3");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiChi4")
    public String getXianShiChi4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForChi4();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiChi4");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiChi5")
    public String getXianShiChi5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForChi5();
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiChi5");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiLei1")
    public String getXianShiLei1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForLei("曲面");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiLei1");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiLei2")
    public String getXianShiLei2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForLei("5K");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiLei2");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiLei3")
    public String getXianShiLei3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForLei("4K");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiLei3");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiLei4")
    public String getXianShiLei4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForLei("2K");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiLei4");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiLei5")
    public String getXianShiLei5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForLei("LED");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiLei5");
        return "/list/xianShiList.jsp";
    }
    @RequestMapping("/getXianShiLei6")
    public String getXianShiLei6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForLei("广视角");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiLei6");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiMian1")
    public String getXianShiMian1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForMian("IPS");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiMian1");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiMian2")
    public String getXianShiMian2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForMian("VA");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiMian2");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiMian3")
    public String getXianShiMian3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForMian("PLS");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiMian3");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiMian4")
    public String getXianShiMian4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForMian("ADS");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiMian4");
        return "/list/xianShiList.jsp";
    }

    @RequestMapping("/getXianShiMian5")
    public String getXianShiMian5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<XianShi> xianShis = xianShiService.queryForMian("TN");
        PageInfo page=new PageInfo(xianShis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianShiMian5");
        return "/list/xianShiList.jsp";
    }

}
