import org.springframework.data.mongodb.repository.MongoRepository;

public interface EventoRepository extends MongoRepository<Evento, String> {
}
