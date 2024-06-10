package br.com.vivaperifa.VivaPerifa.models;

public class Usuario {
    private String email;
    private String senha;
    private String telefone;
    private String status; //ativo/inativo
    private int reputacaoComunidade;

    public Usuario(){

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getTelefone(){
        return telefone;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public int getReputacaoComunidade() {
        return reputacaoComunidade;
    }

    public void setReputacaoComunidade(int reputacaoComunidade) {
        this.reputacaoComunidade = reputacaoComunidade;
    }

    public String getStatus(){
        return status;
    }

    public void setStatus(String status){
        this.status = status;
    }
}
