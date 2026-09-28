package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Funcionarios;
import com.sistema.padaria_da_maria_web.repository.FuncionariosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class FuncionariosService {
    private final FuncionariosRepository repository;

    public FuncionariosService(FuncionariosRepository repository) {
        this.repository = repository;
    }

    public List<Funcionarios> listarTodos() {
        return repository.findAll();
    }

    public Optional<Funcionarios> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Funcionarios salvar(Funcionarios funcionario) {
        return repository.save(funcionario);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
