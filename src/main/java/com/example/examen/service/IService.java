package com.example.examen.service;

import com.example.examen.domain.request.OrdenCompraRequest;
import com.example.examen.domain.request.ProductosRequest;
import com.example.examen.domain.response.OrdenCompraResponse;
import com.example.examen.domain.response.OrdenesCompraResponse;
import com.example.examen.domain.response.ProductosResponse;
import com.example.examen.models.Ordenes;

public interface IService {

    OrdenesCompraResponse getOrdenesCompra();

    Ordenes setOrdenesCompra(OrdenCompraRequest request);

    OrdenCompraResponse setOrdenCompra(OrdenCompraRequest request);

    ProductosResponse putProducto(ProductosRequest request);
}
