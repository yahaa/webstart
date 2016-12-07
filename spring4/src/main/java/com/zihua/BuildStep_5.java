package com.zihua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zihua on 16-12-8.
 */
@Controller
public class BuildStep_5 {
    @RequestMapping("/build_5")
    public String buildStep_1(){
        return "build_5";
    }
}
