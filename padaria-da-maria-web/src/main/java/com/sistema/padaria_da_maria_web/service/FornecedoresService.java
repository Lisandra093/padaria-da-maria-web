package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Fornecedores;
import com.sistema.padaria_da_maria_web.repository.FornecedoresRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FornecedoresService {
    private final FornecedoresRepository repository;

    public FornecedoresService(FornecedoresRepository repository) {
        this.repository = repository;
    }

    public List<Fornecedores> listarTodos() {
        return repository.findAll();
    }

    public Optional<Fornecedores> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Fornecedores salvar(Fornecedores fornecedor) {
        return repository.save(fornecedor);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
