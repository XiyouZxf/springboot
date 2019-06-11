package com.zxf.springboot.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
/**
 * @author Zxf
 * @date 2019/6/10  20:39
 */

@Controller
public class JspController {

    @GetMapping("/boot/index")
    public String index(Model model){
        model.addAttribute("msg","springboot集成jsp!!!!!!");
        return "index";
    }

}
