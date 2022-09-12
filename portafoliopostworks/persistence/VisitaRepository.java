package org.bedu.java.backend.portafoliopostworks.persistence;

import org.bedu.java.backend.portafoliopostworks
.persistence.entities.VisitaDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepository extends JpaRepository<VisitaDTO, Long> {
}
