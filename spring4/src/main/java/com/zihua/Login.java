package com.zihua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zihua on 16-12-7.
 */
@Controller
public class Login {
    @RequestMapping("/login")
    public String login(){
        return "login";
    }
}
