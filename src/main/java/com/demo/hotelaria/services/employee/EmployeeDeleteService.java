package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.repository.EmployeeRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class EmployeeDeleteService {

    private EmployeeRepository employeeRepository;
    public void deleteEmployee(final Long cpf) {
        employeeRepository.deleteById(cpf);
    }
}
