package com.example.examen.access.Imp;
import java.sql.Connection;
import com.example.examen.access.IAccesDB;
import com.example.examen.models.OrdenCompra;
import org.springframework.stereotype.Repository;

import java.util.AbstractList;
import java.util.Date;
import java.util.List;


@Repository("IAccesDB")
public class AccessDB implements IAccesDB {

    private static Connection conn;

    @Override
    public List<OrdenCompra> getOrdenesCompra() {
        OrdenCompra orden = new OrdenCompra();
        orden.setId(2);
        orden.setSucursal_id(4);
        orden.setFecha(new Date());
        orden.setTotal(245.79);
        List<OrdenCompra> oc = (List<OrdenCompra>) new OrdenCompra();
        return oc;

    }
}
