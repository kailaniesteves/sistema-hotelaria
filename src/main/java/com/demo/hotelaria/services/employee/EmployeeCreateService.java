package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeCreateService {
    private EmployeeRepository employeeRepository;
    public Employee createEmployee(final Employee employeeToCreate) {
       return employeeRepository.save(employeeToCreate);
    }
}