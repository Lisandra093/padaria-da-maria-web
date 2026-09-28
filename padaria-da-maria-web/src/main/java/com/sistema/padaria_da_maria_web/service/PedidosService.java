package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Pedidos;
import com.sistema.padaria_da_maria_web.repository.PedidosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class PedidosService {
    private final PedidosRepository repository;

    public PedidosService(PedidosRepository repository) {
        this.repository = repository;
    }

    public List<Pedidos> listarTodos() {
        return repository.findAll();
    }

    public Optional<Pedidos> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public Pedidos salvar(Pedidos pedido) {
        return repository.save(pedido);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
    
}
