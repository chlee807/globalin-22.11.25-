package edu.global.ex.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import edu.global.ex.security.CustomUserDetailsService;

//시큐리티 설정 클래스 만들기

@Configuration // 이 클래스는 설정 파일인 것을 알려주고, 부모가 @Component + 설정
@EnableWebSecurity // 스프링 시큐리티 필터가 스프링 필터체인에 등록됨
public class SecutrityConfig extends WebSecurityConfigurerAdapter {

	// 개발자가 커스텀마이징
	@Autowired
	private CustomUserDetailsService customUserDetailsService;

	@Override
	protected void configure(HttpSecurity http) throws Exception {
		// 우선 CSRF설정을 해제한다.
		// 초기개발 시에만 해 주는 것이 좋다.
		/* http.csrf().disable(); */

		// http.httpBasic();
		// 스프링 시큐리티에서 제공하는 기본 로그인 폼을 사용하겠다.
		// 로그인 폼을 커스텀마이징..
		// http://localhost:8282/login
		http.formLogin()
			.loginPage("/login")
			.usernameParameter("ID")
			.passwordParameter("PW")
			.defaultSuccessUrl("/");

		http.authorizeHttpRequests()
		.antMatchers("/user/**").hasAnyRole("USER", "ADMIN")
		.antMatchers("/admin/**").hasAnyRole("ADMIN")
		.antMatchers("/**").permitAll();
	}

	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		// id, pw 생성 (실무에서는 일반적으로 DB에서 가져옴)
		// auth.inMemoryAuthentication().withUser("user").password("{noop}user").roles("USER");
		// auth.inMemoryAuthentication().withUser("admin").password("{noop}admin").roles("ADMIN");
		
		auth.userDetailsService(customUserDetailsService)
		.passwordEncoder(new BCryptPasswordEncoder());
	}
}
