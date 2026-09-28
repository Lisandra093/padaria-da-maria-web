package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Clientes;
import com.sistema.padaria_da_maria_web.repository.ClientesRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ClientesService {
    private final ClientesRepository repository;

    public ClientesService(ClientesRepository repository) {
        this.repository = repository;
    }

    public List<Clientes> listarTodos() {
        return repository.findAll();
    }

    public Optional<Clientes> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Clientes salvar(Clientes cliente) {
        return repository.save(cliente);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
