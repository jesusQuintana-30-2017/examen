package com.example.examen.domain.response;

import com.example.examen.models.OrdenCompra;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Date;
import java.util.List;


@Data
@EqualsAndHashCode(callSuper = false)
@NoArgsConstructor
@AllArgsConstructor
public class OrdenesCompraResponse {

    List<OrdenCompra> OrdenesCompra;
}
