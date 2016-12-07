package com.zihua;

import org.apache.log4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by zihua on 16-12-6.
 */
@Controller
public class HomeController {
    //添加一个日志器


    //映射一个action
    @RequestMapping("/")

    public  String index(ModelMap model){
        //输出日志文件
        //返回一个index.jsp这个视图
        return "login";
    }
}



