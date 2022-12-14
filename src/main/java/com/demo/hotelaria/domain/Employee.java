package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Employee {

    @Id
    private Long cpf;
    private Long phoneNumber;
    private String email;
    private String role;
    private Double vr;
    private Double vt;
    private String healthPlan;
    private Double salary;
    private String address;
    private String firstName;
    private String lastName;
}
