
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 * Classe criada para 
 * @author GabrielMartins 
 */
public class ServiçoDAO {
    Connection con = null;
    PreparedStatement ps = null;
    
    public void cadastrarServico(String nomeSevico, String descricaoServico, String statusServico) {
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            
            String sql = "Insert into cadastrar_servico( nomeSevico, descricaoServico, statusServico) values(?,?,?)";
            ps = con.prepareStatement(sql);
            ps.setString(1, nomeSevico );
            
            ps.setString(2, statusServico);
            ps.setString(3, descricaoServico);
            ps.executeUpdate();
                JOptionPane.showMessageDialog(null, "Serviço Incluido");
            
    }catch(Exception e){
            System.out.println("Erro no Incluir o Serviço " + e.getMessage());
        }      
    }
    public ResultSet obterServico(){
        ResultSet rs  = null;
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            String sql = "select * from cadastrar_servico";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
        }
        catch(Exception e ){
            System.err.println("Erro ao obter o registro");
            System.out.println(e.getMessage());
        }
        return rs;
    }
    public void alterarServiço( int codigo, String nomeServico, String descricaoServico, String statusServico){
        ConexaoBanco conexao = new ConexaoBanco();
        con = conexao.obterConexao();
        String sql = "update cadastrarServiço set nomeServico=?, descricaoServico=?, statusServico=? where codigo=?";
        
        try{
            ps = con.prepareStatement(sql);
            ps.setString(1, nomeServico);
            ps.setString(2, descricaoServico);
            ps.setString(3, statusServico);
            ps.setInt(4, codigo);
            ps.executeUpdate();
            JOptionPane.showMessageDialog(null, "Alteração realizada!");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao atualizar");
            System.out.println(e.getMessage());
        }
    }
    
}
