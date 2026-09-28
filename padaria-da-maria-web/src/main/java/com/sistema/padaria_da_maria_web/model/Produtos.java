package com.sistema.padaria_da_maria_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name = "produtos")
public class Produtos {
    @Id
    private Integer id;

    private String categoria;
    private String nomeProduto;
    private Double preco;

    public Produtos() {
    }

    public Produtos(Integer id, String categoria, String nomeProduto, Double preco) {
        this.id = id;
        this.categoria = categoria;
        this.nomeProduto = nomeProduto;
        this.preco = preco;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public String getNomeProduto() {
        return nomeProduto;
    }

    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
    
    
}
