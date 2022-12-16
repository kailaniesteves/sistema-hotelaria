package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.HealthPlan;
import com.demo.hotelaria.domain.Roles;
import com.demo.hotelaria.domain.Unit;
import lombok.Data;

import java.util.List;

@Data
public class EmployeeResponse {

    private Long cpf;
    private String contract_type;
    private Roles roles;
    private List<Unit> worksFor;
    private Double vr;
    private Double vt;
    private Long IdSup;
    private HealthPlan employeeHealthPlan;
    private Double salary;
    private String namFirstName;
    private String namLastName;

    public Long getCpf() {
        return cpf;
    }

    public void setCpf(Long cpf) {
        this.cpf = cpf;
    }

    public String getContract_type() {
        return contract_type;
    }

    public void setContract_type(String contract_type) {
        this.contract_type = contract_type;
    }

    public Roles getRoles() {
        return roles;
    }

    public void setRoles(Roles roles) {
        this.roles = roles;
    }

    public List<Unit> getWorksFor() {
        return worksFor;
    }

    public void setWorksFor(List<Unit> worksFor) {
        this.worksFor = worksFor;
    }

    public Double getVr() {
        return vr;
    }

    public void setVr(Double vr) {
        this.vr = vr;
    }

    public Double getVt() {
        return vt;
    }

    public void setVt(Double vt) {
        this.vt = vt;
    }

    public Long getIdSup() {
        return IdSup;
    }

    public void setIdSup(Long idSup) {
        IdSup = idSup;
    }

    public HealthPlan getEmployeeHealthPlan() {
        return employeeHealthPlan;
    }

    public void setEmployeeHealthPlan(HealthPlan employeeHealthPlan) {
        this.employeeHealthPlan = employeeHealthPlan;
    }

    public Double getSalary() {
        return salary;
    }

    public void setSalary(Double salary) {
        this.salary = salary;
    }

    public String getNamFirstName() {
        return namFirstName;
    }

    public void setNamFirstName(String namFirstName) {
        this.namFirstName = namFirstName;
    }

    public String getNamLastName() {
        return namLastName;
    }

    public void setNamLastName(String namLastName) {
        this.namLastName = namLastName;
    }
}
