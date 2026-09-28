package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Estoque;
import com.sistema.padaria_da_maria_web.repository.EstoqueRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class EstoqueService {
    private final EstoqueRepository repository;

    public EstoqueService(EstoqueRepository repository) {
        this.repository = repository;
    }

    public List<Estoque> listarTodos() {
        return repository.findAll();
    }

    public Optional<Estoque> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Estoque salvar(Estoque estoque) {
        return repository.save(estoque);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
