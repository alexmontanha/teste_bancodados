import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Preparando a conexão com o banco de dados...");

        // Conexão com o banco de dados
        String user = "root"; // Coloque o usuário do seu banco de dados
        String password = "senha"; // Coloque a senha do seu banco de dados
        String host = "localhost";
        String port = "3306";
        String database = "aula_seg";

        String url = "jdbc:mysql://" + host + ":" + port + "/" + database;

        // Carregando o driver
        Class.forName("com.mysql.cj.jdbc.Driver");

        // Criando a conexão
        Connection con = DriverManager.getConnection(url, user, password);

        System.out.println("Conexão estabelecida com sucesso!");

        // Criando o comando SQL
        String sql = "SELECT Id, Nome, Endereco, cep, Limite_Credito FROM clientes";

        // Criando o comando
        PreparedStatement stmt = con.prepareStatement(sql);

        // Listar todos os clientes da tabela de clientes
        stmt.execute();

        while (stmt.getResultSet().next()) {
            int id = stmt.getResultSet().getInt("Id");
            String nome = stmt.getResultSet().getString("Nome");
            String endereco = stmt.getResultSet().getString("Endereco");
            String cep = stmt.getResultSet().getString("cep");
            double limiteCredito = stmt.getResultSet().getDouble("Limite_Credito");

            System.out.println("Id: " + id + " Nome: " + nome + " Endereço: " + endereco + " CEP: " + cep + " Limite de Crédito: " + limiteCredito);
        }

        // Fechando a conexão
        stmt.close();
        con.close();
        
    }
}
