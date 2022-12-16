package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.controllers.EmployeeResponse;
import com.demo.hotelaria.controllers.mappers.EmployeeResponseMapper;
import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.domain.HealthPlan;
import com.demo.hotelaria.domain.Roles;
import com.demo.hotelaria.repository.EmployeeRepository;
import com.demo.hotelaria.repository.RolesRepository;
import com.demo.hotelaria.services.healthPlan.HealthPlanFindService;
import com.demo.hotelaria.services.unity.UnitFindService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeFindService {

    private EmployeeRepository employeeRepository;
    private EmployeeResponseMapper employeeResponseMapper;

    private RolesRepository rolesRepository;
    private UnitFindService unitFindService;

    private HealthPlanFindService healthPlanFindService;

    public EmployeeResponse findEmployee(final Long cpf) {
         Employee employee = employeeRepository.findByCpf(cpf).orElseThrow(RuntimeException::new);
         EmployeeResponse response = employeeResponseMapper.toEmployeeResponse(employee);
         response.setEmployeeHealthPlan(findHealthPlan(employee));
         response.setRoles(findRole(employee));
         response.setWorksFor(unitFindService.findUnitiesByWorksFor(employee));
         return response;
    }

    public List<EmployeeResponse> findAllEmployees() {
        List<EmployeeResponse> responses = new ArrayList<>();
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        for (Employee e : employees) {
            responses.add(findEmployee(e.getCpf()));
        }
        return responses;
    }

    private HealthPlan findHealthPlan(final Employee employee) {
        return healthPlanFindService.findHealthPlanById(employee);
    }

    private Roles findRole(final Employee employee) {
        return  rolesRepository.findById(employee.getIdRol()).orElseThrow(RuntimeException::new);
    }
}
