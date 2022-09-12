package org.bedu.java.backend.portafoliopostworks.controllers.mappers;

import org.bedu.java.backend.portafoliopostworks.model.Producto;
import org.bedu.java.backend.portafoliopostworks.persistence.entities.ProductoDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface ProductoMapper {
    ProductoDTO productoModelToProductoEntity(Producto productoModel);

    Producto productoEntityToProductoModel(ProductoDTO producto);
}
