package com.zihua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * Created by zihua on 16-12-8.
 */
@Controller
public class Check {
    @RequestMapping(value = "/check",method = RequestMethod.POST)
    public String check(@RequestParam String user, @RequestParam String pass){
        System.out.println(user+" "+pass);
        if(user=="zihua"&&pass=="123456")return "login";
            return "buildProject";
    }
}
