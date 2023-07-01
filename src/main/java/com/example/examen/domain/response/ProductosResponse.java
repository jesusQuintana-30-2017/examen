package com.example.examen.domain.response;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

// clase response donde se guardan las respuesta de los servicio de productos
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ProductosResponse {
    private Long producto_id;

    private Long orden_id;

    private String codigo;

    private String descripcion;

    private Double precio;
}
