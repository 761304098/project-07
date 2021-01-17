package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Gu;
import com.sun.bean.Xian;
import com.sun.bean.Ying;
import com.sun.service.XianServiceImpl;
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
public class XianController {
      @Autowired
      private XianServiceImpl xianService;

    @RequestMapping("/getXianAll")
    public String getXianAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForAll();
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianAll");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianName1")
    public String getXianName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("七彩虹");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName1");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName2")
    public String getXianName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("影驰");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName2");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName3")
    public String getXianName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("索泰");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName3");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName4")
    public String getXianName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("微星");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName4");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName5")
    public String getXianName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("耕升");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName5");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName6")
    public String getXianName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("铭瑄");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName6");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName7")
    public String getXianName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("蓝宝石");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName7");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianName8")
    public String getXianName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("AMD");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName8");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName9")
    public String getXianName9 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("昂达");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName9");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName10")
    public String getXianName10 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("华硕");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName10");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName11")
    public String getXianName11 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("技嘉");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName11");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName12")
    public String getXianName12 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("丽台");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName12");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName13")
    public String getXianName13 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("NVIDIA");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName13");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName14")
    public String getXianName14 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("映泰");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName14");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName15")
    public String getXianName15 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("映众");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName15");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianName16")
    public String getXianName16 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForName("Intel");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianName16");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianPrice1")
    public String getXianPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice1();
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice1");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice2")
    public String getXianPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",500);
        map.put("price2",1000);
        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice2(map);
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice2");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice3")
    public String getXianPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",1000);
        map.put("price2",1500);
        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice2(map);
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice3");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice4")
    public String getXianPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",1500);
        map.put("price2",2000);
        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice2(map);
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice4");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice5")
    public String getXianPrice5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",2000);
        map.put("price2",3000);
        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice2(map);
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice5");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice6")
    public String getXianPrice6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",3000);
        map.put("price2",5000);
        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice2(map);
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice6");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice7")
    public String getXianPrice7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",5000);
        map.put("price2",10000);
        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice2(map);
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice7");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianPrice8")
    public String getXianPrice8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForPrice3();
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianPrice8");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong1")
    public String getXianRong1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("24GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong1");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong2")
    public String getXianRong2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("16GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong2");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong3")
    public String getXianRong3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("12GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong3");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong4")
    public String getXianRong4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("11GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong4");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong5")
    public String getXianRong5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("10GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong5");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong6")
    public String getXianRong6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("8GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong6");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong7")
    public String getXianRong7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("6GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong7");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong8")
    public String getXianRong8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("4GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong8");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong9")
    public String getXianRong9 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("3GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong9");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong10")
    public String getXianRong10 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("2GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong10");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong11")
    public String getXianRong11 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("1GB");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong11");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianRong12")
    public String getXianRong12 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("GDDR6X");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong12");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong13")
    public String getXianRong13 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("GDDR6");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong13");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong14")
    public String getXianRong14 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("GDDR5X");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong14");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong15")
    public String getXianRong15 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("GDDR5");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong15");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong16")
    public String getXianRong16 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("GDDR3");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong16");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong17")
    public String getXianRong17 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("HBM2");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong17");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianRong18")
    public String getXianRong18 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForRong("HBM");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianRong18");
        return "/list/xianList.jsp";
    }

    @RequestMapping("/getXianjie1")
    public String getXianjie1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForJie("HDMI");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianjie1");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianjie2")
    public String getXianjie2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForJie("Type-C");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianjie2");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianjie3")
    public String getXianjie3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForJie("DisplayPort");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianjie3");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianjie4")
    public String getXianjie4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForJie("DVI");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianjie4");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianjie5")
    public String getXianjie5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForJie("VGA");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianjie5");
        return "/list/xianList.jsp";
    }
    @RequestMapping("/getXianjie6")
    public String getXianjie6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Xian> xians = xianService.queryForJie("Mini-DP");
        PageInfo page=new PageInfo(xians,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getXianjie6");
        return "/list/xianList.jsp";
    }
















}
