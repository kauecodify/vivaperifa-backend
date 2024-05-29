@RestController
@RequestMapping("/auth")
public class AuthController {
    
    @Autowired
    private UserService userService;
    
    @PostMapping("/register")
    public ResponseEntity<?> registerUser(@Valid @RequestBody UserDto userDto) {
        if (!userDto.getSenha().equals(userDto.getConfirmacaoSenha())) {
            return ResponseEntity.badRequest().body("A senha e a confirmação de senha não coincidem");
        }
        
        // verifica se o CPF já está em uso
        if (userService.existsByCpf(userDto.getCpf())) {
            return ResponseEntity.badRequest().body("CPF já registrado");
        }

        // verifica se o e-mail já está em uso
        if (userService.existsByEmail(userDto.getEmail())) {
            return ResponseEntity.badRequest().body("E-mail já registrado");
        }

        // mapeia DTO (Data Transfer Object) entidade User
        User user = new User();
        user.setNome(userDto.getNome());
        user.setCpf(userDto.getCpf());
        user.setEmail(userDto.getEmail());
        user.setSenha(userDto.getSenha());

        // salva usuário no banco de dados
        userService.save(user);

        return ResponseEntity.ok("Usuário registrado com sucesso");
    }
}
