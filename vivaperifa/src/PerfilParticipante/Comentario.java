import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import java.util.Date;

@Document(collection = "comentarios")
public class Comentario {
    @Id
    private String id;
    private String idUsuario;
    private String comentario;
    private int avaliacao;
    private Date criadoEm;
    // getters e setters
}
