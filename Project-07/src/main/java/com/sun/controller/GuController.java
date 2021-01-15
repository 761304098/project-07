package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Gu;
import com.sun.bean.Ying;
import com.sun.service.GuServiceImpl;
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
public class GuController {
   @Autowired
    private GuServiceImpl guService;
    @RequestMapping("/getGuAll")
    public String getGuAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForAll();
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuAll");
        return "/list/gutaiList.jsp";
    }

    @RequestMapping("/getGuName1")
    public String getGuName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("三星");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName1");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName2")
    public String getGuName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("英睿达");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName2");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName3")
    public String getGuName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("影驰");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName3");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName4")
    public String getGuName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("东芝");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName4");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName5")
    public String getGuName5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("闪迪");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName5");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName6")
    public String getGuName6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("爱国者");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName6");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName7")
    public String getGuName7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("铭瑄");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName7");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuName8")
    public String getGuName8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForName("金士顿");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuName8");
        return "/list/gutaiList.jsp";
    }

    @RequestMapping("/getGuPrice1")
    public String getGuPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForPrice1();
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuPrice1");
        return "/list/gutaiList.jsp";
    }

    @RequestMapping("/getGuPrice2")
    public String getGuPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",300);
        map.put("price2",500);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForPrice2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuPrice2");
        return "/list/gutaiList.jsp";
    }

    @RequestMapping("/getGuPrice3")
    public String getGuPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",500);
        map.put("price2",1000);

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForPrice2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuPrice3");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuPrice4")
    public String getGuPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",1000);
        map.put("price2",2000);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForPrice2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuPrice4");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuPrice5")
    public String getGuPrice5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("price1",2000);
        map.put("price2",5000);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForPrice2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuPrice5");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuPrice6")
    public String getGuPrice6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForPrice3();
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuPrice6");
        return "/list/gutaiList.jsp";
    }

    @RequestMapping("/getGuRong1")
    public String getGuRong1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForRong1();
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuRong1");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuRong2")
    public String getGuRong2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("rong1",960);
        map.put("rong2",1000);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForRong2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuRong2");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuRong3")
    public String getGuRong3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("rong1",480);
        map.put("rong2",512);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForRong2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuRong3");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuRong4")
    public String getGuRong4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("rong1",240);
        map.put("rong2",256);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForRong2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuRong4");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuRong5")
    public String getGuRong5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){
        Map<String,Object> map =new HashMap<String, Object>();
        map.put("rong1",120);
        map.put("rong2",128);
        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForRong2(map);
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuRong5");
        return "/list/gutaiList.jsp";
    }

    @RequestMapping("/getGuRong6")
    public String getGuRong6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForRong3();
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuRong6");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei1")
    public String getGuLei1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("SATA3");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei1");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei2")
    public String getGuLei2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("M.2 SATA");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei2");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei3")
    public String getGuLei3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("M.2 PCIe");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei3");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei4")
    public String getGuLei4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("Type-C");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei4");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei5")
    public String getGuLei5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("MSATA");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei5");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei6")
    public String getGuLei6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("PCI-E");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei6");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei7")
    public String getGuLei7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("U.2");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei7");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei8")
    public String getGuLei8 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("SATA2");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei8");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei9")
    public String getGuLei9 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("USB3.1");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei9");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei10")
    public String getGuLei10 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("USB3.0");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei10");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei11")
    public String getGuLei11 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("SAS");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei11");
        return "/list/gutaiList.jsp";
    }
    @RequestMapping("/getGuLei12")
    public String getGuLei12 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Gu> gus = guService.queryForLei("PATA");
        PageInfo page=new PageInfo(gus,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getGuLei12");
        return "/list/gutaiList.jsp";
    }




}
