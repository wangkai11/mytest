package cn.itcast.springboot;

import org.springframework.boot.Banner.Mode;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication//代表springboot应用的运行主类
public class Application {
	
	public static void main(String[] args) {
		//方式一
		//运行springboot应用
		//SpringApplication.run(Application.class, args);
		
		//方式二
		//创建对象
		SpringApplication springApplication = new SpringApplication(Application.class);
		//设置横幅关闭
		springApplication.setBannerMode(Mode.OFF);
		springApplication.run(args);
		
	}
}
