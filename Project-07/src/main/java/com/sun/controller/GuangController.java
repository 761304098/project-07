package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Guang;
import com.sun.bean.Jian;
import com.sun.service.GuangServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class GuangController {
    @Autowired
   private GuangServiceImpl guangServicel;

    @RequestMapping("/getGuangAll")
    public String getGuangAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForAll();
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangAll");
        return "/list/guangList.jsp";
    }

    @RequestMapping("/getGuangName1")
    public String getGuangName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("华硕");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName1");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName2")
    public String getGuangName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("先锋");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName2");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName3")
    public String getGuangName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("LG");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName3");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName4")
    public String getGuangName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("三星");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName4");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName5")
    public String getGuangName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("索尼");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName5");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName6")
    public String getGuangName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("建兴");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName6");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName7")
    public String getGuangName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("松下");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName7");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangName8")
    public String getGuangName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForName("联想");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangName8");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangPrice1")
    public String getGuangPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForPrice1();
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangPrice1");
        return "/list/guangList.jsp";
    }

    @RequestMapping("/getGuangPrice2")
    public String getGuangPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForPrice2();
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangPrice2");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangPrice3")
    public String getGuangPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForPrice3();
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangPrice3");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangPrice4")
    public String getGuangPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForPrice4();
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangPrice4");
        return "/list/guangList.jsp";
    }


    @RequestMapping("/getGuangOne1")
    public String getGuangOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForOne("DVD刻录机");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangOne1");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangOne2")
    public String getGuangOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForOne("蓝光刻录机");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangOne2");
        return "/list/guangList.jsp";
    }

    @RequestMapping("/getGuangOne3")
    public String getGuangOne3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForOne("DVD光驱");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangOne3");
        return "/list/guangList.jsp";
    }

    @RequestMapping("/getGuangOne4")
    public String getGuangOne4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForOne("蓝光COMBO");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangOne4");
        return "/list/guangList.jsp";
    }

    @RequestMapping("/getGuangFour1")
    public String getGuangFour1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForFour("USB");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangFour1");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangFour2")
    public String getGuangFour2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForFour("SATA");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangFour2");
        return "/list/guangList.jsp";
    }

    @RequestMapping("/getGuangThree1")
    public String getGuangThree1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForThree("外置");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangThree1");
        return "/list/guangList.jsp";
    }
    @RequestMapping("/getGuangThree2")
    public String getGuangThree2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,4);
        List<Guang> guangs = guangServicel.queryForThree("内置");
        PageInfo page=new PageInfo(guangs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuangThree2");
        return "/list/guangList.jsp";
    }





}
