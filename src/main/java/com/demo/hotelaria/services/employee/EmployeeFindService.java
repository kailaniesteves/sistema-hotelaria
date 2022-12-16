package com.demo.hotelaria.services.employee;

import com.demo.hotelaria.controllers.EmployeeResponse;
import com.demo.hotelaria.domain.*;
import com.demo.hotelaria.repository.*;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class EmployeeFindService {

    private EmployeeRepository employeeRepository;
    private HealthPlanRepository healthPlanRepository;
    private RolesRepository rolesRepository;
    private WorksForRepository worksForRepository;
    private UnitRepository unitRepository;

    public EmployeeResponse findEmployee(final Long cpf) {
        Employee employee = employeeRepository.findByCpf(cpf).orElseThrow();
        HealthPlan healthPlan = healthPlanRepository.findById(employee.getIdHea()).orElseThrow();
        Roles roles = rolesRepository.findById(employee.getIdRol()).orElseThrow();

        return setEmployeeResponse(employee, healthPlan, roles, cpf);
    }

    private EmployeeResponse setEmployeeResponse(final Employee employee, final HealthPlan healthPlan, final Roles roles, final Long cpf) {
        EmployeeResponse employeeResponse = new EmployeeResponse();
        employeeResponse.setUnitList(findUnitList(cpf));
        employeeResponse.setEmployee(employee);
        employeeResponse.setRoles(roles);
        employeeResponse.setHealthPlan(healthPlan);

        return employeeResponse;
    }

    private List<Unit> findUnitList(final Long cpf) {
        List<Unit> unitList = new ArrayList<>();
        List<WorksFor> worksFor = worksForRepository.findByCpf(cpf);
        for (WorksFor w: worksFor) {
            unitList.add(unitRepository.findByTradeMarkAndCnpj(w.getTradeMark(), w.getCnpj()).orElseThrow());
        }

        return unitList;
    }

    public List<EmployeeResponse> findAllEmployees() {
        List<EmployeeResponse> employeesResponse = new ArrayList<>();
        List<Employee> employees = (List<Employee>) employeeRepository.findAll();
        for (Employee e : employees) {
            employeesResponse.add(findEmployee(e.getCpf()));
        }
        return employeesResponse;
    }
}
