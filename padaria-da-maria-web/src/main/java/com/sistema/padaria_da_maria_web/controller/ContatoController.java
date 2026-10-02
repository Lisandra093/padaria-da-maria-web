package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Contato;
import com.sistema.padaria_da_maria_web.service.ContatoService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/contato")
@CrossOrigin(origins = "*")
public class ContatoController {
     private final ContatoService service;

    public ContatoController(ContatoService service) {
        this.service = service;
    }

    @GetMapping
    public List<Contato> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Contato> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Contato> cadastrar(
            @RequestBody Contato contato) {

        return ResponseEntity.ok(service.salvar(contato));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> excluir(@PathVariable Integer id) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        service.excluir(id);

        return ResponseEntity.noContent().build();
    }
    
}
