package ssm.blog.entity;
/**
 * 2017/10/10
 * @author FHR
 * @msg  博客类别
 *
 */
public class BlogType {
	private Integer id;
	private String typeName;
	private Integer orderNum;
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getTypeName() {
		return typeName;
	}
	public void setTypeName(String typeName) {
		this.typeName = typeName;
	}
	public Integer getOrderNum() {
		return orderNum;
	}
	public void setOrderNum(Integer orderNum) {
		this.orderNum = orderNum;
	}
	@Override
	public String toString() {
		return "BlogType [id=" + id + ", typeName=" + typeName + ", orderNum="
				+ orderNum + "]";
	}
	public BlogType(Integer id, String typeName, Integer orderNum) {
		super();
		this.id = id;
		this.typeName = typeName;
		this.orderNum = orderNum;
	}
	public BlogType(String typeName, Integer orderNum) {
		super();
		this.typeName = typeName;
		this.orderNum = orderNum;
	}
	

}
