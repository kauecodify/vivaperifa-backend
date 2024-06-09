package br.com.vivaperifa.VivaPerifa.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("participante")
public class ParticipanteModel extends UsuarioAbstrato{
    @Id
    private String id;
    private String nomeCompleto;
    private List<ComentarioModel> comentarios;
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

    public List<ComentarioModel> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioModel> comentarios) {
        this.comentarios = comentarios;
    }

    public List<EventoModel> getEventosFavoritos() {
        return eventosFavoritos;
    }

    public void setEventosFavoritos(List<EventoModel> eventosFavoritos) {
        this.eventosFavoritos = eventosFavoritos;
    }

    
    
}
