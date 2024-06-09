package br.com.vivaperifa.VivaPerifa.models;

import java.util.List;

import org.springframework.data.annotation.Id;

public class OrganizadorModel extends UsuarioAbstrato{
    @Id
    private String id;
    private String nomeEmpresa;
    private String cnpj;
    private String descricaoPerfil;
    private String tipoUsuario; //premium ou comum
    private List<EventoModel> eventosPublicados;

    public OrganizadorModel(){
        super();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeEmpresa() {
        return nomeEmpresa;
    }

    public void setNomeEmpresa(String nomeEmpresa) {
        this.nomeEmpresa = nomeEmpresa;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getDescricaoPerfil() {
        return descricaoPerfil;
    }

    public void setDescricaoPerfil(String descricaoPerfil) {
        this.descricaoPerfil = descricaoPerfil;
    }
    
    public String getTipoUsuario(){
        return tipoUsuario;
    }

    public void setTipoUsuario(String tipoUsuario){
        this.tipoUsuario = tipoUsuario;
    }

    public List<EventoModel> getEventosPublicados() {
        return eventosPublicados;
    }

    public void setEventosPublicados(List<EventoModel> eventosPublicados) {
        this.eventosPublicados = eventosPublicados;
    }
    
    
}
