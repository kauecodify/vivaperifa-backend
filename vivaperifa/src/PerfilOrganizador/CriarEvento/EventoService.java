import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.Optional;

@Service
public class EventoService {

    @Autowired
    private EventoRepository eventoRepository;

    public Evento salvarEvento(Evento evento) {
        return eventoRepository.save(evento);
    }

    public Optional<Evento> buscarEventoPorId(String id) {
        return eventoRepository.findById(id);
    }

    public List<Evento> buscarTodosEventos() {
        return eventoRepository.findAll();
    }

    public void excluirEvento(String id) {
        eventoRepository.deleteById(id);
    }
}
