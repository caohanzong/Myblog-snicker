package com.chz.controller;

import com.chz.service.FriendLinkService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author snicker
 * @date 2022/1/5 18:01
 * @Describe
 */
@Controller
public class FriendsShowController {

    @Autowired
    private FriendLinkService friendLinkService;

    @GetMapping("/friends")
    public String friends(Model model){
        model.addAttribute("friendlinks",friendLinkService.listFriendLink());
        return "friends";
    }

}
