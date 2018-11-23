package com.hungteshun.dto;

import lombok.Data;

/**
 * @author hungteshun
 * @description: 用户查询条件
 * @date 2018/11/23 17:53
 */
@Data
public class UserQueryCondition {
    private String userName;
    private Integer age;
    private Integer ageTo;
}
