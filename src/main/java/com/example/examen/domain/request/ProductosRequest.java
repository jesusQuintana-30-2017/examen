package com.example.examen.domain.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

//clase request para recibir los datos de productos
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductosRequest {
    private Long producto_id;

    private Long orden_id;

    private String codigo;

    private String descripcion;

    private Double precio;
}
