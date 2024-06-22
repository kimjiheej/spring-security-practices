package ex01.initializer;

import javax.servlet.Filter;

import org.springframework.web.filter.DelegatingFilterProxy;
import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

import ex01.config.AppConfig;
import ex01.config.WebConfig;

public class Ex01WebApplicationInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {
	
	
	/*
	 이 메서드는 root ApplicationContext에 해당하는 설정 클래스들을 반환합니다. 여기서는 AppConfig.class를 반환하여, Spring의 root ApplicationContext의 설정을 지정합니다. 주로 데이터베이스 연결과 관련된 설정, 서비스 계층의 빈 등을 정의합니다.
	 */
	
	@Override
	protected Class<?>[] getRootConfigClasses() {
		return new Class<?>[] {AppConfig.class};
	}

	@Override
	protected Class<?>[] getServletConfigClasses() {
		return new Class<?>[] {WebConfig.class};
	}

	@Override
	protected String[] getServletMappings() {
		return new String[] {"/"};
	}
	
	/*
	 는 "/" 패턴을 사용하여 모든 URL 요청을 Dispatcher Servlet이 처리하도록 지정하고 있습니다. 즉, 이 설정은 모든 요청을 Dispatcher Servlet이 처리하도록 합니다.
	 */

	@Override
	protected Filter[] getServletFilters() {
		return new Filter[] {new DelegatingFilterProxy("myFilter")};
	}
	
	/*
	 이 메서드는 Dispatcher Servlet에 등록될 필터들을 반환합니다. 위 예제에서는 DelegatingFilterProxy를 사용하여 myFilter라는 이름의 필터를 등록하였습니다. 이 필터는 Spring의 빈으로 정의되어 있어야 하며, 필터 체인에 추가됩니다.
	 */
}