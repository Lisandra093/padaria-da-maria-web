package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Caixa;
import com.sistema.padaria_da_maria_web.repository.CaixaRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class CaixaService {
    private final CaixaRepository repository;

    public CaixaService(CaixaRepository repository) {
        this.repository = repository;
    }

    public List<Caixa> listarTodos() {
        return repository.findAll();
    }

    public Optional<Caixa> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Caixa salvar(Caixa caixa) {
        return repository.save(caixa);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
