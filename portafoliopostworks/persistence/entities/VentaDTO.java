package org.bedu.java.backend.portafoliopostworks.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Data
@Table(name = "VENTAS")
@Entity
@NoArgsConstructor
public class VentaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long ventaId;

    private float monto;

    @OneToMany
    private List<ProductoDTO> productos;

    @ManyToOne
    private ClienteDTO cliente;

    @Column(nullable = false)
    private LocalDateTime fechaCreacion;
}
