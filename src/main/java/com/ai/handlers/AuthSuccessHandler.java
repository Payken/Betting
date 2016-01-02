package com.ai.handlers;

import org.springframework.security.web.authentication.SavedRequestAwareAuthenticationSuccessHandler;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by fdarmoch on 2016-01-02.
 */
public class AuthSuccessHandler extends SavedRequestAwareAuthenticationSuccessHandler {

    @Override
    protected String determineTargetUrl(HttpServletRequest request, HttpServletResponse response) {
//        String role = SecurityContextHolder.getContext().getAuthentication().getAuthorities().toString();
        String targetUrl = "index";
        return targetUrl;
    }
}