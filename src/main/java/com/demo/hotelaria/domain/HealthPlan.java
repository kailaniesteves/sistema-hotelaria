package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class HealthPlan {

    @Id
    private Long idHea;
    private String healthPlanName;
    private String pricePerEmployee;
    private Long idIns;
}
