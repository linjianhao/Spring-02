package com.fengze.spring.mapper;

import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by Administrator on 2017/4/18.
 */
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
