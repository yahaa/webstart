package com.zihua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zihua on 16-12-11.
 */
@Controller
public class Register {
    @RequestMapping("/register")
    public String register(){
        return "register";
    }
}
