import java.sql.ResultSet;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Aluno
 */
public class CadastrarServiços extends javax.swing.JFrame {

    /**
     * Creates new form CadastrarServiços
     */
    public CadastrarServiços() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtNomeServico = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtDescricao = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cb_Status = new javax.swing.JComboBox<>();
        btCadastrarServiço = new javax.swing.JButton();
        btAlterarServiço = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaServico = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 36)); // NOI18N
        jLabel1.setText("Cadastramento de Ordem de Serviço");

        jLabel2.setText("Nome do Serviço: ");

        jLabel3.setText("Descrição:");

        jLabel4.setText("Status:");

        cb_Status.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        btCadastrarServiço.setText("Cadastrar a Ordem de Serviço");
        btCadastrarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btCadastrarServiçoActionPerformed(evt);
            }
        });

        btAlterarServiço.setText("Alterar Serviço");
        btAlterarServiço.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btAlterarServiçoActionPerformed(evt);
            }
        });

        tabelaServico.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Título 4"
            }
        ));
        jScrollPane1.setViewportView(tabelaServico);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtNomeServico, javax.swing.GroupLayout.DEFAULT_SIZE, 316, Short.MAX_VALUE)
                                    .addComponent(txtDescricao))
                                .addGap(29, 29, 29)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 392, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(37, 37, 37)
                        .addComponent(btCadastrarServiço)
                        .addGap(18, 18, 18)
                        .addComponent(btAlterarServiço)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(184, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(151, 151, 151))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(69, 69, 69)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNomeServico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, 181, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 212, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(cb_Status, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btCadastrarServiço)
                    .addComponent(btAlterarServiço))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btCadastrarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btCadastrarServiçoActionPerformed

        ServiçoDAO dDAO = new ServiçoDAO();
        dDAO.cadastrarServico(txtNomeServico.getText(),(String) cb_Status.getSelectedItem(), txtDescricao.getText());
        
        ResultSet rs = dDAO.obterServico();
        carregarDadosNaJTable(rs);
        // TODO add your handling code here:
    }//GEN-LAST:event_btCadastrarServiçoActionPerformed

     public void carregarDadosNaJTable (ResultSet rs){
        try{
            String colunas[] = { "Codigo" ,"Nome do Serviço", "Descrição do Serviço","Status do Serviço"}; 
            DefaultTableModel model = new DefaultTableModel(null, colunas);
            tabelaServico.setModel(model);
            
            while (rs.next()){
                String linha [] = {rs.getString("codigo"), rs.getString("nomeServico"), rs.getString("descricaoServico"), rs.getString ("statusServico")};
                model.addRow(linha);
            }
            
        }
        catch (Exception e){
            System.out.println("Erro de carregar jTabela");
            System.out.println(e.getMessage());
        }   
     }
    
    private void btAlterarServiçoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btAlterarServiçoActionPerformed
        ServiçoDAO dDao = new ServiçoDAO();
        
        int linhaSelecionada = tabelaServico.getSelectedRow();
        String nServico = (tabelaServico.getModel().getValueAt(linhaSelecionada, 1).toString());
        String novoNome = (txtNomeServico.getText());
        
        
        dDao.alterarServiço (Integer.parseInt( txtNomeServico.getText()), (String) cb_Status.getSelectedItem(), nServico, novoNome);


            
        ServiçoDAO Dao = new ServiçoDAO();
        ResultSet rs = Dao.obterServico();

        carregarDadosNaJTable(rs);
       // dDao.alterarServiço(txtNomeServico.getText(), (String) cb_Status.getSelectedItem(), txtDescricao.getText());
    
        
        // TODO add your handling code here:
    }//GEN-LAST:event_btAlterarServiçoActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        ServiçoDAO dDAO = new ServiçoDAO();
        ResultSet rs = dDAO.obterServico();
        
                
       carregarDadosNaJTable(rs);
       
        // TODO add your handling code here:
    }//GEN-LAST:event_formWindowOpened

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(CadastrarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastrarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastrarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastrarServiços.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastrarServiços().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btAlterarServiço;
    private javax.swing.JButton btCadastrarServiço;
    private javax.swing.JComboBox<String> cb_Status;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaServico;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtNomeServico;
    // End of variables declaration//GEN-END:variables
}
