package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeUpdateService {

    private EmployeeRepository employeeRepository;
    public Employee updateEmployee(Employee employeeToUpdate) {
        Employee oldEmployee = employeeRepository.findByCpf(employeeToUpdate.getCpf()).orElseThrow();
        oldEmployee = employeeToUpdate;
        return employeeRepository.save(oldEmployee);
    }
}
