package com.example.examen.controllers;

import com.example.examen.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
@RequestMapping("/examen")
public class MainController {

    @Autowired
    private IService iService;

    @GetMapping(value = "/getOrdenesCompra",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getOrdenesCompra() {

        return iService.getOrdenesCompra();

    }


}
