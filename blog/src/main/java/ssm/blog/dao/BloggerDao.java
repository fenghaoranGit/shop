package ssm.blog.dao;

import org.springframework.stereotype.Repository;

import ssm.blog.entity.Blogger;
/**
 * 2017/10/9
 * @author FHR
 *@Description 博主Dao 接口
 */
@Repository
public interface BloggerDao {
	/**
	 * 查询博主信息
	 * @return
	 */
	Blogger getBloggerData();
}
