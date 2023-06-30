package com.example.examen.models;

import com.example.examen.utilities.annotations.DBField;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;


@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class OrdenCompra {
    private static final long serialVersionUID = 1L;

    @DBField(name = "id")
    private Integer id;

    @DBField(name = "sucursal_id")
    private Integer sucursal_id;

    @DBField(name = "fecha")
    private Date fecha;

    @DBField(name = "Total")
    private Double Total;
}
