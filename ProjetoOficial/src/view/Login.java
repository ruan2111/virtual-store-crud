/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;



import dao.ConnectionFactory;
import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.UIManager;

/**
 *
 * @author 24006744
 */
public class Login extends javax.swing.JFrame {

    public static Date data;

    public static Date getData() {
        return data;
    }

    public static void setData(Date data) {
        Login.data = data;
    }
    public static int codigo_pessoa;

    public static int getCodigo_pessoa() {
        return codigo_pessoa;
    }

    public static void setCodigo_pessoa(int codigo_pessoa) {
        Login.codigo_pessoa = codigo_pessoa;
    }
    
    public static String nome_pessoa;

    public static String getNome_pessoa() {
        return nome_pessoa;
    }

    public static void setNome_pessoa(String nome_pessoa) {
        Login.nome_pessoa = nome_pessoa;
    }
    
    private Connection cf1;
    private PreparedStatement stmt1;
    private Statement st1;
    private ResultSet rs1;
    
    private Connection cf;
    private PreparedStatement stmt;
    private Statement st;
    private ResultSet rs;
    
    private Connection cf2;
    private PreparedStatement stmt2;
    private Statement st2;
    private ResultSet rs2;

public boolean acessarSistema(){           
        
    try{
            cf = new ConnectionFactory().getConexao();                   
            String sql = "SELECT * FROM pessoa where email_pessoa = '" + txtLogin.getText() + "' and senha_pessoa = '" +txtSenha.getText() +"'";
            /*String sql1 = "SELECT ID_ENDEREÇO FROM CADASTRO WHERE email ='" + txtMail.getText() + "' ;";*/
           /* rs1 = stmt1.executeQuery();
            rs1.first();*/
            stmt = cf.prepareStatement(sql); 
            rs = stmt.executeQuery();
            while(rs.next()){
                rs.first();
                if(txtLogin.getText().equals(rs.getString("email_pessoa")) &&
                txtSenha.getText().equals(rs.getString("senha_pessoa"))){
                    return true;            
                }else{               
                    return false;
                }
            }    
       }catch(SQLException e){
           return false;
       } 
       return false;
     }

public boolean PegarCod(){           
        
    try{
            cf1 = new ConnectionFactory().getConexao();                   
            String sql = "SELECT codigo_pessoa FROM pessoa where email_pessoa = '" + txtLogin.getText() + "' and senha_pessoa = '" +txtSenha.getText() +"'";
        
            stmt1 = cf1.prepareStatement(sql); 
            rs1 = stmt1.executeQuery();
            while(rs1.next()){
                rs1.first();
                codigo_pessoa = rs1.getInt("codigo_pessoa");
                   
            }    
       }catch(SQLException e){
           return false;
       } 
       return false;
     }

public boolean PegarNome(){           
        
    try{
            cf2 = new ConnectionFactory().getConexao();                   
            String sql = "SELECT nome_pessoa FROM pessoa where email_pessoa = '" + txtLogin.getText() + "' and senha_pessoa = '" +txtSenha.getText() +"'";
        
            stmt2 = cf2.prepareStatement(sql); 
            rs2 = stmt2.executeQuery();
            while(rs2.next()){
                rs2.first();
                nome_pessoa = rs2.getString("nome_pessoa");
                   
            }    
       }catch(SQLException e){
           return false;
       } 
       return false;
     }

       /**
     * Creates new form Login
     */
      public Login(){
         
        initComponents();
        this.setLocationRelativeTo(null);
        getRootPane().setDefaultButton(btnEntrarLogin);
        setIcon();
        int ID;
      
      }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtLogin = new javax.swing.JTextField();
        txtSenha = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        btnEntrarLogin = new javax.swing.JButton();
        btnCadastrar = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Bem Vindo(a)!");
        setResizable(false);

        jLabel1.setText("Login");

        jLabel2.setText("Senha");

        txtLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtLoginActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 18)); // NOI18N
        jLabel3.setText("<html><hr>CYBER TECNOLOGY<hr></html>");

        btnEntrarLogin.setText("Entrar");
        btnEntrarLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEntrarLoginActionPerformed(evt);
            }
        });

        btnCadastrar.setText("Cadastrar-se");
        btnCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCadastrarActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagens/LogoInicial.png"))); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(13, 13, 13)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 107, Short.MAX_VALUE)
                            .addComponent(txtSenha)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnCadastrar)
                        .addGap(18, 18, 18)
                        .addComponent(btnEntrarLogin)))
                .addContainerGap(67, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(txtLogin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEntrarLogin)
                    .addComponent(btnCadastrar))
                .addGap(24, 24, 24))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEntrarLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEntrarLoginActionPerformed
        // TODO add your handling code here:
        
         PegarNome();
         PegarCod();
         
        data = new Date(System.currentTimeMillis());
        
       if(acessarSistema()==true){
            dispose();
            new InterfaceInicial().setVisible(true);   
        } 
        else{
          JOptionPane.showMessageDialog(null, "<html><hr>Login ou Senha incorreto!<hr></html>");
        }
       
       
       
    }//GEN-LAST:event_btnEntrarLoginActionPerformed

    private void btnCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCadastrarActionPerformed
        // TODO add your handling code here:
        
        dispose();
        new PessoaView().setVisible(true);
    }//GEN-LAST:event_btnCadastrarActionPerformed

    private void txtLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtLoginActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtLoginActionPerformed

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCadastrar;
    private javax.swing.JButton btnEntrarLogin;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JTextField txtLogin;
    private javax.swing.JPasswordField txtSenha;
    // End of variables declaration//GEN-END:variables

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("LogoMenor.png")));
    }
}
