package com.example.examen.repositories;

import com.example.examen.models.Ordenes;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface OrdenesRepository extends CrudRepository<Ordenes, Long> {

    public List<Ordenes> findAll();

    public Optional<Ordenes> findById(Long Orden_id);

    @Procedure(procedureName = "SP_SET_ORDENES", outputParameterName = "Id")
    public Long insertOrdenes(@Param("sucursalId") Long sucursal_id,
                              @Param("Total") Double total);
    @Procedure("SP_SET_PRODUCTOS")
    public void insertProductos(@Param("ordenId") Long Orden_id,
                                @Param("codigo") String Codigo,
                                @Param("descripcion") String Descripcion,
                                @Param("precio") Double Precio);
}
