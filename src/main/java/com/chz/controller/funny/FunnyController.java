package com.chz.controller.funny;

import com.chz.pojo.Message;
import com.chz.pojo.User;
import com.chz.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Repository;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author snicker
 * @date 2022/1/7 12:38
 * @Describe
 */
@Controller
@RequestMapping("/funny")
public class FunnyController {

    @Autowired
    private MessageService messageService;

    @GetMapping("/music")
    public String music(){
        return "funny/music";
    }

    @GetMapping("/catch-the-cat")
    public String cat(){
        return "funny/cat";
    }

    @GetMapping("/high")
    public String high(){
        return "funny/high";
    }

}
