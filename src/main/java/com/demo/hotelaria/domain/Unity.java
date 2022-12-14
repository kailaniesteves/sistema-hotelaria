package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Unity {

    @Id
    private String tradeMark;
    @Id
    private Long cnpj;
    private Double area;
    private String category;
    private String sector;
    private String state;
    private String country;
    private String street;
    private String city;
}
