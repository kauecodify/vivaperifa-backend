@Document(collection = "users")
public class User {
    @Id
    private String id;
    
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
