public class UserDto {
    @NotBlank
    private String nome;
    
    @NotBlank
    private String cpf;
    
    @NotBlank
    private String senha;

    @NotBlank
    private String confirmacaoSenha;

    @NotBlank
    @Email
    private String email;

    // getters e setters
}
