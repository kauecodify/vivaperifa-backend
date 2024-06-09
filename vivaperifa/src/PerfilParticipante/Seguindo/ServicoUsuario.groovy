import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ServicoUsuario {

    @Autowired
    private RepositorioUsuario repositorioUsuario;

    public void atualizarNumeroSeguidores(String idUsuario, int numeroSeguidores) {
        Usuario usuario = repositorioUsuario.findById(idUsuario).orElse(null);
        if (usuario != null) {
            usuario.setNumeroSeguidores(numeroSeguidores);
            repositorioUsuario.save(usuario);
        }
    }
}