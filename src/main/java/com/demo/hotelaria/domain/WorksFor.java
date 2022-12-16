package com.demo.hotelaria.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.IdClass;
import lombok.Data;

@Entity
@Data
@IdClass(WorksForId.class)
public class WorksFor {

    @Id
    private Long cpf;
    @Id
    private Long cnpj;
    @Id
    private String tradeMark;
}
