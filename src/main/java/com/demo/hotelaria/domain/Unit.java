package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Data
@Entity
@IdClass(UnityId.class)
public class Unit {

    @Id
    private String tradeMark;
    @Id
    private Long cnpj;
    private Double area;
    private String category;
    private String sector;
    private String locState;
    private String locCountry;
    private String locStreet;
    private String locCity;
}
