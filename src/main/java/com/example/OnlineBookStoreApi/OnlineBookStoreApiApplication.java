package com.example.OnlineBookStoreApi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.DefaultSecurityFilterChain;

@SpringBootApplication
public class OnlineBookStoreApiApplication {

	public static void main(String[] args) {
		SpringApplication.run(OnlineBookStoreApiApplication.class, args);
		BCryptPasswordEncoder pe = new BCryptPasswordEncoder();
		String encoderpas = pe.encode("12345Wq");
		System.out.println("encoderPas : " +encoderpas);
	}
/*	@Bean
	public PasswordEncoder encoder() {
		return new BCryptPasswordEncoder();
	}
	public SecurityWebFilterChain securityFilterChain(ServerHttpSecurity httpSecurity){
		return httpSecurity
				.csrf()
				.disable()
				.authorizeExchange(authorizeExchangeSpec -> authorizeExchangeSpec.anyExchange().permitAll())
				.build();
	}*/

	@Bean
	public InMemoryUserDetailsManager userDetailsService(){
		UserDetails user = User.withUsername("user")
				.password(encoder().encode("userPass"))
				.roles("USER")
				.build();
		return new InMemoryUserDetailsManager(user);

	}
	@Bean
	public PasswordEncoder encoder(){
		return new BCryptPasswordEncoder();

	}
	@Bean
	public DefaultSecurityFilterChain securityWebFilterChain(HttpSecurity http) throws Exception{
		http.authorizeHttpRequests(authorizeRequests -> authorizeRequests.anyRequest()
				.permitAll());
		http.csrf().disable();
		return http.build();
	}
	/*yorum satırı eklendi*/

}
