package com.demo.hotelaria.domain;

import java.io.Serializable;

public class WorksForId implements Serializable {

    private Long cpf;
    private Long cnpj;
    private String tradeMark;

    public WorksForId(){}

    public WorksForId(final Long cpf, final Long cnpj, final String tradeMark) {
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.tradeMark = tradeMark;
    }
}
