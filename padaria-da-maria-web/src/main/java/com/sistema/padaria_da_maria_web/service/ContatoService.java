package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Contato;
import com.sistema.padaria_da_maria_web.repository.ContatoRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ContatoService {
     private final ContatoRepository repository;

    public ContatoService(ContatoRepository repository) {
        this.repository = repository;
    }

    public List<Contato> listarTodos() {
        return repository.findAll();
    }

    public Optional<Contato> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Contato salvar(Contato contato) {
        return repository.save(contato);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
