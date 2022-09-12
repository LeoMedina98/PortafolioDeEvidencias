package org.bedu.java.backend.portafoliopostworks.persistence;

import org.bedu.java.backend.portafoliopostworks.persistence.entities.ClienteDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<ClienteDTO, Long> {
}
