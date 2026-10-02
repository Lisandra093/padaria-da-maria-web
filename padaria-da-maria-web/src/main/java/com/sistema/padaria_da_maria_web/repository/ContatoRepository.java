package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Contato;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContatoRepository extends JpaRepository<Contato, Integer> {
    
}
