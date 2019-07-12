package com.didispace;

import com.didispace.service.aspect.MyAspect;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Profile;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

/**
 *
 * @author chenyun
 * @version 1.0.0
 * @blog https://blog.csdn.net/sss996
 *
 */
@SpringBootApplication
public class Application {

	//定义切面
	@Bean(name="myAspect")
	public MyAspect initAspect(){
		return  new MyAspect();
	}

	public static void main(String[] args) {

		SpringApplication.run(Application.class, args);

	}

}
