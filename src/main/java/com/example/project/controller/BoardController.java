package com.example.project.controller;

import org.springframework.web.servlet.ModelAndView;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
public interface BoardController {
    public ModelAndView listArticles(HttpServletRequest request, HttpServletResponse response)
            throws Exception;
}