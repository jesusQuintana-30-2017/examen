package com.example.examen.domain.request;

import com.example.examen.models.Productos;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;

//clase request donde recibimos los datos de entrada de orden de compra
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenCompraRequest {

    private Long orden_id;

    private Long sucursal_id;

    private Date fecha;

    private Double Total;

    private List<Productos> productos;
}
