package com.bitcamp.web.security;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;


import lombok.extern.java.Log;

/**
 * SecurityConfig
 */
@Log
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {
    @Override
    protected void configure(HttpSecurity http) throws Exception {
        log.info("Security config .....");
        /** build pattern */
        http.authorizeRequests()
            .antMatchers("/cunstomer/**").permitAll()
            .antMatchers("/employee/**").hasRole("MANAGER");
        
        http.formLogin();
    }

    @Autowired
    public void configureGlobal(Authentication)
}