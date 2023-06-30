package com.example.examen.controllers;

import com.example.examen.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
@EnableWebMvc
@RestController
@RequestMapping("/miruta")
public class MainController {

    @Autowired
    private IService iService;

    @GetMapping(value = "/getOrdenesCompra",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getOrdenesCompra() {

        return iService.getOrdenesCompra();

    }


}
