package br.com.vivaperifa.vivaperifa_backend.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document("evento")
public class EventoModel {
    //detalhes
    @Id
    private String id;
    private String titulo;
    private String caminhoImagem;
    private String descricao;
    private String faixaEtaria;
    private String visibilidade;
    private CategoriaModel categoria;
    private String localVendaIngresso;
    private int quantidadeGostei;
    private OrganizadorModel organizador;

    //programação
    private EnderecoModel endereco;
    private Hora horarioInicio;
    private Hora horarioFim;
    private Data dataInicio;
    private Data dataFim;
   
    //comentarios
    private double notaAvaliacao;
    private int quantidadeAvaliacao;
    
    public EventoModel(){

    }

    
    public String getCaminhoImagem() {
        return caminhoImagem;
    }

    public void setCaminhoImagem(String caminhoImagem) {
        this.caminhoImagem = caminhoImagem;
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


    public String getVisibilidade() {
        return visibilidade;
    }


    public void setVisibilidade(String visibilidade) {
        this.visibilidade = visibilidade;
    }


    public CategoriaModel getCategoria() {
        return categoria;
    }


    public void setCategoria(CategoriaModel categoria) {
        this.categoria = categoria;
    }


    public String getLocalVendaIngresso() {
        return localVendaIngresso;
    }


    public void setLocalVendaIngresso(String localVendaIngresso) {
        this.localVendaIngresso = localVendaIngresso;
    }


    public int getQuantidadeGostei() {
        return quantidadeGostei;
    }


    public void setQuantidadeGostei(int quantidadeGostei) {
        this.quantidadeGostei = quantidadeGostei;
    }


    public OrganizadorModel getOrganizador() {
        return organizador;
    }


    public void setOrganizador(OrganizadorModel organizador) {
        this.organizador = organizador;
    }


    public EnderecoModel getEndereco() {
        return endereco;
    }


    public void setEndereco(EnderecoModel endereco) {
        this.endereco = endereco;
    }


    public Hora getHorarioInicio() {
        return horarioInicio;
    }


    public void setHorarioInicio(Hora horarioInicio) {
        this.horarioInicio = horarioInicio;
    }


    public Hora getHorarioFim() {
        return horarioFim;
    }


    public void setHorarioFim(Hora horarioFim) {
        this.horarioFim = horarioFim;
    }


    public Data getDataInicio() {
        return dataInicio;
    }


    public void setDataInicio(Data dataInicio) {
        this.dataInicio = dataInicio;
    }


    public Data getDataFim() {
        return dataFim;
    }


    public void setDataFim(Data dataFim) {
        this.dataFim = dataFim;
    }

    public double getNotaAvaliacao() {
        return notaAvaliacao;
    }


    public void setNotaAvaliacao(double notaAvaliacao) {
        this.notaAvaliacao = notaAvaliacao;
    }


    public int getQuantidadeAvaliacao() {
        return quantidadeAvaliacao;
    }


    public void setQuantidadeAvaliacao(int quantidadeAvaliacao) {
        this.quantidadeAvaliacao = quantidadeAvaliacao;
    }
    
}
