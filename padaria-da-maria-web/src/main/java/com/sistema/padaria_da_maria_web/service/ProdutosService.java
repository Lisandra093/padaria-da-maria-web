package com.sistema.padaria_da_maria_web.service;

import com.sistema.padaria_da_maria_web.model.Produtos;
import java.util.List;
import java.util.Optional;
import org.springframework.stereotype.Service;
import com.sistema.padaria_da_maria_web.repository.ProdutosRepository;


@Service
public class ProdutosService {
    private final ProdutosRepository repository;
    
    public ProdutosService(ProdutosRepository repository) {
        this.repository = repository;
    }
    public List<Produtos> listarTodos() {
        return repository.findAll();
    }
     public Optional<Produtos> buscarPorId(Integer id) {
        return repository.findById(id);
    }
     public Produtos salvar(Produtos produto) {
        return repository.save(produto);
    }
     
    public void excluir(Integer id) {
        repository.deleteById(id);
    }
    
    
}
    

