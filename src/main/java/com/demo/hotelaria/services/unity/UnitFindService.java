package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.domain.Unit;
import com.demo.hotelaria.domain.WorksFor;
import com.demo.hotelaria.repository.UnitRepository;
import com.demo.hotelaria.repository.WorksForRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class UnitFindService {

    private WorksForRepository worksForRepository;
    private UnitRepository unitRepository;
    private Unit unit;

    public List<Unit> findUnitiesByWorksFor(final Employee employee) {
        List<Unit> returnList = new ArrayList<>();
        List<WorksFor> list = worksForRepository.findAllByCpf(employee.getCpf());
        for (WorksFor w : list) {
            unit = unitRepository.findByTradeMarkAndCnpj(w.getTradeMark(), w.getCnpj()).orElseThrow(RuntimeException::new);
            returnList.add(unit);
        }
        return returnList;
    }
}
