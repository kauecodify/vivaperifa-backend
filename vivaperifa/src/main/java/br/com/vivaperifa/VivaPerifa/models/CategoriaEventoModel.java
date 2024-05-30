package br.com.vivaperifa.VivaPerifa.models;

import org.springframework.data.annotation.Id;

public class CategoriaEventoModel {
    @Id
    private String id;
    private String nomeCategoria;
    private String descricaoCategoria;

    public CategoriaEventoModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeCategoria() {
        return nomeCategoria;
    }

    public void setNomeCategoria(String nomeCategoria) {
        this.nomeCategoria = nomeCategoria;
    }

    public String getDescricaoCategoria() {
        return descricaoCategoria;
    }

    public void setDescricaoCategoria(String descricaoCategoria) {
        this.descricaoCategoria = descricaoCategoria;
    }

    
}
