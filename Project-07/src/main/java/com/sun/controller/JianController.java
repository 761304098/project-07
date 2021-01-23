package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Jian;
import com.sun.bean.Shu;
import com.sun.service.JianServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class JianController{
    @Autowired
      private JianServiceImpl jianService;

    @RequestMapping("/getJianAll")
    public String getJianAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForAll();
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianAll");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianName1")
    public String getJianName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("双飞燕");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName1");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianName2")
    public String getJianName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("雷柏");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName2");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianName3")
    public String getJianName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("海盗船");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName3");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianName4")
    public String getJianName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("罗技");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName4");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianName5")
    public String getJianName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("富勒");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName5");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianName6")
    public String getJianName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("达尔优");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName6");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianName7")
    public String getJianName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("血手幽灵");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName7");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianName8")
    public String getJianName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForName("戴尔");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianName8");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianPrice1")
    public String getJianPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForPrice1();
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianPrice1");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianPrice2")
    public String getJianPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForPrice2();
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianPrice2");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianPrice3")
    public String getJianPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForPrice3();
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianPrice3");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianPrice4")
    public String getJianPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForPrice4();
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianPrice4");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianOne1")
    public String getJianOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForOne("机械");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianOne1");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianOne2")
    public String getJianOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForOne("游戏");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianOne2");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianOne3")
    public String getJianOne3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForOne("超薄");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianOne3");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianOne4")
    public String getJianOne4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForOne("平板");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianOne4");
        return "/list/jianList.jsp";
    }

    @RequestMapping("/getJianOne5")
    public String getJianOne5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForOne("数字");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianOne5");
        return "/list/jianList.jsp";
    }


    @RequestMapping("/getJianTwo1")
    public String getJianTwo1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForTwo("有线");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianTwo1");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianTwo2")
    public String getJianTwo2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForTwo("无线");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianTwo2");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianTwo3")
    public String getJianTwo3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForTwo("蓝牙");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianTwo3");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianThree1")
    public String getJianThree1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForThree("USB");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianThree1");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianThree2")
    public String getJianThree2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForThree("PS");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianThree2");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianFour1")
    public String getJianFour1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForThree("机械");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianFour1");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianFour2")
    public String getJianFour2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForThree("X");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianFour2");
        return "/list/jianList.jsp";
    }
    @RequestMapping("/getJianFour3")
    public String getJianFour3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Jian> jians = jianService.queryForThree("火山口");
        PageInfo page=new PageInfo(jians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getJianFour3");
        return "/list/jianList.jsp";
    }





}