package com.joanvasquez.interceptor.interceptortest.controllers;

import org.springframework.web.bind.annotation.RestController;

import jakarta.servlet.http.HttpServletRequest;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class ReqWithServlet {

    @GetMapping("/reqwithservlet")
    public ResponseEntity getMethodName(HttpServletRequest request) {

        return ResponseEntity.ok(request.getAttribute("meeting"));
    }
    
}
