package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Dian;
import com.sun.bean.Gu;
import com.sun.service.DianServiceImpl;
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
public class DianController {
     @Autowired
    private DianServiceImpl dianService;

    @RequestMapping("/getDianAll")
    public String getDianAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForAll();
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianAll");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianName1")
    public String getDianName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("航嘉");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName1");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianName2")
    public String getDianName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("鑫谷");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName2");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianName3")
    public String getDianName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("金河田");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName3");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianName4")
    public String getDianName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("先马");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName4");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianName5")
    public String getDianName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("长城机电");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName5");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianName6")
    public String getDianName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("至睿");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName6");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianName7")
    public String getDianName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("华硕");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName7");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianName8")
    public String getDianName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForName("酷冷至尊");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianName8");
        return "/list/dianList.jsp";
    }


    @RequestMapping("/getDianPrice1")
    public String getDianPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForPrice1();
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianPrice1");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianPrice2")
    public String getDianPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",150);
        map.put("price2",200);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForPrice2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianPrice2");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianPrice3")
    public String getDianPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",200);
        map.put("price2",300);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForPrice2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianPrice3");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianPrice4")
    public String getDianPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",300);
        map.put("price2",600);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForPrice2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianPrice4");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianPrice5")
    public String getDianPrice5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",600);
        map.put("price2",1000);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForPrice2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianPrice5");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianPrice6")
    public String getDianPrice6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForPrice3();
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianPrice6");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianGong1")
    public String getDianGong1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForGong1();
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianGong1");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianGong2")
    public String getDianGong2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("gong1",301);
        map.put("gong2",400);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForGong2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianGong2");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianGong3")
    public String getDianGong3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("gong1",401);
        map.put("gong2",500);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForGong2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianGong3");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianGong4")
    public String getDianGong4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("gong1",501);
        map.put("gong2",600);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForGong2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianGong4");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianGong5")
    public String getDianGong5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("gong1",601);
        map.put("gong2",800);
        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForGong2(map);
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianGong5");
        return "/list/dianList.jsp";
    }

    @RequestMapping("/getDianGong6")
    public String getDianGong6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForGong3();
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianGong6");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianThree1")
    public String getDianThree1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForThree("台式机");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianThree1");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianThree2")
    public String getDianThree2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForThree("游戏");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianThree2");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianThree3")
    public String getDianThree3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForThree("小机箱");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianThree3");
        return "/list/dianList.jsp";
    }
    @RequestMapping("/getDianThree4")
    public String getDianThree4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Dian> dians = dianService.queryForThree("服务器");
        PageInfo page=new PageInfo(dians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getDianThree4");
        return "/list/dianList.jsp";
    }



}
