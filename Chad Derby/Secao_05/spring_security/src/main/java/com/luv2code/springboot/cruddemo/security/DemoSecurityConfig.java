package com.luv2code.springboot.cruddemo.security;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.provisioning.JdbcUserDetailsManager;
import org.springframework.security.provisioning.UserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
	private static final String ROLE1 = "EMPLOYEE";
	private static final String ROLE2 = "MANAGER";
	private static final String ROLE3 = "ADMIN";

	@Bean
	public UserDetailsManager userDetailsManager(DataSource dataSource){
		JdbcUserDetailsManager jdbcUserDetailsManager = new JdbcUserDetailsManager(dataSource);
		jdbcUserDetailsManager.setUsersByUsernameQuery("select user_id, pw, active from members where user_id=?");
		jdbcUserDetailsManager.setAuthoritiesByUsernameQuery("select user_id, role from roles where user_id=?");
		return jdbcUserDetailsManager;
	}

	@Bean
	public SecurityFilterChain filterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(configurer  -> 
			configurer
				.requestMatchers(HttpMethod.GET, "/api/employees").hasRole(ROLE1)
				.requestMatchers(HttpMethod.GET, "/api/employees/**").hasRole(ROLE1)
				.requestMatchers(HttpMethod.POST, "/api/employees").hasRole(ROLE2)
				.requestMatchers(HttpMethod.PUT, "/api/employees/**").hasRole(ROLE2)
				.requestMatchers(HttpMethod.DELETE, "/api/employees/**").hasRole(ROLE3));

		http.httpBasic(Customizer.withDefaults());

		http.csrf(csrf -> csrf.disable());

		http.cors(cors -> cors.disable());

		return http.build();
	}
}
