package com.example.demo.controller;

import com.example.demo.service.EmployeeService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    // distplay list of employee
    @GetMapping("/")
    public String viewHomePage(Model model) {
        model.addAttribute("listEmployee", employeeService.getAllEmployees());
        return "index";
    }
    
}
