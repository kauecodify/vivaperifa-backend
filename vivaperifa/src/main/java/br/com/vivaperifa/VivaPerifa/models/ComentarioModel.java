package br.com.vivaperifa.VivaPerifa.models;

import org.springframework.data.annotation.Id;

public class ComentarioModel {
    @Id
    private String id;
    private ParticipanteModel participante;
    private String descricao;
    private int quantidadeGostei;
    private String data;
    private String horario;
    private int avaliacao;

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

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public int getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(int avaliacao) {
        this.avaliacao = avaliacao;
    }

    
}
