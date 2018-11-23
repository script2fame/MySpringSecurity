package com.hungteshun.web.controller;

import java.util.ArrayList;
import java.util.List;

import com.hungteshun.dto.User;
import com.hungteshun.dto.UserQueryCondition;
import org.apache.commons.lang.builder.ReflectionToStringBuilder;
import org.apache.commons.lang.builder.ToStringStyle;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author hungteshun
 * @description:
 * @date 2018/11/23 17:31
 */
@RestController
@RequestMapping(value = "/user")
public class UserController {

    @RequestMapping(method = RequestMethod.GET)
    public List<User> query(UserQueryCondition userQueryCondition, @PageableDefault(page = 0, size = 15, sort = "age,desc") Pageable pageable) {
        System.out.println(userQueryCondition);
        System.out.println(ReflectionToStringBuilder.toString(userQueryCondition, ToStringStyle.MULTI_LINE_STYLE));
        List<User> users = new ArrayList<>();
        users.add(new User());
        users.add(new User());
        users.add(new User());
        return users;
    }

    @RequestMapping(value = "/user/{id:\\d+}",method = RequestMethod.GET)
    public User getUserById(@PathVariable(value = "id") String id){
        User user = new User();
        user.setUserName("hungteshun");
        user.setAge(23);
        return user;
    }
}
