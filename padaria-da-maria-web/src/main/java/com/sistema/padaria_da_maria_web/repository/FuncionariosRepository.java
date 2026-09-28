package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Funcionarios;
import org.springframework.data.jpa.repository.JpaRepository;


public interface FuncionariosRepository extends JpaRepository<Funcionarios, Integer> {
    
}
