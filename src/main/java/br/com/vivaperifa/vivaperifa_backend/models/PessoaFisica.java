package br.com.vivaperifa.vivaperifa_backend.models;

public class PessoaFisica extends OrganizadorModel{
    private String nome;
    private String cpf;
    private Data dataNasc;

    public PessoaFisica(){
        super();
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Data getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(Data dataNasc) {
        this.dataNasc = dataNasc;
    } 
}
