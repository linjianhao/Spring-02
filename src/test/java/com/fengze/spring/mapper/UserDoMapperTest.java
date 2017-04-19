package com.fengze.spring.mapper;

import com.fengze.spring.model.UserDo;
import com.github.pagehelper.PageHelper;
import lombok.extern.slf4j.Slf4j;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.Date;
import java.util.List;

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
    @Test
    public void  testAddUser(){
         /*按照主键Userid 查询User*/
        UserDo user=new UserDo();

        user.setUserName("李达康a");
        user.setRealName("李达a");
        user.setUserType("普通会员");
        user.setEmail("1358599615@qq.com");
        user.setState("1");
        user.setAddress("河南郑州");
        user.setCellPhone("15806624565");
        user.setPassWord("123456");
        user.setCreateBy("admin");
        user.setCreateDate(new Date());
        user.setUpdateBy("admin");
        user.setUpdateDate(new Date());

        Integer res=userDoMapper.insert(user);

        log.info("查询的结果是：{}",res);

    }
    /*分页测试*/
    @Test
    public void testSelectAll(){
        UserDo user=new UserDo();

        PageHelper.offsetPage(1, 2);

        /*List<UserDo>中的UserDo指的是所要分页的数据表对应的实体类*/
        List<UserDo> page=userDoMapper.selectAll();

        log.info("分页的结果：{}",page);
    }

}