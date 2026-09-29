package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Pedidos;
import com.sistema.padaria_da_maria_web.service.PedidosService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/pedidos")
@CrossOrigin(origins = "*")
public class PedidosController {
     private final PedidosService service;

    public PedidosController(PedidosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Pedidos> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Pedidos> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Pedidos> cadastrar(
            @RequestBody Pedidos pedido) {

        return ResponseEntity.ok(service.salvar(pedido));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Pedidos> atualizar(
            @PathVariable Integer id,
            @RequestBody Pedidos pedido) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        pedido.setId(id);

        return ResponseEntity.ok(service.salvar(pedido));
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
