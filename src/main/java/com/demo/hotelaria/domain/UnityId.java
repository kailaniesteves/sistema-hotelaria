package com.demo.hotelaria.domain;

import java.io.Serializable;

public class UnityId implements Serializable {

    private String tradeMark;
    private Long cnpj;

    public UnityId(){

    }

    public UnityId(String tradeMark, Long cnpj) {
        this.tradeMark = tradeMark;
        this.cnpj = cnpj;
    }

}
