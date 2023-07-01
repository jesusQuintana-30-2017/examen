/*
    autor: Jesus quintana
    fecha: 30/06/2023
    Ultima Modifacion: 01/06/2023
 */
package com.example.examen.controllers;

import com.example.examen.domain.request.OrdenCompraRequest;
import com.example.examen.domain.request.ProductosRequest;
import com.example.examen.service.IService;
import com.google.gson.Gson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@CrossOrigin(origins = "*", methods = {RequestMethod.POST})
@EnableWebMvc
@RestController
@RequestMapping("/examen")
public class MainController {

    @Autowired
    private IService iService;

    //servicio que inserta una orden de compra con productos
    @PostMapping(value = "/setOrdenesCompra",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object setOrdenesCompra(@RequestBody OrdenCompraRequest request) {

        Gson gson = new Gson();
        String jsonString = gson.toJson(iService.setOrdenesCompra(request));
        return jsonString;

    }

    //servicio que de devuelve todas las ordenes de compra
    @GetMapping(value = "/getOrdenesCompra",
            produces = MediaType.APPLICATION_JSON_VALUE,
            consumes = MediaType.APPLICATION_JSON_VALUE)
    public Object getOrdenesCompra() {

        Gson gson = new Gson();
        String jsonString = gson.toJson(iService.getOrdenesCompra());
        return jsonString;

    }

    //servicio que regresa una orden de compra por id
    @GetMapping(value = "/getOrdenCompra/{orden_id}",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object getOrdenCompra(@PathVariable("orden_id") Long orden_id) {

        OrdenCompraRequest request=new OrdenCompraRequest();
        request.setOrden_id(orden_id);
        Gson gson = new Gson();
        String jsonString = gson.toJson(iService.setOrdenCompra(request));
        return jsonString;

    }

    //servicio que actuliza el precio de un producto
    @PutMapping(value = "/putProducto",
            produces = MediaType.APPLICATION_JSON_VALUE)
    public Object putProducto(@RequestBody ProductosRequest request) {

        Gson gson = new Gson();
        String jsonString = gson.toJson(iService.putProducto(request));
        return jsonString;

    }


}
