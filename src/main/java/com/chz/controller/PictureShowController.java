package com.chz.controller;

import com.chz.service.PictureService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


/**
 * @author snicker
 * @date 2022/1/5 18:16
 * @Describe
 */
@Controller
public class PictureShowController {

    @Autowired
    private PictureService pictureService;

    @GetMapping("/picture")
    public String pictures(Model model){
        model.addAttribute("pictures",pictureService.listPicture());
        return "picture";
    }

}
