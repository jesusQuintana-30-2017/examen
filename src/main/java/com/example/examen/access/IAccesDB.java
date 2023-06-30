package com.example.examen.access;

import com.example.examen.models.OrdenCompra;

import java.util.List;

public interface IAccesDB {

    List<OrdenCompra> getOrdenesCompra();
}
