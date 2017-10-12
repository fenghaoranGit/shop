第一天总结
   在搭建ssm框架时，要注意整个项目的目录结构，这在配置文件时，十分有用。
   注意各个配置文件的作用
   mapper里写的是dao层的实现语句，就是mybatis的映射文件位置
   log4j.properties 日志文件配置
   mybatis-conf.xml mybatis全局配置文件 在这里配置别名 驼峰命名转换等等
   spring-beans.xml 类似于spring-mybatis.xml的作用，配置数据库资源，
  sqlSessionFactory，dao包，开启接口扫描 声明事务处理
   spring-mvc.xml   mvc层的注解扫描，web的前后缀，MVC的注解配置，静态资源配置
   web.xml          web层的配置，访问路径，
       主要控制器，监听器，过滤器，将需要的配置文件添加进来
   访问路径：localhost:8080 项目名称/Controller层的访问路径集合
 ------------------------------------------------------
 第二天
 前端开发，有大问题 
 1.jspf文件
 2.easyUI的使用
 3.直接访问jsp文件时，访问路径：localhost:8080 项目名称/webapp里jsp文件的路径集合.jsp
   例如http://localhost:8080/blog/admin/menu.jsp
 4.在导入控件时，注意版本号！！
 一般而言，参数是用 parameterType=“。。。。”，而返回值类型是用resultMap=“。。。。”
   
