package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Estoque;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EstoqueRepository extends JpaRepository<Estoque, Integer> {
    
}
