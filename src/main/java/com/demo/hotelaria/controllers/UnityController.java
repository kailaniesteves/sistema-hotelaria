package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Unity;
import com.demo.hotelaria.repository.UnityRepository;
import com.demo.hotelaria.services.unity.UnityCreateService;
import com.demo.hotelaria.services.unity.UnityDeleteService;
import com.demo.hotelaria.services.unity.UnityUpdateService;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

@Controller
public class UnityController {

    public static final String MAIN_PATH = "hotelaria/demo/unity";
    private UnityRepository unityRepository;

    @GetMapping(MAIN_PATH + "/{tradeMark}/{cnpj}")
    public Unity getUnity(@PathVariable final String tradeMark, @PathVariable final Long cnpj) {
        return unityRepository.findByTradeMarkAndCnpj(tradeMark, cnpj).orElseThrow();
    }

    @PostMapping(MAIN_PATH)
    public Unity createUnity(@RequestBody final Unity unityToCreate) {
        return UnityCreateService.createUnity(unityToCreate);
    }

    @PutMapping(MAIN_PATH)
    public Unity updateUnity(@RequestBody final Unity unityToUpdate) {
        return UnityUpdateService.updateUnity(unityToUpdate);
    }

    @DeleteMapping(MAIN_PATH + "/{tradeMark}/{cnpj}")
    public void deleteUnity(@PathVariable final String tradeMark, @PathVariable final Long cnpj) {
        UnityDeleteService.deleteUnity(tradeMark, cnpj);
    }
}
