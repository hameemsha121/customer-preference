//package com.cts.superstore.security;
//
//import javax.sql.DataSource;
//
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.context.annotation.Bean;
//import org.springframework.context.annotation.Configuration;
//import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
//import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
//import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
//import org.springframework.web.cors.CorsConfiguration;
//import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
//import org.springframework.web.filter.CorsFilter;
//
//@Configuration
//@EnableWebSecurity
//public class SpringSecurityConfiguration extends WebSecurityConfigurerAdapter {
//	
//	@Autowired
//	DataSource dataSource;
//
//	protected void configure(HttpSecurity http) throws Exception {
//		http
//		.httpBasic()
//        .and()
//        .authorizeRequests()
//        .antMatchers("/**").permitAll()
//		.antMatchers("/get-customer-id-service/**").permitAll()
//		.antMatchers("/generate-report-service/**").permitAll()
//		.antMatchers("/customer-preference-service/**").permitAll()
////		.antMatchers("/get-customer-id-service/**").access("hasRole('ADMIN')")
////		.antMatchers("/generate-report-service/**").access("hasRole('ADMIN')")
////		.antMatchers("/customer-preference-service/**").access("hasRole('ADMIN')")
//		.and()
//        .csrf().disable();
//		
//	}
//	
//	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
//		
////		auth.jdbcAuthentication()
////	      .dataSource(dataSource)
////	      .usersByUsernameQuery("select * from customer where id=?")
////	      .authoritiesByUsernameQuery("select * from customer where id=?");
////	}
//		
//		auth.inMemoryAuthentication()
//		.withUser("admin").password("password").roles("USER");
//        
//	}
//	
//	
//	@Bean
//	public CorsFilter corsFilter() {
//		
//		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
//		CorsConfiguration config = new CorsConfiguration();
//		config.setAllowCredentials(true);
//		config.addAllowedOrigin("*");
//		config.addAllowedHeader("*");
//		config.addAllowedMethod("GET");
//		config.addAllowedMethod("POST");
//		config.addAllowedMethod("PUT");
//		source.registerCorsConfiguration("/**", config);
//		return new CorsFilter(source);
//	}
//	
//	
//}
