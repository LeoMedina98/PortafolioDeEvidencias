package org.bedu.java.backend.portafolio.controllers;

import org.bedu.java.backend.portafolio.model.Cliente;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.net.URI;
import java.util.ArrayList;
import java.util.List;


@RequestMapping("/cliente")
@RestController
public class ClienteController {


    @GetMapping("/{clienteId}")
    public ResponseEntity<Cliente> getCliente(@PathVariable Long clienteId){
        return ResponseEntity.ok(new Cliente());
    }

    @GetMapping
    public ResponseEntity <List<Cliente>> getClientes(){
        return ResponseEntity.ok(new ArrayList<>());
    }

    @PostMapping
    public ResponseEntity<Void> creaCliente(@Valid @RequestBody Cliente cliente){
        return ResponseEntity.created(URI.create("")).build();
    }

    @PutMapping("/{clienteId}")
    public ResponseEntity<Void> actualizaCliente(@PathVariable Long clienteId, @RequestBody @Valid Cliente cliente){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

    @DeleteMapping("/{clienteId}")
    public ResponseEntity<Void> eliminaCliente(@PathVariable Long clienteId){
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }
}
