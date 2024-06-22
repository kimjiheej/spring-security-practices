package ex01.config;

import javax.servlet.Filter;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import ex01.filter.MyFilter;

@Configuration
public class AppConfig {
	
	// @Bean 을 붙이면 반환하는 객체를 spring container 가 bean 으로 관리한다 
	// method 이름인 myFilter 가 bean 의 이름이 된다 
	@Bean
	public Filter myFilter() {
		return new MyFilter();
	}
	
	// 필터는 URL 패턴이나 특정 요청 경로에 매핑되어, 클라이언트의 요청을 가로채거나 수정하는 역할을 할 수 있습니다.
}