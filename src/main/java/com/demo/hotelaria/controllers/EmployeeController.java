package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.repository.EmployeeRepository;
import com.demo.hotelaria.services.employee.EmployeeCreateService;
import com.demo.hotelaria.services.employee.EmployeeDeleteService;
import com.demo.hotelaria.services.employee.EmployeeUpdateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class EmployeeController {

    private static final String MAIN_PATH = "hotelaria/demo/employee";
    private EmployeeRepository employeeRepository;

    @GetMapping(MAIN_PATH + "/{cpf}")
    public Employee getEmployee(@PathVariable final Long cpf) {
        return employeeRepository.findByCpf(cpf).orElseThrow();
    }

    @PostMapping(MAIN_PATH)
    public Employee createEmployee(@RequestBody final Employee employeeToCreate) {
        return EmployeeCreateService.createEmployee(employeeToCreate);
    }

    @PutMapping(MAIN_PATH)
    public Employee updateEmployee(@RequestBody final Employee employeeToUpdate) {
        return EmployeeUpdateService.updateEmployee(employeeToUpdate);
    }

    @DeleteMapping(MAIN_PATH + "/{cpf}")
    public void deleteEmployee(@PathVariable final Long cpf) {
        EmployeeDeleteService.deleteEmployee(cpf);
    }
}



