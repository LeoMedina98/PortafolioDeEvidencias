package org.bedu.java.backend.portafoliopostworks.controllers.mappers;

import org.bedu.java.backend.portafoliopostworks.model.Venta;
import org.bedu.java.backend.portafoliopostworks.persistence.entities.VentaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface VentaMapper {
    VentaDTO ventaModelToVentaEntity(Venta ventaModel);

    Venta ventaEntityToVentaModel(VentaDTO venta);
}
