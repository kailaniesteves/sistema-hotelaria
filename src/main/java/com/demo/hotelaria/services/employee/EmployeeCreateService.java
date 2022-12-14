package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeCreateService {

    private static EmployeeRepository employeeRepository;
    public static Employee createEmployee(final Employee employeeToCreate) {
       return employeeRepository.save(employeeToCreate);
    }
}