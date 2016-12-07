package com.zihua;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zihua on 16-12-8.
 */
@Controller
public class BuildStep_1 {
    @RequestMapping("/build_1")
    public String buildStep_1(){
        return "build_1";
    }
}
