package com.ai.config;

import com.ai.handlers.AuthSuccessHandler;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.config.annotation.web.servlet.configuration.EnableWebMvcSecurity;


@EnableWebMvcSecurity
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
        auth.inMemoryAuthentication()
                .withUser("user").password("user").roles("USER").and().withUser("admin").password("admin").roles("ADMIN");

    }

    @Override
    public void configure(WebSecurity web) throws Exception {
        super.configure(web);
    }


    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http
                .formLogin().loginPage("/login").failureUrl("/login?error")
                .usernameParameter("login").passwordParameter("password").permitAll().successHandler(new AuthSuccessHandler())
                .and()
                .logout().logoutUrl("/logout").logoutSuccessUrl("/").permitAll().permitAll()
                .and()
                .authorizeRequests()
                .antMatchers("/user").hasRole("USER");
        http.csrf().disable();
    }
}