package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Unit;
import com.demo.hotelaria.repository.UnitRepository;
import com.demo.hotelaria.services.unity.UnityCreateService;
import com.demo.hotelaria.services.unity.UnityDeleteService;
import com.demo.hotelaria.services.unity.UnityUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class UnityController {

    public static final String MAIN_PATH = "hotelaria/demo/unity";
    private UnitRepository unitRepository;
    private UnityCreateService unityCreateService;
    private UnityDeleteService unityDeleteService;

    @GetMapping(MAIN_PATH + "/{tradeMark}/{cnpj}")
    @ResponseBody
    public Unit getUnity(@PathVariable final String tradeMark, @PathVariable final Long cnpj) {
        return unitRepository.findByTradeMarkAndCnpj(tradeMark, cnpj).orElseThrow();
    }

    @GetMapping(MAIN_PATH)
    @ResponseBody
    public List<Unit> getAllUnities() {
        return (List<Unit>) unitRepository.findAll();
    }

    @PostMapping(MAIN_PATH)
    @ResponseBody
    public Unit createUnity(@RequestBody final Unit unitToCreate) {
        System.out.println(unitToCreate);
        return unityCreateService.createUnity(unitToCreate);

    }

    @PutMapping(MAIN_PATH)
    @ResponseBody
    public Unit updateUnity(@RequestBody final Unit unitToUpdate) {
        return UnityUpdateService.updateUnity(unitToUpdate);
    }

    @DeleteMapping(MAIN_PATH + "/{tradeMark}/{cnpj}")
    @ResponseBody
    public ResponseEntity<String> deleteUnity(@PathVariable final String tradeMark, @PathVariable final Long cnpj) {
        unityDeleteService.deleteUnity(tradeMark, cnpj);
        return new ResponseEntity<>(HttpStatusCode.valueOf(200));
    }
}
