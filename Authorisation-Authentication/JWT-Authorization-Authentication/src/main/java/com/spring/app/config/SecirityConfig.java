package com.spring.app.config;

import java.net.http.HttpRequest;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.http.SessionCreationPolicy;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.stereotype.Component;

@Component
public class SecirityConfig {

//	@Bean
//	public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
//
//		return http.csrf(cs -> cs.disable()).authorizeRequests().requestMatchers("Register").permitAll().anyRequest()
//				.authenticated().and().build();
//
//	}

	@Bean
	SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {

		return http.build();
	}

}
