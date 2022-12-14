package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeUpdateService {

    private static EmployeeRepository employeeRepository;
    public static Employee updateEmployee(Employee employeeToUpdate) {
        Employee oldEmployee = employeeRepository.findByCpf(employeeToUpdate.getCpf()).orElseThrow();
        oldEmployee = employeeToUpdate;
        return employeeRepository.save(oldEmployee);
    }
}
