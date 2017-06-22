package com.zkzj.controller;


import com.zkzj.entity.User;
import com.zkzj.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 用户控制层
 *
 * Created by bysocket on 07/02/2017.
 */
@RestController
public class UserRestController {

    @Autowired
    private UserService userService;

    /**
     * 根据用户名获取用户信息，包括从库的地址信息
     *
     * @param userName
     * @return
     */
    @RequestMapping(value = "/api/user", method = RequestMethod.GET)
    public User findByName(@RequestParam(value = "userName", required = true) String userName) {
        return userService.findByName(userName);
    }

    /**
     * 更新
     * @param id
     * @param name
     * @param age
     * @return
     */
    @RequestMapping("/update/{id}")
    public void update(@PathVariable(name = "id") Long id, @RequestParam(name = "name") String name, @RequestParam(name = "age") int age) {

    }


}
