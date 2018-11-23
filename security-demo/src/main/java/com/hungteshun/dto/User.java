package com.hungteshun.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hungteshun
 * @description:
 * @date 2018/11/23 17:33
 */
@Getter
@Setter
@ToString
public class User {
    private String userName;
    private String password;
    private Integer age;
}
