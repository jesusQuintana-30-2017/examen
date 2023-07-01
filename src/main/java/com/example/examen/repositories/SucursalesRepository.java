package com.example.examen.repositories;

import com.example.examen.models.Sucursales;
import org.springframework.data.repository.CrudRepository;

import java.util.Optional;

public interface SucursalesRepository extends CrudRepository<Sucursales, Long> {

}
