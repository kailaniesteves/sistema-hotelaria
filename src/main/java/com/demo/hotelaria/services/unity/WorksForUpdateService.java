package com.demo.hotelaria.services.unity;

import com.demo.hotelaria.domain.WorksFor;
import com.demo.hotelaria.repository.WorksForRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class WorksForUpdateService {

    public WorksForRepository worksForRepository;
    public WorksFor updateWorksFor(WorksFor worksForToUpdate) {
        WorksFor worksFor = worksForRepository.findByTradeMarkAndCnpjAndCpf(
                worksForToUpdate.getTradeMark(),
                worksForToUpdate.getCnpj(),
                worksForToUpdate.getCpf())
                .orElseThrow();
        worksFor = worksForToUpdate;
        return worksForRepository.save(worksFor);
    }
}
