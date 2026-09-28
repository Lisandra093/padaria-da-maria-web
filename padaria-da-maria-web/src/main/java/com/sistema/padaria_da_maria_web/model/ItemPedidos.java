package com.sistema.padaria_da_maria_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDateTime;


@Entity
@Table(name = "item_pedidos")
public class ItemPedidos {
    @Id
    @Column(name = "idItem")
    private Integer idItem;
    
    
    @Column(name = "data_pedido")
    private LocalDateTime dataPedido;
    
    private double quantidade;
    private double valorUnitario;
    
    
    @Column(name = "id_pedido")
    private Integer idPedido;
    
    @Column(name = "id_produto")
    private Integer idProduto;
     
     public ItemPedidos() {
        
    }

    public ItemPedidos(Integer idItem, LocalDateTime dataPedido, double quantidade, double valorUnitario, Integer idPedido, Integer idProduto) {
        this.idItem = idItem;
        this.dataPedido = dataPedido;
        this.quantidade = quantidade;
        this.valorUnitario = valorUnitario;
        this.idPedido = idPedido;
        this.idProduto = idProduto;
    }

    public Integer getIdItem() {
        return idItem;
    }

    public void setIdItem(Integer idItem) {
        this.idItem = idItem;
    }

    public LocalDateTime getDataPedido() {
        return dataPedido;
    }

    public void setDataPedido(LocalDateTime dataPedido) {
        this.dataPedido = dataPedido;
    }

    public double getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(double quantidade) {
        this.quantidade = quantidade;
    }

    public double getValorUnitario() {
        return valorUnitario;
    }

    public void setValorUnitario(double valorUnitario) {
        this.valorUnitario = valorUnitario;
    }

    public Integer getIdPedido() {
        return idPedido;
    }

    public void setIdPedido(Integer idPedido) {
        this.idPedido = idPedido;
    }

    public Integer getIdProduto() {
        return idProduto;
    }

    public void setIdProduto(Integer idProduto) {
        this.idProduto = idProduto;
    }
     
}
