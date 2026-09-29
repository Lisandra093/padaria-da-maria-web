package com.sistema.padaria_da_maria_web.controller;

import com.sistema.padaria_da_maria_web.model.Funcionarios;
import com.sistema.padaria_da_maria_web.service.FuncionariosService;
import java.util.List;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/api/funcionarios")
@CrossOrigin(origins = "*")
public class FuncionariosController {
     private final FuncionariosService service;

    public FuncionariosController(FuncionariosService service) {
        this.service = service;
    }

    @GetMapping
    public List<Funcionarios> listar() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Funcionarios> buscar(@PathVariable Integer id) {

        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PostMapping
    public ResponseEntity<Funcionarios> cadastrar(
            @RequestBody Funcionarios funcionario) {

        return ResponseEntity.ok(service.salvar(funcionario));
    }

    @PutMapping("/{id}")
    public ResponseEntity<Funcionarios> atualizar(
            @PathVariable Integer id,
            @RequestBody Funcionarios funcionario) {

        if (!service.buscarPorId(id).isPresent()) {
            return ResponseEntity.notFound().build();
        }

        funcionario.setId(id);

        return ResponseEntity.ok(service.salvar(funcionario));
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
