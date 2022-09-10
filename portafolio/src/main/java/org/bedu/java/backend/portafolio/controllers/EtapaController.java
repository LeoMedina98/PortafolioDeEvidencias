package org.bedu.java.backend.portafolio.controllers;

import org.bedu.java.backend.portafolio.model.Etapa;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.URI;
import java.util.ArrayList;
import java.util.List;

@RequestMapping("/etapa")
@RestController
public class EtapaController {


    @GetMapping("/{etapaId}")
    public ResponseEntity<Etapa> getEtapa(@PathVariable Long etapa){
        return ResponseEntity.ok(new Etapa());
    }

    @GetMapping
    public ResponseEntity <List<Etapa>> getEtapas(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaEtapa(@RequestBody Etapa etapa){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{etapaId}")
    public ResponseEntity<Void> actualizaEtapa(@PathVariable Long etapaId, @RequestBody Etapa etapa){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> eliminaEtapa(@PathVariable Long etapaId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
