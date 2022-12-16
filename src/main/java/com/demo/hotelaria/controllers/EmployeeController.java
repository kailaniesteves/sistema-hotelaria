package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.repository.EmployeeRepository;
import com.demo.hotelaria.services.employee.EmployeeCreateService;
import com.demo.hotelaria.services.employee.EmployeeDeleteService;
import com.demo.hotelaria.services.employee.EmployeeUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class EmployeeController {

    private static final String MAIN_PATH = "hotelaria/demo/employee";
    private EmployeeRepository employeeRepository;
    private EmployeeCreateService employeeCreateService;

    @GetMapping(MAIN_PATH + "/{cpf}")
    @ResponseBody
    public Employee getEmployee(@PathVariable final Long cpf) {
        return employeeRepository.findByCpf(cpf).orElseThrow();
    }

    @GetMapping(MAIN_PATH)
    @ResponseBody
    public List<Employee> getAllEmployees() {
        return (List<Employee>) employeeRepository.findAll();
    }

    @PostMapping(MAIN_PATH)
    @ResponseBody
    public Employee createEmployee(@RequestBody final Employee employeeToCreate) {
        return employeeCreateService.createEmployee(employeeToCreate);
    }

    @PutMapping(MAIN_PATH)
    @ResponseBody
    public Employee updateEmployee(@RequestBody final Employee employeeToUpdate) {
        return EmployeeUpdateService.updateEmployee(employeeToUpdate);
    }

    @DeleteMapping(MAIN_PATH + "/{cpf}")
    public void deleteEmployee(@PathVariable final Long cpf) {
        EmployeeDeleteService.deleteEmployee(cpf);
    }
}



