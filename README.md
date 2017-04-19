# mybatis-demo
GitHup 主要配置参考以下链接：
http://www.cnblogs.com/bluestorm/p/3634348.html

本项目使用java编写, 目的是学习mybatis 演示示例

官方文档链接（中文）
http://www.mybatis.org/mybatis-3/zh/getting-started.html

数据库使用 Mysql

版本 tag

一. tag1 :v1.0:使用通用mapper组件获取数据库中的内容生成mapper接口、mapper映射文件以及对应的实体类;
详细分析：

1、使用SpringJunit4整合测试，用到了Spring-test依赖包。创建一个类BaseSpringTest（里面没有任何属性和方法）;然后

让对应的测试类继承他即可。BaseSpringTest这个类实现了加载Spring容器，以及初始化上下问对象。使用@Transactional

的作用是开启事务（使用事务的配置见2）。开启事务的话对应的测试类中不用执行完log.info（）方法，不会提交到数据库（可以诚谢主键id），会出现回滚。

使用@Transactional(propagation= Propagation.NOT_SUPPORTED)的作用是让事务无效

package com.fengze.spring.mapper;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/*加载测试类（JUnit4以后得版本支持注解的方式）*/

@RunWith(SpringJUnit4ClassRunner.class)

/*加载Spring容器，初始化上下文对象*/

@ContextConfiguration(locations={"classpath*:applicationContext.xml"})

// 添加注释@Transactional 回滚对数据库操作

/*当设置为@Transactional(propagation= Propagation.NOT_SUPPORTED)时其目的是不让事务起作用；

由于是由Spring托管的，Spring会自动将其提交

* 当设置为@Transactional，意味着打开事务,执行测试的时候不会提交*/

//@Transactional(propagation= Propagation.NOT_SUPPORTED)

@Transactional

public class BaseSpringTest {
    
}

2、使用事务的配置

先在pom.xml文件中添加依赖

<dependency>
     <groupId>org.springframework</groupId>
     <artifactId>spring-tx</artifactId>
     <version>${springframework-version}</version>
</dependency>

再在ApplicationContext.xml配置文件中增加事务配置

    <!--事务配置开始（在BaseSpringTest.java文件中使用Transactional）-->
    <bean id="transactionManager" class="org.springframework.jdbc.datasource.DataSourceTransactionManager">
        <property name="dataSource" ref="dataSource"/>
    </bean>
    <!--dataSource里有链接；事务是通过链接生成的(因为BaseSpringTest开启事务是使用注解的方式，就要使用这个配置)-->
    <tx:annotation-driven transaction-manager="transactionManager"/>
    
在BaseSpringTest类中添加注解@Transactional即可

3、使用SpringJUnit4的话，对应的测试就不需要Spring容器的加载和初始化了，
  只需要继承过来即可 
  
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
   
   
   

