import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserRepository {
    // repositório para concentrar todas as operações de banco de dados
    // DAO = DATA ACCESS OBJECT (é o mesmo que repository na literatura antiga)
    // CRUD (todo repositório se baseia nessas 4 operações):
    // C = Create (insert into)
    // R = Read (select from)
    // U = Update(update set)
    // D = Delete(delete from)

    // Atributo de conexão:
    private Connection conn = null;

    public UserRepository() {
        // evitar tratar exceptiondentro do construtor
        this.conn = ConnectionFactory.createConnection();
    }

    // Métodos que sempre vão existir, e os nomes costumam ser um padrão:
    public void save(User _user) {
        String uSql = "INSERT INTO tb_user (username, password, status, token) VALUES (?, ?, ?, ?)";
        try {
            PreparedStatement ps = conn.prepareStatement(uSql);
            ps.setString(1, _user.getUsername());
            ps.setString(2, _user.getPassword());
            ps.setInt(3, _user.getStatus());
            ps.setDouble(4, _user.getToken());

            // a função executeUpdate() é usada para: INSERT, UPDATE e DELETE
            ps.executeUpdate();

            System.out.println("INFO: Usuário cadastrado!");

        } catch (SQLException e) {
            System.out.println("Erro: Não foi possível inserir o usuário!");
        }
    }

    public void selectAll() {
    }

    public void update(User _user) {
    }

    public void delete(User _user) {
    }
}
