package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Caixa;
import org.springframework.data.jpa.repository.JpaRepository;


public interface CaixaRepository extends JpaRepository<Caixa, Integer> {
    
}
