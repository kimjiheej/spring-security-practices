package ex04.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.util.matcher.AntPathRequestMatcher;

@Configuration
@EnableWebSecurity
public class SecurityConfig01 {
    @Bean
	public WebSecurityCustomizer webSecurityCustomizer() {
        return new WebSecurityCustomizer() {
            @Override
            public void customize(WebSecurity web) {
                web
                	.ignoring()
                	.requestMatchers(new AntPathRequestMatcher("/assets/**"));
            }
        };
    }

    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
    	// UsernamePasswordAuthenticationFilter
    	// DefaultLoginPageGeneratingFilter
    	// DefaultLogoutPageGeneratingFilter
    	
    	/*
    	 securityFilterChain() 메서드에서는 HttpSecurity 객체를 사용하여 .formLogin()을 설정하였습니다. 이는 폼 기반 로그인을 활성화하고, /login 페이지를 자동으로 생성하여 사용자에게 제공합니다.
    	 */
    	http
        	.formLogin();
        
    	return http.build();
    }
}