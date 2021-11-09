package com.felixwc.springboot.security.config;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * in order to learn java!
 * created at 2021/11/9 15:10
 *
 * @author wangchao
 */
@Configuration
public class MySecurityConfig extends WebSecurityConfigurerAdapter {
    private final UserDetailsService userDetailsService;

    public MySecurityConfig(@Qualifier("userDetailsService") UserDetailsService userDetailsService) {
        this.userDetailsService = userDetailsService;
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder();
    }

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.userDetailsService(userDetailsService).passwordEncoder(passwordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.formLogin().loginPage("/login.html").loginProcessingUrl("/user/login")
                .defaultSuccessUrl("/index.html").permitAll()
                .and()
                .authorizeRequests().antMatchers("/","/user/login").permitAll()
                .antMatchers(HttpMethod.POST).hasAuthority("modify")
                .anyRequest().authenticated()
                .and().csrf().disable();
        http.sessionManagement().maximumSessions(1);
    }
}
