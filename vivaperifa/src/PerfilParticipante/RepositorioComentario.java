import org.springframework.data.mongodb.repository.MongoRepository;
import java.util.List;

public interface RepositorioComentario extends MongoRepository<Comentario, String> {
    List<Comentario> findByIdUsuario(String idUsuario);
}
