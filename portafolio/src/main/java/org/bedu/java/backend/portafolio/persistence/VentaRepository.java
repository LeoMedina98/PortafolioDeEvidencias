package org.bedu.java.backend.portafolio.persistence;

import org.bedu.java.backend.portafolio.model.Venta;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VentaRepository extends JpaRepository<Venta, Long> {
}
