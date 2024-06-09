import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "perfis")
public class PerfilEditavel {
    @Id
    private String id;
    private String nomeUsuario;
    private String comentario; // limitado a 60 caracteres
    private byte[] fotoPerfil;
    private byte[] bannerPerfil;
    private List<String> contatos;

    public PerfilEditavel() {
        contatos = new ArrayList<>();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNomeUsuario() {
        return nomeUsuario;
    }

    public void setNomeUsuario(String nomeUsuario) {
        this.nomeUsuario = nomeUsuario;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        if (comentario != null && comentario.length() > 60) {
            throw new IllegalArgumentException("O comentário deve ter no máximo 60 caracteres.");
        }
        this.comentario = comentario;
    }

}
