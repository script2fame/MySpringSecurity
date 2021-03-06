package com.hungteshun.web.controller;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.request.MockMvcRequestBuilders;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;

/**
 * @author hungteshun
 * @description:
 * @date 2018/11/23 17:13
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class UserControllerTest {

    @Autowired
    private WebApplicationContext context;

    private MockMvc mockMvc;

    @Before
    public void setUp() {
        mockMvc = MockMvcBuilders.webAppContextSetup(context).build();
    }

    @Test
    public void testWhenQuerySuccess() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/user")
                        .param("userName", "huangteshun")
                        .param("age", "18")
                        .param("ageTo", "80")
                        .param("size", "10")
                        .param("page", "5")
                        .param("sort", "age,DESC")
                        .contentType(MediaType.APPLICATION_JSON_UTF8)
        ).andExpect(MockMvcResultMatchers.status().isOk())
                //希望返回的结果长度是3
                .andExpect(MockMvcResultMatchers.jsonPath("$.length()").value(3));
    }

    @Test
    public void testGetUserById() throws Exception {
        mockMvc.perform(
                MockMvcRequestBuilders.get("/user/1").contentType(MediaType.APPLICATION_JSON_UTF8)
        ).andExpect(MockMvcResultMatchers.status().isOk())
                .andExpect(MockMvcResultMatchers.jsonPath("$.userName").value("hungteshun")
                );
    }

    @Test
    public void testGetUserById2() throws Exception {
        mockMvc.perform(MockMvcRequestBuilders.get("/user/aaa")
                .contentType(MediaType.APPLICATION_JSON_UTF8))
                .andExpect(MockMvcResultMatchers.status().is4xxClientError());
    }
}
