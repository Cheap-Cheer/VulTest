package com.vul.vultest.controller;

import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.IOException;

@RestController
@RequestMapping("/basic")
public class BasicController {
    @PostMapping("/cwe601")
    public void cwe601(HttpServletRequest request, HttpServletResponse response) throws IOException {
        response.sendRedirect(request.getParameter("target"));
    }
}
