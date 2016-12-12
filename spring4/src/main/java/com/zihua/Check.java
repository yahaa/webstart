package com.zihua;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


/**
 * Created by zihua on 16-12-8.
 */
@Controller
public class Check {
    @RequestMapping(value = "/check",method = RequestMethod.POST)
    public ModelAndView check(User user, ModelMap model){
        ModelAndView mv=new ModelAndView("login");
        mv.addObject("message","密码或者用户名错误");
        if(user.getName().equals("zihua")&&user.getPassword().equals("123456"))
            return new ModelAndView("buildProject");
        return mv;
    }
}
