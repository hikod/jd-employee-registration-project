package com.hd.employeeregistrationproject.controller;

import com.hd.employeeregistrationproject.bootstrap.DataGenerator;
import com.hd.employeeregistrationproject.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.validation.Valid;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createEmployee(Model model){
        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());
        return "/employee/employee-create";
    }

    @PostMapping("/list")
    public String listEmployee(@Valid @ModelAttribute("employee") Employee employee, BindingResult bindingResult, Model model){
        if(bindingResult.hasErrors()) {
            model.addAttribute("states", DataGenerator.getAllStates());
            return "/employee/employee-create";
        }

        //capturing the employee first
        DataGenerator.saveEmployee(employee);

        //passing the whole employee list to render
        model.addAttribute("employees", DataGenerator.readAllEmployee());
        return "/employee/employee-list";
    }
}
