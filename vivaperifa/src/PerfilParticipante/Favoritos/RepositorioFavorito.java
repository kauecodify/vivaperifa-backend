import org.springframework.data.mongodb.repository.MongoRepository;

public interface RepositorioFavorito extends MongoRepository<Favorito, String> {
}
