import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/usuarios")
public class ControladorUsuario {
    @Autowired
    private RepositorioUsuario repositorioUsuario;

    @PostMapping("/adicionar")
    public Usuario adicionarUsuario(@RequestBody Usuario usuario) {
        return repositorioUsuario.save(usuario);
    }
}
