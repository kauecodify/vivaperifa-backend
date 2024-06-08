import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favoritos")
public class ControladorFavorito {
    @Autowired
    private RepositorioFavorito repositorioFavorito;

    @PostMapping("/adicionar")
    public Favorito adicionarFavorito(@RequestBody Favorito favorito) {
        return repositorioFavorito.save(favorito);
    }

    @GetMapping("/{id}")
    public Favorito obterFavoritoPorId(@PathVariable String id) {
        return repositorioFavorito.findById(id).orElse(null);
    }
}
