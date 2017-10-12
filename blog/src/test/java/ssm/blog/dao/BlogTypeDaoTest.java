package ssm.blog.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.blog.entity.BlogType;

/**
 * 2017/10/10
 * @author FHR
 *BlogTypeDao的测试类
 */
@RunWith(SpringJUnit4ClassRunner.class)//使用spring自带的测试
@ContextConfiguration(locations = "classpath:spring-beans.xml")
public class BlogTypeDaoTest {
	@Resource
	private BlogTypeDao blogTypeDao;
	@Test
	public void testAddBlogType(){
		BlogType blogType = new BlogType("mySql", 10);
		int n = blogTypeDao.addBlogType(blogType);
		System.out.println(n);
		System.out.println("测试结束");
	}
}
