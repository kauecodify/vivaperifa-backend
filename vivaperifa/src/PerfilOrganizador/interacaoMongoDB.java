import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class InteracaoMongoDB {
    private final MeuServico meuServico;

    @Autowired
    public InteracaoMongoDB(MeuServico meuServico) {
        this.meuServico = meuServico;
    }

    public void adicionarDados() {
        Organizador organizador = new Organizador();
        organizador.setNomeUsuario("organizador123");
        organizador.setDescricaoBreve("Organizador de eventos");

        RedesSociais redesSociais = new RedesSociais();
        redesSociais.setTwitter("organizador123");
        redesSociais.setFacebook("organizador123");
        redesSociais.setInstagram("organizador123");
        organizador.setRedesSociais(redesSociais);

        DadosAcesso dadosAcesso = new DadosAcesso();
        dadosAcesso.setEmail("organizador@example.com");
        dadosAcesso.setSenha("senha123");
        organizador.setDadosAcesso(dadosAcesso);

        Organizacao organizacao = new Organizacao();
        organizacao.setNome("Minha Organização");
        organizacao.setCnpj("12345678901234");
        organizacao.setTelefone("123456789");
        organizador.setOrganizacao(organizacao);

        meuServico.salvarDocumento(organizador);
    }

    public void salvarDocumento(Organizador organizador) {
        meuServico.salvarDocumento(organizador);
    }

    public void atualizarDocumento(Organizador organizador) {
        meuServico.atualizarDocumento(organizador);
    }

    public void excluirDocumento(String id) {
        meuServico.excluirDocumento(id);
    }

    public List<Organizador> consultarDocumentos() {
        return meuServico.consultarDocumentos();
    }

    public Organizador consultarDocumentoPorId(String id) {
        return meuServico.consultarDocumentoPorId(id);
    }

    public static void main(String[] args) {
        InteracaoMongoDB interacaoMongoDB = new InteracaoMongoDB(...); // Inicialize com os beans necessários
        interacaoMongoDB.adicionarDados();
    }
}