package com.zxf.springboot.MVCController;

import com.zxf.springboot.Model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Zxf
 * @date 2019/6/10  19:00
 */
@RestController
public class MVCControler {

    @GetMapping("/boot/user1")
   public Object getUser1(){
       User user =new User();
       user.setId(1);
       user.setName("user1");

       return user;
   }
    @PostMapping("/boot/user2")
    public Object getUser2(){
        User user =new User();
        user.setId(2);
        user.setName("user2");

        return user;
    }
}
