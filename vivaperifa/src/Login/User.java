@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @NotBlank
    private String nome;
    
    @NotBlank
    private String cpf;
    
    @NotBlank
    private String senha;

    @Transient
    private String confirmacaoSenha;

    @NotBlank
    private String email;

    // getters e setters
}
