package com.luv2code.springboot.cruddemo.security;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.configurers.provisioning.InMemoryUserDetailsManagerConfigurer;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;

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
			.password("{noop}test321")
			.roles(ROLE1, ROLE2)
			.build();

		UserDetails susan = User.builder()
			.username("susan")
			.password("{noop}test312")
			.roles(ROLE1, ROLE2, ROLE3)
			.build();

		return new InMemoryUserDetailsManager(john, mary, susan);
	}
}
