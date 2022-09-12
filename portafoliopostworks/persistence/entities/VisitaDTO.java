package org.bedu.java.backend.portafoliopostworks
.persistence.entities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.time.LocalDateTime;

@Data
@Table(name = "VISITAS")
@Entity
@NoArgsConstructor
public class VisitaDTO {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @ManyToOne
    private ClienteDTO cliente;

    @Column(nullable = false)
    private LocalDateTime fechaProgramada;

    @Column(nullable = false)
    private String direccion;

    @Column(nullable = false)
    private String proposito;

    @Column(nullable = false)
    private String vendedor;
}
