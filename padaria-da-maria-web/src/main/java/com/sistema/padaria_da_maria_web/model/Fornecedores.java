package com.sistema.padaria_da_maria_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;

@Entity
@Table(name = "fornecedores")
public class Fornecedores {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_fornec", nullable = false)
    private Integer id;
    
    @Column(name = "cnpj", nullable = false)
    private String cnpj;
    
    @Column(name = "nome_empresa", nullable = false)
    private String nomeEmpresa;
    
    @Column(name = "produtos_fornec", nullable = false)
    private String produtosFornec;
    
    public Fornecedores() {
    }

    public Fornecedores(Integer id, String cnpj, String nomeEmpresa, String produtosFornec) {
        this.id = id;
        this.cnpj = cnpj;
        this.nomeEmpresa = nomeEmpresa;
        this.produtosFornec = produtosFornec;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getProdutosFornec() {
        return produtosFornec;
    }

    public void setProdutosFornec(String produtosFornec) {
        this.produtosFornec = produtosFornec;
    }
    
    
}
