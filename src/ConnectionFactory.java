import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
public class ConnectionFactory {
    public static Connection createConnection(){
        String url = "jdbc:mysql://localhost:3306/aulaBD";
        String userName = "root";
        String pwd = "";

        try{
            // Carrega o driver do mySQL:
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection conn = DriverManager.getConnection(url, userName, pwd);
            System.out.println("Conected!");
            return conn;

        }catch(ClassNotFoundException erro){
            System.out.println("Erro: Driver not found");
        }catch(SQLException erro){
            System.out.println("Erro: Connection failed!");
            erro.printStackTrace();
        }

        return null;
    }
}
