package com.example.examen.service.Imp;
import com.example.examen.domain.request.OrdenCompraRequest;
import com.example.examen.domain.request.ProductosRequest;
import com.example.examen.domain.response.*;
import com.example.examen.models.Ordenes;
import com.example.examen.models.Productos;
import com.example.examen.repositories.OrdenesRepository;
import com.example.examen.repositories.ProductosRepository;
import com.example.examen.service.IService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.management.Query;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.logging.ConsoleHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
import java.util.logging.Logger;

@Service
public class ServiceImp implements IService {
    private final static Logger LOGGER = Logger.getLogger("ServiceImp");
    Handler consoleHandler = new ConsoleHandler();
    @Autowired
    private OrdenesRepository ordenesRepository;

    @Autowired
    private ProductosRepository productosRepository;
    @Override
    public OrdenesCompraResponse getOrdenesCompra() {
        OrdenesCompraResponse result= new OrdenesCompraResponse();
        try {
            List<Ordenes> list = new ArrayList<>();
            ordenesRepository.findAll().forEach(e -> list.add(e));
            result.setOrdenesCompra(list);
        }
        catch (Exception e)
        {
            String exception = "Exception in getOrdenesCompra - " + e.getMessage();
            LOGGER.log(Level.INFO, exception);
        }
        return result;
    }

    @Override
    public Ordenes setOrdenesCompra(OrdenCompraRequest request) {
        Ordenes orden = new Ordenes();
        try {
            List<Productos> productos = request.getProductos();
            request.setTotal(
                    productos.stream()
                            .mapToDouble(o -> o.getPrecio())
                            .sum()
            );
            orden.setOrden_id(ordenesRepository.insertOrdenes(request.getSucursal_id(), request.getTotal()));
            for (Productos prod : productos) {
                ordenesRepository.insertProductos(
                        orden.getOrden_id(),
                        prod.getCodigo(),
                        prod.getDescripcion(),
                        prod.getPrecio()
                );

            }
        }
        catch (Exception e)
        {
            String exception = "Exception in setOrdenesCompra - " + e.getMessage();
            LOGGER.log(Level.INFO, exception);
        }
        return orden;
    }

    @Override
    public OrdenCompraResponse setOrdenCompra(OrdenCompraRequest request) {
        OrdenCompraResponse result = null;
        try {
            Optional<Ordenes> listOrdenes = ordenesRepository.findById(request.getOrden_id());
            List<Long> ids = new ArrayList<>();
            List<Productos> listProductos = productosRepository.SelectProductos(request.getOrden_id());
            result = new OrdenCompraResponse(
                    listOrdenes.get().getOrden_id(),
                    listOrdenes.get().getSucursal_id(),
                    listOrdenes.get().getFecha(),
                    listOrdenes.get().getTotal(),
                    listProductos
            );
        }
        catch (Exception e)
        {
            String exception = "Exception in setOrdenCompra - " + e.getMessage();
            LOGGER.log(Level.INFO, exception);
        }
        return result;
    }

    @Override
    public ProductosResponse putProducto(ProductosRequest request) {
        ProductosResponse result=new ProductosResponse();
        try{
        productosRepository.ActulizarPrecio(request.getPrecio(),request.getCodigo());
        result.setCodigo(request.getCodigo());
        }
        catch (Exception e)
        {
            String exception = "Exception in putProducto - " + e.getMessage();
            LOGGER.log(Level.INFO, exception);
        }
        return result;
    }
}
