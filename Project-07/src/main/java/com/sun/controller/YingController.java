package com.sun.controller;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.sun.bean.Ying;
import com.sun.bean.zhuban;
import com.sun.service.YingServiceImpl;
import com.sun.service.zhubanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class YingController {
    @Autowired
    private YingServiceImpl yingService;

    @RequestMapping("/getYingAll")
    public String getYingAll (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForAll();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingAll");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingName1")
    public String getYingName1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForName("西部数据");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingName1");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingName2")
    public String getYingName2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForName("希捷");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingName2");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingName3")
    public String getYingName3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForName("东芝");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingName3");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingName4")
    public String getYingName4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForName("HGST");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingName4");
        return "/list/yingList.jsp";
    }

    @RequestMapping("/getYingPrice1")
    public String getYingPrice1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForPrice1();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingPrice1");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingPrice2")
    public String getYingPrice2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForPrice2();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingPrice2");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingPrice3")
    public String getYingPrice3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForPrice3();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingPrice3");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingPrice4")
    public String getYingPrice4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForPrice4();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingPrice4");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong1")
    public String getYingRong1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong1();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong1");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong2")
    public String getYingRong2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong2(8000);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong2");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong3")
    public String getYingRong3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong2(6000);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong3");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong4")
    public String getYingRong4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong2(4000);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong4");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong5")
    public String getYingRong5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong2(3000);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong5");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong6")
    public String getYingRong6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong2(2000);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong6");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingRong7")
    public String getYingRong7 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForRong3();
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingRong7");
        return "/list/yingList.jsp";
    }

    @RequestMapping("/getYingHuan1")
    public String getYingHuan1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForHuan("256MB");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingHuan1");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingHuan2")
    public String getYingHuan2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForHuan("128MB");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingHuan2");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingHuan3")
    public String getYingHuan3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForHuan("64MB");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingHuan3");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingHuan4")
    public String getYingHuan4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForHuan("32MB");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingHuan4");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingHuan5")
    public String getYingHuan5 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForHuan("16MB");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingHuan5");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingHuan6")
    public String getYingHuan6 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForHuan("8MB");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingHuan6");
        return "/list/yingList.jsp";
    }

    @RequestMapping("/getYingZhuan1")
    public String getYingZhuan1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForZhuan(10000);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingZhuan1");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingZhuan2")
    public String getYingZhuan2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForZhuan(7200);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingZhuan2");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingZhuan3")
    public String getYingZhuan3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForZhuan(5900);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingZhuan3");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingZhuan4")
    public String getYingZhuan4 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForZhuan(5400);
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingZhuan4");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingJie1")
    public String getYingJie1 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForJie("SATA3.0");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingJie1");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingJie2")
    public String getYingJie2 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForJie("SATA2.0");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingJie2");
        return "/list/yingList.jsp";
    }
    @RequestMapping("/getYingJie3")
    public String getYingJie3 (@RequestParam(value="pn",defaultValue = "1") Integer pn , HttpServletRequest request){

        PageHelper.startPage(pn,3);
        List<Ying> yings = yingService.queryForJie("SAS");
        PageInfo page=new PageInfo(yings,4);

        HttpSession session = request.getSession();
        session.setAttribute("pageInfo",page);
        session.setAttribute("url","getYingJie3");
        return "/list/yingList.jsp";
    }

}
