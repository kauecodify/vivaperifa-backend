public class Organizador {
    private String nomeUsuario;
    private String descricaoBreve;
    private RedesSociais redesSociais;
    private DadosAcesso dadosAcesso;
    private Organizacao organizacao;
    
    public String getNomeUsuario() {
        return nomeUsuario;
    }
    
    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }
    
    public String getDescricaoBreve() {
        return descricaoBreve;
    }
    
    public void setDescricaoBreve(String descricaoBreve) {
        this.descricaoBreve = descricaoBreve;
    }
    
    public RedesSociais getRedesSociais() {
        return redesSociais;
    }
    
    public void setRedesSociais(RedesSociais redesSociais) {
        this.redesSociais = redesSociais;
    }
    
    public DadosAcesso getDadosAcesso() {
        return dadosAcesso;
    }
    
    public void setDadosAcesso(DadosAcesso dadosAcesso) {
        this.dadosAcesso = dadosAcesso;
    }
    
    public Organizacao getOrganizacao() {
        return organizacao;
    }
    
    public void setOrganizacao(Organizacao organizacao) {
        this.organizacao = organizacao;
    }
}

public class RedesSociais {
    private String twitter;
    private String facebook;
    private String instagram;
    
    public String getTwitter() {
        return twitter;
    }
    
    public void setTwitter(String twitter) {
        this.twitter = twitter;
    }
    
    public String getFacebook() {
        return facebook;
    }
    
    public void setFacebook(String facebook) {
        this.facebook = facebook;
    }
    
    public String getInstagram() {
        return instagram;
    }
    
    public void setInstagram(String instagram) {
        this.instagram = instagram;
    }
}

public class DadosAcesso {
    private String email;
    private String senha;
    
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
}

public class Organizacao {
    private String nome;
    private String cnpj;
    private String telefone;
    
    public String getNome() {
        return nome;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getCnpj() {
        return cnpj;
    }
    
    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }
    
    public String getTelefone() {
        return telefone;
    }
    
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    /* public List<Organizador> buscarTudo() {
        return mongoTemplate.findAll(Organizador.class);
    } **/
}
