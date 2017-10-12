package ssm.blog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 2017/10/9
 * 
 * 博主控制器
 */
@Controller   //注册为控制器bean
@RequestMapping("/blog")   //请求路径
public class BloggerController {
	@ResponseBody //返回JSON数据
	@RequestMapping("/hello")
	public String Hello(){
		return "Hello World!!";
	}
	
}
