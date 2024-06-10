package br.com.vivaperifa.VivaPerifa.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("organizador")
public class OrganizadorModel{
    @Id
    private String id;
    private String descricaoPerfil;
    private Usuario usuario;
    private PlanoModel plano;
    private List<String> redesSociais;
    //adicionar mascara

    public OrganizadorModel(){
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public PlanoModel getPlano() {
        return plano;
    }

    public void setPlano(PlanoModel plano) {
        this.plano = plano;
    }

    public List<String> getRedesSociais() {
        return redesSociais;
    }

    public void setRedesSociais(List<String> redesSociais) {
        this.redesSociais = redesSociais;
    }
    
    
}
