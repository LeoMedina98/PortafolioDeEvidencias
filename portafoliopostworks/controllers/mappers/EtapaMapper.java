package org.bedu.java.backend.portafoliopostworks.controllers.mappers;

import org.bedu.java.backend.portafoliopostworks.model.Etapa;
import org.bedu.java.backend.portafoliopostworks.persistence.entities.EtapaDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")

public interface EtapaMapper {
    EtapaDTO etapaModelToEtapaEntity(Etapa etapaModel);

    Etapa etapaEntityToEtapaModel(EtapaDTO etapa);
}
