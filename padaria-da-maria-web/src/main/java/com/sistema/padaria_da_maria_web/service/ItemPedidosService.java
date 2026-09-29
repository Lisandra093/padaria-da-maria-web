package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.ItemPedidos;
import com.sistema.padaria_da_maria_web.repository.ItemPedidosRepository;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;

@Service
public class ItemPedidosService {
    private final ItemPedidosRepository repository;

    public ItemPedidosService(ItemPedidosRepository repository) {
        this.repository = repository;
    }

    public List<ItemPedidos> listarTodos() {
        return repository.findAll();
    }

    public Optional<ItemPedidos> buscarPorId(Integer id) {
        return repository.findById(id);
    }

    public ItemPedidos salvar(ItemPedidos itemPedido) {
        return repository.save(itemPedido);
    }

    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
}
