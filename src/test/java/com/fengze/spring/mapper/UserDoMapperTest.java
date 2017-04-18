package com.fengze.spring.mapper;

import com.fengze.spring.model.UserDo;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import static org.junit.Assert.*;

/**
 * Created by Administrator on 2017/4/18.
 */
@Slf4j
public class UserDoMapperTest extends BaseSpringTest {
    @Autowired(required = false)
    /*此处报错是属于正常，因为Mapper接口包只有运行时才扫Mapper包。所以现在没有扫Mapper包，
    所以才会保错;可以加一个(required = false)，意思是忽略保错*/
    private UserDoMapper userDoMapper;
    @Before
    public void setUp() throws Exception {
    }
    @After
    public void tearDown() throws Exception {
    }
    @Test
    public void  testfindUser(){
         /*按照主键Userid 查询User*/
        UserDo user=new UserDo();

        user.setUserId(1);

        UserDo res=userDoMapper.selectOne(user);

        log.info("查询的结果是：{}",res.toString());

    }
}