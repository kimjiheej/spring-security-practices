package ex01.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;


@Configuration
@EnableWebMvc
@ComponentScan(basePackages={"ex01.controller"})
public class WebConfig {
	
	/*
	 @ComponentScan 어노테이션은 지정된 패키지에서 @Component 및 @Component를 포함한 다른 어노테이션들을 찾아서 Spring 빈으로 등록합니다. 따라서 @Controller, @Service, @Repository, @Configuration과 같은 어노테이션이 붙은 클래스들을 찾아서 빈으로 등록합니다.
	 */
}