package br.com.vivaperifa.VivaPerifa.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("participante")
public class ParticipanteModel{
    @Id
    private String id;
    private String nomeCompleto;
    private Data dataNascimento;
    private EnderecoModel endereco;
    private Usuario usuario;
    private List<CategoriaModel> interesses;
    private List<EventoModel> eventosFavoritos;

    public ParticipanteModel(){
        super();
    }   

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeCompleto() {
        return nomeCompleto;
    }

    public void setNomeCompleto(String nomeCompleto) {
        this.nomeCompleto = nomeCompleto;
    }

    public List<EventoModel> getEventosFavoritos() {
        return eventosFavoritos;
    }

    public void setEventosFavoritos(List<EventoModel> eventosFavoritos) {
        this.eventosFavoritos = eventosFavoritos;
    }

    public Data getDataNascimento() {
        return dataNascimento;
    }

    public void setDataNascimento(Data dataNascimento) {
        this.dataNascimento = dataNascimento;
    }

    public List<CategoriaModel> getInteresses() {
        return interesses;
    }

    public void setInteresses(List<CategoriaModel> interesses) {
        this.interesses = interesses;
    }

    public EnderecoModel getEndereco() {
        return endereco;
    }

    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }

    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    
    
}
