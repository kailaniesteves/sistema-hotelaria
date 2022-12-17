package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    private Long cpf;
    private String contract_type;
    private Long IdRol;
    private Double vr;
    private Double vt;
    private Long IdSup;
    private Long IdHea;
    private Long salary;
    private String namFirstName;
    private String namLastName;
}
