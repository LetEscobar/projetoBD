import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class CarRepository {
    // Atributo de conexão
    private Connection conn = null;

    public CarRepository() {
        this.conn = ConnectionFactory.createConnection();
    }

    public void save(Car _car) {
        String cSql = "INSERT INTO tb_car (nome, dt_fabricacao, valor) VALUES (?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(cSql);
            ps.setString(1, _car.getNome());
            ps.setDate(2, Date.valueOf(_car.getDt_fabricacao()));
            ps.setDouble(3, _car.getValor());

            ps.executeUpdate();

            System.out.println("INFO: Carro cadastrado!");

        } catch (SQLException e) {
            System.out.println("Erro: Não foi possível inserir o carro!");
        }
    }
}
