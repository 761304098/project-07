package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Nei;
import com.sun.bean.zhuban;
import com.sun.service.NeiServiceImpl;
import com.sun.service.zhubanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class NeiController {
    @Autowired
    private NeiServiceImpl neiService;

    @RequestMapping("/getneiAll")
    public String getneiAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForAll();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getneiAll");
        return "/list/neiList.jsp";
    }


    @RequestMapping("/getName1")
    public String getName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("英睿达");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName1");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName2")
    public String getName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("影驰");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName2");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName3")
    public String getName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("三星");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName3");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName4")
    public String getName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("科赋");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName4");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName5")
    public String getName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("海盗船");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName5");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName6")
    public String getName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("瑞势");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName6");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName7")
    public String getName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("芝奇");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName7");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getName8")
    public String getName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("威刚");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName8");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getPrice1")
    public String getPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForPrice1();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getPrice1");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getPrice2")
    public String getPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForPrice2();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getPrice2");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getPrice3")
    public String getPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForPrice3();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getPrice3");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getPrice4")
    public String getPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForPrice4();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getPrice4");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getLei1")
    public String getLei1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForLei("DDR4");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getLei1");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getLei2")
    public String getLei2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForLei("DDR3");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getLei2");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getLei3")
    public String getLei3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForLei("DDR2");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getLei3");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getTao1")
    public String getTao1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("单条");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao1");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao2")
    public String getTao2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("单条(16GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao2");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao3")
    public String getTao3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("单条(8GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao3");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao4")
    public String getTao4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("单条(4GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao4");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getTao5")
    public String getTao5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("单条(2GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao5");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao6")
    public String getTao6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao6");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getTao7")
    public String getTao7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(4×16GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao7");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getTao8")
    public String getTao8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(2×16GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao8");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getTao9")
    public String getTao9 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(4×8GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao9");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getTao10")
    public String getTao10 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(2×8GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao10");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao11")
    public String getTao11 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(4×4GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao11");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao12")
    public String getTao12 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(2×4GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao12");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getTao13")
    public String getTao13 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForTao("套装(2×2GB)");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getTao13");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getZhu1")
    public String getZhu1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu1();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu1");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu2")
    public String getZhu2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu2("3600");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu2");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu3")
    public String getZhu3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu2("3400");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu3");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu4")
    public String getZhu4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu2("3200");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu4");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu5")
    public String getZhu5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu2("3000");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu5");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu6")
    public String getZhu6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu2("2800");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu6");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu7")
    public String getZhu7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu2("2660");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu7");
        return "/list/neiList.jsp";
    }
    @RequestMapping("/getZhu8")
    public String getZhu8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForZhu3();
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getZhu8");
        return "/list/neiList.jsp";
    }


    @RequestMapping("/getName9")
    public String getName9 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("台式机");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName9");
        return "/list/neiList.jsp";
    }

    @RequestMapping("/getName10")
    public String getName10 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Nei> neis = neiService.queryForName("笔记本");
        PageInfo page=new PageInfo(neis,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getName10");
        return "/list/neiList.jsp";
    }






}
