package com.example.examen.domain.response;

import com.example.examen.models.Productos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

// clase response donde se guardan las respuesta de los servicio de ordenes
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenCompraResponse {

    private Long orden_id;

    private Long sucursal_id;

    private Date fecha;

    private Double Total;

    private List<Productos> productos;
}
