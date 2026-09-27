package com.sistema.padaria_da_maria_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDateTime;

@Entity
@Table(name = "pedidos")
public class Pedidos {
     @Id
    private Integer id;

    private LocalDateTime dataPedido;
    private String nomePedido;
    private String statusPedido;
    private double valorTotal;
    
    @Column(name = "id_cliente")
    private Integer idCliente;

    public Pedidos() {
        
    }

    public Pedidos(Integer id, LocalDateTime dataPedido, String nomePedido, String statusPedido, double valorTotal, Integer idCliente) {
        this.id = id;
        this.dataPedido = dataPedido;
        this.nomePedido = nomePedido;
        this.statusPedido = statusPedido;
        this.valorTotal = valorTotal;
        this.idCliente = idCliente;
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

    public String getNomePedido() {
        return nomePedido;
    }

    public void setNomePedido(String nomePedido) {
        this.nomePedido = nomePedido;
    }

    public String getStatusPedido() {
        return statusPedido;
    }

    public void setStatusPedido(String statusPedido) {
        this.statusPedido = statusPedido;
    }

    public double getValorTotal() {
        return valorTotal;
    }

    public void setValorTotal(double valorTotal) {
        this.valorTotal = valorTotal;
    }

    public Integer getIdCliente() {
        return idCliente;
    }

    public void setIdCliente(Integer idCliente) {
        this.idCliente = idCliente;
    }
    
}
