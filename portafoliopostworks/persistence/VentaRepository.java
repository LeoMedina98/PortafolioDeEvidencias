package org.bedu.java.backend.portafoliopostworks.persistence;

import org.bedu.java.backend.portafoliopostworks.persistence.entities.VentaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<VentaDTO, Long> {
}
