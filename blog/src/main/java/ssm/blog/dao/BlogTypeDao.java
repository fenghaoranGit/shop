package ssm.blog.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import ssm.blog.entity.BlogType;

/**
 * 2017/10/10
 * @author FHR
 *  博客类别DAO接口
 */
@Repository
public interface BlogTypeDao {
	/**
	 * 增加博客类型信息
	 * @param blogType
	 * @return
	 */
	Integer addBlogType(BlogType blogType);
	/**
	 * 删除博客类型信息
	 * @param blogType
	 * @return
	 */
	Integer deleteBlogType(BlogType blogType);
	/**
	 * 更新博客类型信息
	 * @param blogType
	 * @return
	 */
	Integer updateBlogType(BlogType blogType);
	/**
	 * 根据ID查询博客类型信息
	 * @param id
	 * @return
	 */
	BlogType getBlogTypeById(Integer id);
	/**
	 * 根据页码查博客类型信息
	 * @param start
	 * @param end
	 * @return
	 */
	List<BlogType> listByPage(@Param("start")Integer start,
							  @Param("end")Integer end);
	/**
	 * 记录总的博客类型数量
	 * @return
	 */
	Long getTotal();
	
}
