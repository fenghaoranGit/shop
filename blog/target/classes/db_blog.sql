DROP DATABASE IF EXISTS db_blog;
/*创建数据库，并设置编码*/
CREATE DATABASE db_blog DEFAULT CHARACTER SET utf8;

USE db_blog;
/*博主信息表*/
CREATE TABLE `t_blogger` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '博主id',
  `username` VARCHAR(50) NOT NULL COMMENT '博主姓名',
  `password` VARCHAR(100) NOT NULL COMMENT '博主密码',
  `profile` TEXT COMMENT '博主信息',
  `nickname` VARCHAR(50) DEFAULT NULL COMMENT '博主昵称',
  `sign` VARCHAR(100) DEFAULT NULL COMMENT '博主签名',
  `imagename` VARCHAR(100) DEFAULT NULL COMMENT '博主头像路径',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=2 DEFAULT CHARSET=utf8;
/*博客类别表*/
CREATE TABLE `t_blogtype` (
  `id` INT(11) NOT NULL AUTO_INCREMENT COMMENT '博客id',
  `typeName` VARCHAR(30) DEFAULT NULL COMMENT '博客类别',
  `orderNum` INT(11) DEFAULT NULL COMMENT '博客排序',
  PRIMARY KEY (`id`)
) ENGINE=INNODB AUTO_INCREMENT=16 DEFAULT CHARSET=utf8;