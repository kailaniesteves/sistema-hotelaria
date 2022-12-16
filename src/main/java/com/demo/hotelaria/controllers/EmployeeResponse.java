package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.domain.HealthPlan;
import com.demo.hotelaria.domain.Roles;
import com.demo.hotelaria.domain.Unit;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeResponse {

    private Employee employee;
    private Roles roles;
    private HealthPlan healthPlan;
    private List<Unit> unitList;
}
