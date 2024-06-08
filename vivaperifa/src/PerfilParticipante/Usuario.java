// Usuario.java
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "usuarios")
public class Usuario {
    @Id
    private String id;
    private String nomeDeUsuario;
    private String email;
    private String senha;
    private Date criadoEm;
    private Date atualizadoEm;
    // getters e setters
}
