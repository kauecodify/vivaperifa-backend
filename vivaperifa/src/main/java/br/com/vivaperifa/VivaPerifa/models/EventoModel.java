package br.com.vivaperifa.VivaPerifa.models;

import java.util.List;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("evento")
public class EventoModel {
    @Id
    private String id;
    private String titulo;
    private String descricao;
    private String faixaEtaria;
    private String statusVisibilidade;
    private OrganizadorModel organizador;
    private int quantidadeGostei;
    private List<ProgramacaoModel> programacao;
    private List<ComentarioModel> comentarios;
    private List<IngressoModel> ingressos;
    private CategoriaEventoModel categoria;
    
    public EventoModel(){

    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getFaixaEtaria() {
        return faixaEtaria;
    }

    public void setFaixaEtaria(String faixaEtaria) {
        this.faixaEtaria = faixaEtaria;
    }

    public String getStatusVisibilidade() {
        return statusVisibilidade;
    }

    public void setStatusVisibilidade(String statusVisibilidade) {
        this.statusVisibilidade = statusVisibilidade;
    }

    public OrganizadorModel getOrganizador(){
        return organizador;
    }

    public void setOrganizador(OrganizadorModel organizador){
        this.organizador = organizador;
    }

    public int getQuantidadeGostei() {
        return quantidadeGostei;
    }

    public void setQuantidadeGostei(int quantidadeGostei) {
        this.quantidadeGostei = quantidadeGostei;
    }

    public List<ProgramacaoModel> getProgramacao() {
        return programacao;
    }

    public void setProgramacao(List<ProgramacaoModel> programacao) {
        this.programacao = programacao;
    }

    public List<ComentarioModel> getComentarios() {
        return comentarios;
    }

    public void setComentarios(List<ComentarioModel> comentarios) {
        this.comentarios = comentarios;
    }

    public List<IngressoModel> getIngressos() {
        return ingressos;
    }

    public void setIngressos(List<IngressoModel> ingressos) {
        this.ingressos = ingressos;
    }

    public CategoriaEventoModel getCategoria() {
        return categoria;
    }

    public void setCategoria(CategoriaEventoModel categoria) {
        this.categoria = categoria;
    }

    
}
