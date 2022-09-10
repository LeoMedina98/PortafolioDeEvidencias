package org.bedu.java.backend.portafolio.persistence;

import org.bedu.java.backend.portafolio.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
