package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class DemoSecurityConfig {
	private static final String ROLE1 = "EMPLOYEE";
	private static final String ROLE2 = "MANAGER";
	private static final String ROLE3 = "ADMIN";

	@Bean
	public InMemoryUserDetailsManager userDetailsManager(){
		UserDetails john = User.builder()
			.username("john")
			.password("{noop}test123")
			.roles(ROLE1)
			.build();

		UserDetails mary = User.builder()
			.username("mary")
			.password("{noop}test123")
			.roles(ROLE1, ROLE2)
			.build();

		UserDetails susan = User.builder()
			.username("susan")
			.password("{noop}test123")
			.roles(ROLE1, ROLE2, ROLE3)
			.build();

		return new InMemoryUserDetailsManager(john, mary, susan);
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
