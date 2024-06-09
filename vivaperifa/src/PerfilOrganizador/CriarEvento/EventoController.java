import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/eventos")
public class EventoController {

    @Autowired
    private EventoService eventoService;

    @PostMapping
    public Evento criarEvento(@RequestBody Evento evento) {
        return eventoService.salvarEvento(evento);
    }

    @GetMapping("/{id}")
    public Evento buscarEventoPorId(@PathVariable String id) {
        return eventoService.buscarEventoPorId(id)
                .orElseThrow(() -> new EventoNaoEncontradoException(id));
    }

    @GetMapping
    public List<Evento> buscarTodosEventos() {
        return eventoService.buscarTodosEventos();
    }

    @DeleteMapping("/{id}")
    public void excluirEvento(@PathVariable String id) {
        eventoService.excluirEvento(id);
    }
}
