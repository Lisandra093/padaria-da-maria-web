package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Integer> {
    
}
