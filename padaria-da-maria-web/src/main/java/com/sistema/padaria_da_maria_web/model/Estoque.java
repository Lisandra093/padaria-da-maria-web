package com.sistema.padaria_da_maria_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "estoque")
public class Estoque {
    @Id
    private Integer id;

    private LocalDateTime dataPedido;
    private double nivelMinimo;
    private double quantidade;
    
    
    @Column(name = "produto_id")
    private Integer idProduto;
    
    public Estoque() {
        
    }

    public Estoque(Integer id, LocalDateTime dataPedido, double nivelMinimo, double quantidade, Integer idProduto) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.nivelMinimo = nivelMinimo;
        this.quantidade = quantidade;
        this.idProduto = idProduto;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getNivelMinimo() {
        return nivelMinimo;
    }

    public void setNivelMinimo(double nivelMinimo) {
        this.nivelMinimo = nivelMinimo;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
    
}
