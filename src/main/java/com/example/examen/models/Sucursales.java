package com.example.examen.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
//modelo de la tabla sucursales
@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
public class Sucursales {

    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private Long sucursal_id;

    private String nombre;
}
