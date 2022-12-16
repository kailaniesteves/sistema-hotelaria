package com.demo.hotelaria.services.healthPlan;

import com.demo.hotelaria.domain.Employee;
import com.demo.hotelaria.domain.HealthPlan;
import com.demo.hotelaria.repository.HealthPlanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class HealthPlanFindService {

    private HealthPlanRepository healthPlanRepository;

    public HealthPlan findHealthPlanById(final Employee employee) {
        return healthPlanRepository.findById(employee.getIdHea()).orElseThrow(RuntimeException::new);
    }
}
