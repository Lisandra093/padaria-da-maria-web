package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.ItemPedidos;
import com.sistema.padaria_da_maria_web.service.ItemPedidosService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/itemPedidos")
@CrossOrigin(origins = "*")
public class ItemPedidosController {
     private final ItemPedidosService service;

    public ItemPedidosController(ItemPedidosService service) {
        this.service = service;
    }

    @GetMapping
    public List<ItemPedidos> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<ItemPedidos> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<ItemPedidos> cadastrar(
            @RequestBody ItemPedidos itemPedidos) {

        return ResponseEntity.ok(service.salvar(itemPedidos));
    }

    @PutMapping("/{id}")
    public ResponseEntity<ItemPedidos> atualizar(
            @PathVariable Integer id,
            @RequestBody ItemPedidos itemPedidos) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        itemPedidos.setIdItem(id);

        return ResponseEntity.ok(service.salvar(itemPedidos));
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
