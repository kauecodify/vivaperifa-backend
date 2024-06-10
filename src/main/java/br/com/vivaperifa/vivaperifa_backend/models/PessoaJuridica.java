package br.com.vivaperifa.vivaperifa_backend.models;

public class PessoaJuridica extends OrganizadorModel{
    private String nomeFantasia;
    private String razaoSocial;
    private String cnpj;

    public PessoaJuridica(){
        super();
    }

    public String getNomeFantasia() {
        return nomeFantasia;
    }

    public void setNomeFantasia(String nomeFantasia) {
        this.nomeFantasia = nomeFantasia;
    }

    public String getRazaoSocial() {
        return razaoSocial;
    }

    public void setRazaoSocial(String razaoSocial) {
        this.razaoSocial = razaoSocial;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
}
