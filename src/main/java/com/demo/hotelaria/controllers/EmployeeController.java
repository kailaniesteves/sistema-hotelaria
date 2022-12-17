package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.services.employee.EmployeeCreateService;
import com.demo.hotelaria.services.employee.EmployeeDeleteService;
import com.demo.hotelaria.services.employee.EmployeeFindService;
import com.demo.hotelaria.services.employee.EmployeeUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@CrossOrigin(origins = {"http://localhost:5173/", "https://fanciful-seahorse-473f0d.netlify.app/", "*"},
methods={RequestMethod.GET, RequestMethod.PUT, RequestMethod.DELETE, RequestMethod.POST})
@AllArgsConstructor
public class EmployeeController {

    private static final String MAIN_PATH = "hotelaria/demo/employee";
    private EmployeeCreateService employeeCreateService;
    private EmployeeFindService employeeFindService;
    private EmployeeDeleteService employeeDeleteService;
    private EmployeeUpdateService employeeUpdateService;

    @GetMapping(MAIN_PATH + "/{cpf}")
    @ResponseBody
    public EmployeeResponse getEmployee(@PathVariable final Long cpf) {
        return employeeFindService.findEmployee(cpf);
    }
    @GetMapping(MAIN_PATH)
    @ResponseBody
    public List<EmployeeResponse> getAllEmployees() {
        return employeeFindService.findAllEmployees();
    }

    @PostMapping(MAIN_PATH)
    @ResponseBody
    public Employee createEmployee(@RequestBody final Employee employeeToCreate) {
        return employeeCreateService.createEmployee(employeeToCreate);
    }
    @PutMapping(MAIN_PATH)
    @ResponseBody
    public Employee updateEmployee(@RequestBody final Employee employeeToUpdate) {
        return employeeUpdateService.updateEmployee(employeeToUpdate);
    }

    @DeleteMapping(MAIN_PATH + "/{cpf}")
    @ResponseBody
    public ResponseEntity<String> deleteEmployee(@PathVariable final Long cpf) {
        employeeDeleteService.deleteEmployee(cpf);
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}



