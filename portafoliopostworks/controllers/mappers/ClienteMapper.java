package org.bedu.java.backend.portafoliopostworks.controllers.mappers;

import org.bedu.java.backend.portafoliopostworks.model.Cliente;
import org.bedu.java.backend.portafoliopostworks.persistence.entities.ClienteDTO;
import org.mapstruct.Mapper;

@Mapper(componentModel = "spring")
public interface ClienteMapper {
    ClienteDTO clienteModelToClienteEntity(Cliente cliente);

    Cliente clienteEntityToClienteModel(ClienteDTO cliente);
}
