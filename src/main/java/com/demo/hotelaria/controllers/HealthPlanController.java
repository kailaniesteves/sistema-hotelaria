package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.HealthPlan;
import com.demo.hotelaria.repository.HealthPlanRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class HealthPlanController {

    public static final String MAIN_PATH = "hotelaria/demo/healthPlan";
    private HealthPlanRepository healthPlanRepository;

    @GetMapping(MAIN_PATH)
    @ResponseBody
    public List<HealthPlan> getAllRoles() {
        return (List<HealthPlan>) healthPlanRepository.findAll();
    }
}
