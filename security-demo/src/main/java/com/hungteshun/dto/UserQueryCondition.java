package com.hungteshun.dto;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

/**
 * @author hungteshun
 * @description: 用户查询条件
 * @date 2018/11/23 17:53
 */
@Getter
@Setter
@ToString
public class UserQueryCondition {
    private String userName;
    private Integer age;
    private Integer ageTo;
}
