package com.example.examen.domain.response;

import com.example.examen.models.Ordenes;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.List;

// clase response donde se guardan las respuesta de la lista de ordenes
@Data
@NoArgsConstructor
@AllArgsConstructor
public class OrdenesCompraResponse {

    List<Ordenes> OrdenesCompra;
}
