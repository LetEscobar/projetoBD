import java.sql.Date;

import javafx.scene.chart.PieChart.Data;

public class App {
    public static void main(String[] args) {
        ConnectionFactory.createConnection();

        User leticia = new User();

        leticia.setUsername("leticia");
        leticia.setPassword("admin");
        leticia.setStatus(1);
        leticia.setToken(3.1415);

        Car carro = new Car();

        carro.setNome("novo carro");
        carro.setDt_fabricacao(null);
        carro.setValor(1.1234);

        // Salvar o objeto do tipo user no banco de dados
        UserRepository userRepository = new UserRepository();
        userRepository.save(leticia);

        CarRepository carRepository = new CarRepository();
        carRepository.save(carro);
    }
}
