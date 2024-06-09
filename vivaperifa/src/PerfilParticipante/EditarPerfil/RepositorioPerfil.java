import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PerfilRepository extends MongoRepository<PerfilEditavel, String> {
}
