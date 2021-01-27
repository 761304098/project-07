package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Jian;
import com.sun.bean.Sheng;
import com.sun.service.ShengServiceImpl;
import lombok.experimental.Helper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class ShengController {
   @Autowired
    private ShengServiceImpl shengService;


    @RequestMapping("/getShengAll")
    public String getShengAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForAll();
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengAll");
        return "/list/shengList.jsp";
    }


    @RequestMapping("/getShengName1")
    public String getShengName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("创新");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName1");
        return "/list/shengList.jsp";
    }
    @RequestMapping("/getShengName2")
    public String getShengName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("森然");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName2");
        return "/list/shengList.jsp";
    }
    @RequestMapping("/getShengName3")
    public String getShengName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("华硕");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName3");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengName4")
    public String getShengName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("客所思");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName4");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengName5")
    public String getShengName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("德国坦克");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName5");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengName6")
    public String getShengName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("AZ");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName6");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengName7")
    public String getShengName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("乐之邦");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName7");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengName8")
    public String getShengName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForName("声擎");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengName8");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengPrice1")
    public String getShengPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForPrice1();
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengPrice1");
        return "/list/shengList.jsp";
    }
    @RequestMapping("/getShengPrice2")
    public String getShengPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForPrice2();
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengPrice2");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengPrice3")
    public String getShengPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForPrice3();
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengPrice3");
        return "/list/shengList.jsp";
    }

    @RequestMapping("/getShengPrice4")
    public String getShengPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForPrice4();
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengPrice4");
        return "/list/shengList.jsp";
    }
    @RequestMapping("/getShengOne1")
    public String getShengOne1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForOne("家用");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengOne1");
        return "/list/shengList.jsp";
    }
    @RequestMapping("/getShengOne2")
    public String getShengOne2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForOne("专业");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengOne2");
        return "/list/shengList.jsp";
    }
      @RequestMapping("/getShengTwo1")
    public String getShengTwo1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForTwo("PCI");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengTwo1");
        return "/list/shengList.jsp";
    }
    @RequestMapping("/getShengTwo2")
    public String getShengTwo2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

      PageHelper.startPage(pn,3);
        List<Sheng> shengs = shengService.queryForTwo("USB");
        PageInfo page=new PageInfo(shengs,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getShengTwo2");
        return "/list/shengList.jsp";
    }





}
