package com.example.examen.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//modelo de la tabla productos
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Productos {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long producto_id;

    private Long orden_id;

    private String codigo;

    private String descripcion;

    private Double precio;

}
