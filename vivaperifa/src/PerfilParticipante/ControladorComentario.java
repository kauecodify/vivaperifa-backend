import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/comentarios")
public class ControladorComentario {
    @Autowired
    private RepositorioComentario repositorioComentario;

    @PostMapping("/adicionar")
    public Comentario adicionarComentario(@RequestBody Comentario comentario) {
        return repositorioComentario.save(comentario);
    }

    @GetMapping("/usuario/{idUsuario}")
    public List<Comentario> obterComentariosPorIdUsuario(@PathVariable String idUsuario) {
        return repositorioComentario.findByIdUsuario(idUsuario);
    }
}
