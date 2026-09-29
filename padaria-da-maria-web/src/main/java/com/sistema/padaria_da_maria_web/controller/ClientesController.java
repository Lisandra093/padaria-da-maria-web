package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Clientes;
import com.sistema.padaria_da_maria_web.service.ClientesService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/clientes")
@CrossOrigin(origins = "*")
public class ClientesController {
    private final ClientesService service;

    public ClientesController(ClientesService service) {
        this.service = service;
    }

    @GetMapping
    public List<Clientes> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Clientes> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Clientes> cadastrar(
            @RequestBody Clientes cliente) {

        return ResponseEntity.ok(service.salvar(cliente));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Clientes> atualizar(
            @PathVariable Integer id,
            @RequestBody Clientes cliente) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        cliente.setId(id);

        return ResponseEntity.ok(service.salvar(cliente));
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
