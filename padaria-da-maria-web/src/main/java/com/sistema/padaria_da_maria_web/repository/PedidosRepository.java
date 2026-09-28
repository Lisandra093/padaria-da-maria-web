package com.sistema.padaria_da_maria_web.repository;

import com.sistema.padaria_da_maria_web.model.Pedidos;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PedidosRepository extends JpaRepository<Pedidos, Integer> {
    
}
