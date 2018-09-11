
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author Gabriel Martins Pereira Gonçalves
 */
public class ProdutosDAO {
    Connection con = null;
    PreparedStatement ps = null;
    
    public void cadastrarProduto(String nomeProduto, String marca, String cheiro, String categoria, String descricao) {
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            
            String sql = "Insert into cadastrar_produtos( nomeProduto, marcaProduto , cheiroProduto, categoriaProduto, "
                    + "descricaoProduto) values(?,?,?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, nomeProduto);
            ps.setString(2, marca);
            ps.setString(3, cheiro);
            ps.setString(4, categoria);
            ps.setString(5, descricao);
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Produto Incluido");
            
    }catch(Exception e){
            System.out.println("Erro no Incluir o Produto " + e.getMessage());
        }      
    }
    public ResultSet obterProduto(){
        ResultSet rs  = null;
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            String sql = "select * from cadastrar_produtos";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }
        catch(Exception e ){
            System.err.println("Erro ao obter o registro");
            System.out.println(e.getMessage());
        }
        return rs;
    }    
    public void excluirCandidato(int codigo){
        ConexaoBanco conexao = new ConexaoBanco();
        con = conexao.obterConexao();
        
        try{
            String sql = "delete from cadastrar_produtos where codigo=?";
            ps = con.prepareStatement(sql);
            ps.setInt(1 ,codigo);
            ps.executeUpdate();
            
          /* int ll = JOptionPane.showConfirmDialog(null, " Deseja realmente excluir o produto? ");
           if( ll == 0)
                System.out.println("Produto Excluido");
           else
                System.out.println("Exclusão cancelada");
            */
            
            JOptionPane.showMessageDialog(null, " Produto excluido com sucesso ");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir");
            System.out.println(e);
        }
    }
}
