package com.example.examen.models;

import jakarta.persistence.*;
import lombok.Data;
import java.util.Date;
//modelo de la tabla ordenes
@Data
@Entity
public class Ordenes {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long orden_id;

    private Long sucursal_id;

    private Date fecha;

    private Double Total;

    public Ordenes(Long sucursal_id,Date fecha,Double Total){
        this.sucursal_id=sucursal_id;
        this.fecha = fecha;
        this.Total = Total;
    }


    public Ordenes() {

    }
}
