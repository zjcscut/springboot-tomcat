package org.throwable.st.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author zhangjinci
 * @version 2016/12/5 16:32
 * @function
 */
@Controller
public class HelloController {


    @RequestMapping(value = "/hello/view.html",method = RequestMethod.GET)
    public String helloView(){
        return "index";
    }


    @RequestMapping(value = "/hello.html", method = RequestMethod.GET)
    @ResponseBody
    public String hello(@RequestParam("name") String name) {
        System.out.println("name = " + name);
        return "hello";
    }
}
