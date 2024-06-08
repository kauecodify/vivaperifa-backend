import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/mensagens")
public class MensagemController {
    @Autowired
    private MensagemRepository mensagemRepository;

    @PostMapping("/enviar")
    public Mensagem enviarMensagem(@RequestBody Mensagem mensagem) {
        return mensagemRepository.save(mensagem);
    }
}
