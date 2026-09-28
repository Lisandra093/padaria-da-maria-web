package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Clientes;
import org.springframework.data.jpa.repository.JpaRepository;


public interface ClientesRepository extends JpaRepository<Clientes, Integer> {
    
}
