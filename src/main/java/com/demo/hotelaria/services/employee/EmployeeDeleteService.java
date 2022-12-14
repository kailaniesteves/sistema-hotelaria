package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.repository.EmployeeRepository;
import org.springframework.stereotype.Service;

@Service
public class EmployeeDeleteService {

    private static EmployeeRepository employeeRepository;
    public static void deleteEmployee(final Long cpf) {
        employeeRepository.deleteById(cpf);
    }
}
