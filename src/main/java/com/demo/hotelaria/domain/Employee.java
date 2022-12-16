package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
public class Employee {

    @Id
    private Long cpf;
    private String contract_type;
    private Long IdRol;
    private Double vr;
    private Double vt;
    private Long IdSup;
    private Long IdHea;
    private Double salary;
    private String namFirstName;
    private String namLastName;

    public Long getIdRol() {
        return IdRol;
    }

    public void setIdRol(Long idRol) {
        IdRol = idRol;
    }

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

    public Long getIdHea() {
        return IdHea;
    }

    public void setIdHea(Long idHea) {
        IdHea = idHea;
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
