import java.util.List;

public class App {
    public static void main(String[] args) {
        ConnectionFactory.createConnection();

        User leticia = new User();

        leticia.setUsername("leticia");
        leticia.setPassword("admin");
        leticia.setStatus(1);
        leticia.setToken(3.1415);

        // Salvar o objeto do tipo user no banco de dados
        UserRepository userRepository = new UserRepository();

        List<User> usuario = userRepository.selectAll();
    }
}
