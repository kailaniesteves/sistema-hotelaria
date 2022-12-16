package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.domain.Unit;
import com.demo.hotelaria.repository.UnitRepository;
import org.springframework.stereotype.Service;

@Service
public class UnityUpdateService {

    public static UnitRepository unitRepository;
    public static Unit updateUnity(Unit unitToUpdate) {
        Unit oldUnit = unitRepository.findByTradeMarkAndCnpj(
                unitToUpdate.getTradeMark(),
                unitToUpdate.getCnpj())
                .orElseThrow();
        oldUnit = unitToUpdate;
        return unitRepository.save(oldUnit);
    }
}
