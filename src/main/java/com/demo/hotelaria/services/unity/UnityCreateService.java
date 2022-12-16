package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.domain.Unit;
import com.demo.hotelaria.repository.UnitRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class UnityCreateService {

    private UnitRepository unitRepository;
    public Unit createUnity(Unit unitToCreate) {
        return unitRepository.save(unitToCreate);
    }
}