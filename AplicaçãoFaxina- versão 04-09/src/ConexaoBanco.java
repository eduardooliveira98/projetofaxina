
import java.sql.Connection;
import java.sql.DriverManager;

/**
 * Classe criada para fazer a conexão com o Banco de Dados.
 * @author  GabrielMartins 
 */
public class ConexaoBanco {
    
    public Connection conexao;
    public ConexaoBanco(){
        carregarDriver();
    }
    public void carregarDriver(){
        try{
            Class.forName("com.mysql.jdbc.Driver");       
        }
        catch(Exception e){
            System.out.println("Erro ao carregar o driver");
        }
    }
    public Connection obterConexao(){
        try{
            String host = "jdbc:mysql://localhost:3306/bd_projeto";
            String user = "root";
            String senha = "";
            conexao = DriverManager.getConnection(host,user,senha);
            System.out.println("Conexão com o BD com sucesso");
        }
        catch(Exception e){
            System.out.println("Erro de conexão com o BD");
            System.out.println(e.getMessage());
        }
        return conexao;
    }
    }
