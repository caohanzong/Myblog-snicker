package com.chz.controller;

import com.chz.pojo.Message;
import com.chz.pojo.User;
import com.chz.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.http.HttpSession;
import java.security.MessageDigest;
import java.util.List;

/**
 * @author snicker
 * @date 2022/1/6 11:32
 * @Describe
 */
@Controller
public class MessageController {

    @Autowired
    private MessageService messageService;

    //@Value("${}") 用于获取配置文件中的属性值，通常用于获取写在application.properties中的内容
    @Value("${message.avatar}")
    private String avatar;

    @GetMapping("/message")
    public String message(){
        return "message";
    }

    //查询留言
    @GetMapping("/messagecomment")
    public String messages(Model model) {
        List<Message> messages = messageService.listMessage();
        model.addAttribute("messages", messages);
        return "message::messageList";
    }

    //新增留言
    @PostMapping("/message")
    public String post(Message message, HttpSession session, Model model){
        User user = (User) session.getAttribute("user");
        //设置头像
        if(user != null){
            message.setAvatar(user.getAvatar());
            message.setAdminMessage(true);
        } else {
            message.setAvatar(avatar);
        }
        if(message.getParentMessage().getId()!=null){
            message.setParentMessageId(message.getParentMessage().getId());
        }

        //System.out.println(message);
        messageService.saveMessage(message);
        List<Message>  messages = messageService.listMessage();
        model.addAttribute("messages",messages);
        return "message :: messageList";
    }

    //删除留言
    @GetMapping("/messages/{id}/delete")
    public String delete(@PathVariable Long id, RedirectAttributes attributes,Model model){
        messageService.deleteMessage(id);
        return "redirect:/message";
    }


}


























