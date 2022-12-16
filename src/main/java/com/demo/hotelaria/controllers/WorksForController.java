package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.WorksFor;
import com.demo.hotelaria.repository.WorksForRepository;
import com.demo.hotelaria.services.unity.WorksForUpdateService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@AllArgsConstructor
public class WorksForController {
        public static final String MAIN_PATH = "hotelaria/demo/works_for";
        private WorksForRepository worksForRepository;
        private WorksForUpdateService worksForUpdateService;

        @GetMapping(MAIN_PATH + "/{cpf}/{tradeMark}/{cnpj}")
        @ResponseBody
        public WorksFor getWorkFor(@PathVariable final Long cpf, @PathVariable final String tradeMark, @PathVariable final Long cnpj) {
            return worksForRepository.findByTradeMarkAndCnpjAndCpf(tradeMark,cnpj,cpf).orElseThrow();
        }

        @GetMapping(MAIN_PATH)
        @ResponseBody
        public List<WorksFor> getAllWorkFor() {
            return (List<WorksFor>) worksForRepository.findAll();
        }

        @PostMapping(MAIN_PATH)
        @ResponseBody
        public WorksFor createUnity(@RequestBody final WorksFor worksForToCreate) {
            return worksForRepository.save(worksForToCreate);

        }

        @PutMapping(MAIN_PATH)
        @ResponseBody
        public WorksFor updateUnity(@RequestBody final WorksFor worksForToUpdate) {
            return worksForUpdateService.updateWorksFor(worksForToUpdate);
        }

        @DeleteMapping(MAIN_PATH + "/{cpf}/{tradeMark}/{cnpj}")
        @ResponseBody
        public ResponseEntity<String> deleteUnity(@PathVariable final Long cpf,@PathVariable final String tradeMark, @PathVariable final Long cnpj) {
            worksForRepository.deleteByTradeMarkAndCnpjAndCpf(tradeMark, cnpj, cpf);
            return new ResponseEntity<>(HttpStatusCode.valueOf(200));
        }

}
