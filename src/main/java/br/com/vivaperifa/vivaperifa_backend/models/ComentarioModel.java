package br.com.vivaperifa.vivaperifa_backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("comentario")
public class ComentarioModel {
    @Id
    private String id;
    private String descricao;
    private Data data;
    private Hora horario;
    private double notaAvaliacao;
    private int quantidadeGostei;
    private ParticipanteModel participante;
    private EventoModel evento;

    public ComentarioModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ParticipanteModel getParticipante() {
        return participante;
    }

    public void setParticipante(ParticipanteModel participante) {
        this.participante = participante;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidadeGostei() {
        return quantidadeGostei;
    }

    public void setQuantidadeGostei(int quantidadeGostei) {
        this.quantidadeGostei = quantidadeGostei;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }

    public Hora getHorario() {
        return horario;
    }

    public void setHorario(Hora horario) {
        this.horario = horario;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }

    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }

    public EventoModel getEvento() {
        return evento;
    }

    public void setEvento(EventoModel evento) {
        this.evento = evento;
    } 
    
}
