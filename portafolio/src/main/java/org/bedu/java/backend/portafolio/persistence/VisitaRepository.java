package org.bedu.java.backend.portafolio.persistence;

import org.bedu.java.backend.portafolio.model.Visita;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VisitaRepository extends JpaRepository<Visita, Long> {
}
