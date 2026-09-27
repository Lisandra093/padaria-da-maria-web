package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Produto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutoRepository extends JpaRepository<Produto, Integer> {
    
}
