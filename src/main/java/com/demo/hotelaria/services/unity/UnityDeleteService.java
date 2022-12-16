package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.repository.UnitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UnityDeleteService {

    private UnitRepository unitRepository;
    public void deleteUnity(final String tradeMark, final Long cnpj) {
        unitRepository.deleteByTradeMarkAndCnpj(tradeMark, cnpj);
    }
}
