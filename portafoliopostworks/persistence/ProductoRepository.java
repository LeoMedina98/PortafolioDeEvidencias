package org.bedu.java.backend.portafoliopostworks.persistence;

import org.bedu.java.backend.portafoliopostworks.persistence.entities.ProductoDTO;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<ProductoDTO, Long> {
}
