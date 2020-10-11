//package org.com.parent.service;
//
//import com.github.pagehelper.Page;
//import com.github.pagehelper.PageHelper;
//import org.com.parent.mapper.hibernate.BookMapper;
//import org.com.parent.po.Book;
//import org.com.parent.po.BookExample;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.stereotype.Service;
//
//import java.util.HashMap;
//import java.util.List;
//import java.util.Map;
//
//@Service
//public class BookService {
//    @Autowired
//    private BookMapper bookMapper;
//    public Map<String,Object> getPage(int page, int pageSize){
//        Map<String,Object> map = new HashMap<>();
//        //测试分页，PageHelper必须放在查询语句之前执行
//        //注：分页底层采用如果为mysql（limit m ,n其中m表示下标第几个开始查询，下标从0开始，n表示查询几条），则为limit (page-1)*pageSize,pageSize
//        Page<Book> bookPage = PageHelper.startPage(page,pageSize);
//        bookPage.setPageSize(pageSize);
//        BookExample bookExample = new BookExample();
//        List<Book> books = bookMapper.selectByExample(bookExample);
//        System.out.println("总页数为:"+bookPage.getPages()+","+bookPage.getTotal()+","+bookPage.getPageNum());
//        map.put("data",books);
//        map.put("bookPage",bookPage);
//        map.put("total",bookPage.getPages());
//        return map;
//    }
//}
