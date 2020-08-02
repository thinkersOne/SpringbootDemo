package org.com.parent.controller;

import org.com.parent.po.Book;
import org.com.parent.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Controller
public class FreemarkerController {
    @Autowired
    private BookService bookService;
    @RequestMapping("helloFreemarker")
    //验证freemarker
    public String getPage(Model model){
        model.addAttribute("name","志豪");
        return "hello";
    }
    @RequestMapping(value = "getBook",method = RequestMethod.GET)
    public String getString(Model model, @RequestParam(value="page",required=false) String page){
        Map<String,Object> map = new HashMap<>();
        map.put("book","谁的青春不迷茫");
        if(page == null){
            page="1";
        }
        map.put("page",Integer.valueOf(page));
        map.put("pageSize",5);
        Map<String,Object> map1 = bookService.getPage((int)map.get("page"),(int)map.get("pageSize"));
        model.addAttribute("map",map);
        model.addAttribute("books",map1.get("data"));
        model.addAttribute("bookPage",map1.get("bookPage"));
        model.addAttribute("total",map1.get("total"));
        return "index";
    }
}
