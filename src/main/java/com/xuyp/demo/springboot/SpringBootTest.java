package com.xuyp.demo.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @SpringBootApplication 相当于@Configuration 这个是初始化bean
 * @EnableAutoConfiguration 初始化依赖的jar的初始化,自动配置
 * @ComponentScan   包扫描
 * 
 * @author lenovo
 *
 */

@SpringBootApplication(scanBasePackages={"com.xuyp.demo.springboot"},exclude={})
public class SpringBootTest {

	
	public static void main(String[] args) {
		SpringApplication.run(SpringBootTest.class, args);
	}
}
