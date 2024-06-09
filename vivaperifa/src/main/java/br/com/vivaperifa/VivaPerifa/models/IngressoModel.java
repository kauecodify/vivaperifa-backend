package br.com.vivaperifa.VivaPerifa.models;

import org.springframework.data.annotation.Id;

public class IngressoModel {
    @Id
    private String id;
    private String dataLimiteVenda;
    private String localizacao;
    private double valorIngresso;
    private String tipoIngresso;
    
    public IngressoModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDataLimiteVenda() {
        return dataLimiteVenda;
    }

    public void setDataLimiteVenda(String dataLimiteVenda) {
        this.dataLimiteVenda = dataLimiteVenda;
    }

    public String getLocalizacao() {
        return localizacao;
    }

    public void setLocalizacao(String localizacao) {
        this.localizacao = localizacao;
    }

    public double getValorIngresso() {
        return valorIngresso;
    }

    public void setValorIngresso(double valorIngresso) {
        this.valorIngresso = valorIngresso;
    }

    public String getTipoIngresso() {
        return tipoIngresso;
    }

    public void setTipoIngresso(String tipoIngresso) {
        this.tipoIngresso = tipoIngresso;
    }

    
}
