# mybatis-demo
GitHup 主要配置参考以下链接：
http://www.cnblogs.com/bluestorm/p/3634348.html

本项目使用java编写, 目的是学习mybatis 演示示例

官方文档链接（中文）
http://www.mybatis.org/mybatis-3/zh/getting-started.html

数据库使用 Mysql
版本 tag
1. tag1 :v1.0:使用通用mapper组件获取数据库中的内容生成mapper接口、mapper映射文件以及对应的实体类

2. tag2 ：v1.1:使用Myba通用Mappe的分页组件进行分页查询

    第一步：在Pom.xml文件中增加通用Mapp分页插件依赖-->

        <dependency>

            <groupId>com.github.pagehelper</groupId>

            <artifactId>pagehelper</artifactId>

            <version>5.0.0</version>

        </dependency>

    第二步：在