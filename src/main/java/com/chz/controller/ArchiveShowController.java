package com.chz.controller;

import com.chz.dao.BlogDao;
import com.chz.queryvo.BlogQuery;
import com.chz.service.BlogService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

/**
 * @author snicker
 * @date 2022/1/5 12:03
 * @Describe
 */
@Controller
public class ArchiveShowController {

    @Autowired
    private BlogService blogService;

    //时间轴博客查询
    @GetMapping("/archives")
    public String archive(Model model){
        List<BlogQuery> allBlog = blogService.getAllBlog();
        model.addAttribute("blogs",allBlog);
        return "archives";
    }

}
