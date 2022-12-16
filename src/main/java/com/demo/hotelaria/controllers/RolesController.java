package com.demo.hotelaria.controllers;

import com.demo.hotelaria.domain.Roles;
import com.demo.hotelaria.repository.RolesRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

@Controller
@AllArgsConstructor
public class RolesController {

    public static final String MAIN_PATH = "hotelaria/demo/roles";
    private RolesRepository rolesRepository;

    @GetMapping(MAIN_PATH)
    @ResponseBody
    public List<Roles> getAllRoles() {
        return (List<Roles>) rolesRepository.findAll();
    }
}
