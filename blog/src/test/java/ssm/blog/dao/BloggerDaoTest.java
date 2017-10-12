package ssm.blog.dao;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import ssm.blog.entity.Blogger;

/**
 * 2017/10/9
 * @author FHR
 * @Description 测试dao的方法
 */
@RunWith(SpringJUnit4ClassRunner.class)
//设置spring配置文件的路径
@ContextConfiguration(locations = "classpath:spring-beans.xml") 
public class BloggerDaoTest {
	@Resource  //注入BloggerDao对象
	private BloggerDao bloggerDao;
	
	@Test
	public void testGetBloggerData(){
		Blogger blogger = bloggerDao.getBloggerData();
		System.out.println(blogger);
	}
	
}
