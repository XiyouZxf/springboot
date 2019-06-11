package com.zxf.springboot.Config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @author Zxf
 * @date 2019/6/10  18:32
 */
@Data
@Component
@ConfigurationProperties(prefix = "boot")
public class ConfigInfo {

    private String name;
    private String location;
}
