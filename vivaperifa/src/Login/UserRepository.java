public interface UserRepository extends MongoRepository<User, String> {
    boolean existsByCpf(String cpf);
    boolean existsByEmail(String email);
    List<User> findByNome(String nome);
    List<User> findByCpf(String cpf);
    List<User> findByEmail(String email);
    List<User> findByIdade(int idade);
}
