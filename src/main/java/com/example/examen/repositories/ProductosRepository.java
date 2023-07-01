package com.example.examen.repositories;

import com.example.examen.domain.request.ProductosRequest;
import com.example.examen.models.Ordenes;
import com.example.examen.models.Productos;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;
import java.util.Optional;

public interface ProductosRepository extends CrudRepository<Productos, Long> {

    @Query("SELECT p FROM Productos p WHERE p.orden_id = :id")
    List<Productos> SelectProductos(@Param("id")Long orden_id);

    @Procedure("SP_PUT_PRODUCTOS")
    void ActulizarPrecio(@Param("Precio")Double precio,@Param("Cod")String codigo);



}
