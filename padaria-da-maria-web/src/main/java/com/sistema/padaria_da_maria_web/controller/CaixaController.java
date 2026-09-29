package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Caixa;
import com.sistema.padaria_da_maria_web.service.CaixaService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/caixa")
@CrossOrigin(origins = "*")
public class CaixaController {
     private final CaixaService service;

    public CaixaController(CaixaService service) {
        this.service = service;
    }

    @GetMapping
    public List<Caixa> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Caixa> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Caixa> cadastrar(
            @RequestBody Caixa caixa) {

        return ResponseEntity.ok(service.salvar(caixa));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Caixa> atualizar(
            @PathVariable Integer id,
            @RequestBody Caixa caixa) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        caixa.setIdCaixa(id);

        return ResponseEntity.ok(service.salvar(caixa));
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
