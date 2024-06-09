import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/seguidores")
public class ControladorSeguidor {
    @Autowired
    private RepositorioSeguidor repositorioSeguidor;

    @Autowired
    private ServicoUsuario servicoUsuario;

    @PostMapping("/seguir")
    public Seguidor seguirUsuario(@RequestBody Seguidor seguidor) {
        Seguidor novoSeguidor = repositorioSeguidor.save(seguidor);
        atualizarNumeroSeguidores(seguidor.getIdSeguido());
        return novoSeguidor;
    }

    private void atualizarNumeroSeguidores(String idUsuarioSeguido) {
        int numeroSeguidores = repositorioSeguidor.countByIdSeguido(idUsuarioSeguido);
        servicoUsuario.atualizarNumeroSeguidores(idUsuarioSeguido, numeroSeguidores);
        System.out.println("O número de seguidores para o usuário " + idUsuarioSeguido + " foi atualizado para " + numeroSeguidores);
    }
}
