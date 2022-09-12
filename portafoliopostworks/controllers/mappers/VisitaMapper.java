package org.bedu.java.backend.portafoliopostworks.controllers.mappers;

import org.bedu.java.backend.portafoliopostworks.model.Visita;
import org.bedu.java.backend.portafoliopostworks.persistence.entities.VisitaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface VisitaMapper {
    VisitaDTO visitaModelToVisitaEntity(Visita visitaModel);

    Visita visitaEntityToVisitaModel(VisitaDTO visita);
}
