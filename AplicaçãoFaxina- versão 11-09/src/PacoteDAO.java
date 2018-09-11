import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Aluno
 */
public class PacoteDAO {
    Connection con = null;
    PreparedStatement ps = null;
    
    public void inserirPacote(String nomePacote, String Preco, String servico){
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            
            String sql = "insert into cadastrar_pacotes (nomePacote, preco, servico) values (?, ?, ?)";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, nomePacote);
            ps.setString(2, Preco);
            ps.setString(3, servico);
            
            JOptionPane.showMessageDialog(null, "Pacote incluído com sucesso!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível incluir o pacote. Tente novamente!");
        }
    }
    
    public ResultSet alterarPacote(){
        ResultSet rs = null;
        
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            String sql = "update cadastrar_pacotes set nomePacote=?, preco=?, produtos_utilizados=?, servico=?";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }catch(Exception e){
            System.out.println("Erro ao alterar os dados!");
            System.err.println(e.getMessage());
        }
        return rs;
    }
    
    public ResultSet excluirPacote(){
        ResultSet rs = null;
        
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            String sql = "delete cadastrar_pacotes where nomePacote=?, preco=?, produtos_utilizados=?, servico=?";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Excluído com sucesso!");
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Erro ao excluir o pacote");
            System.err.println(e.getMessage());
        }
        return rs;
    }
}

