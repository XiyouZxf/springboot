package com.zxf.springboot.Controller;

import com.zxf.springboot.Config.ConfigInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @author Zxf
 * @date 2019/6/10  18:09
 */
@Controller
public class ConfigInfoController {
    /**
     * 方式一：加载配置文件properties
     */
//    @Value("${boot.name}")
//    private String name;
//
//    @Value("${boot.location}")
//    private String location;
    /**
     * 方式二：加载配置文件properties
     */
    @Autowired
    private ConfigInfo configInfo;

    @RequestMapping("/boot/config")
    @ResponseBody
    public String config(){

        return configInfo.getName()+configInfo.getLocation();
    }

}
