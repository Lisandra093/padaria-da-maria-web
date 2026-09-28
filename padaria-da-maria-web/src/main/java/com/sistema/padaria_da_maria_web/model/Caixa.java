package com.sistema.padaria_da_maria_web.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Column;
import java.time.LocalDateTime;


@Entity
@Table(name = "caixa")
public class Caixa {
     @Id
    @Column(name = "idCaixa")
    private Integer idCaixa;
    
    
    @Column(name = "data")
    private LocalDateTime data;
    
    private String formaPagamento;
    private String tipoMovimentacao;
    
    private double valorMovimentado;
    
    public Caixa() {
        
    }

    public Caixa(Integer idCaixa, LocalDateTime data, String formaPagamento, String tipoMovimentacao, double valorMovimentado) {
        this.idCaixa = idCaixa;
        this.data = data;
        this.formaPagamento = formaPagamento;
        this.tipoMovimentacao = tipoMovimentacao;
        this.valorMovimentado = valorMovimentado;
    }

    public Integer getIdCaixa() {
        return idCaixa;
    }

    public void setIdCaixa(Integer idCaixa) {
        this.idCaixa = idCaixa;
    }

    public LocalDateTime getData() {
        return data;
    }

    public void setData(LocalDateTime data) {
        this.data = data;
    }

    public String getFormaPagamento() {
        return formaPagamento;
    }

    public void setFormaPagamento(String formaPagamento) {
        this.formaPagamento = formaPagamento;
    }

    public String getTipoMovimentacao() {
        return tipoMovimentacao;
    }

    public void setTipoMovimentacao(String tipoMovimentacao) {
        this.tipoMovimentacao = tipoMovimentacao;
    }

    public double getValorMovimentado() {
        return valorMovimentado;
    }

    public void setValorMovimentado(double valorMovimentado) {
        this.valorMovimentado = valorMovimentado;
    }
    
    
    
}
