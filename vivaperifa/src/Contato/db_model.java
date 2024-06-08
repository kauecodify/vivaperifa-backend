import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "mensagens")
public class Mensagem {
    @Id
    private String id;
    private String nome;
    private String email;
    private String telefone;
    private String assunto;
    private String mensagem;

    // getters e setters
}
