
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
public class ClienteDAO {
    Connection con = null;
    PreparedStatement ps = null;
    
    public void inserirCliente(String Nome, String RG, String CPF, Date dataNasc, String endereco, String email){
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            
            String sql = "insert into cadastrar_clientes (nomeCliente, rgCliente, cpfCliente, dtNascCliente, enderecoCliente, emailCliente) values (?, ?, ?, ?, ?, ?)";
            
            ps = con.prepareStatement(sql);
            ps.setString(1, Nome);
            ps.setString(2, RG);
            ps.setString(3, CPF);
            ps.setDate(4, dataNasc);
            ps.setString(5, endereco);
            ps.setString(6, email);
            
            JOptionPane.showMessageDialog(null, "Cliente incluído com sucesso!");
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Não foi possível incluir o cliente. Tente novamente!");
        }
    }
    
    public ResultSet alterarCliente(){
        ResultSet rs = null;
        
        try{
            ConexaoBanco conexao = new ConexaoBanco();
            con = conexao.obterConexao();
            String sql = "update cadastrar_clientes set nomeCliente=?, rgCliente=?, cpfCliente=?, dtNascCliente=?, endereco=?, emailCliente=?";
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery();
            JOptionPane.showMessageDialog(null, "Alterado com sucesso!");
        }catch(Exception e){
            System.out.println("Erro ao alterar os dados!");
            System.err.println(e.getMessage());
        }
        return rs;
}

}
