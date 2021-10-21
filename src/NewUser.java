
import Styles.TextPrompt;
import java.sql.*;
import javax.swing.JOptionPane;

public class NewUser extends javax.swing.JFrame {
    
    Connect con = new Connect();
    Connection cn = con.connecting();
    
    TextPrompt plhUser, plhPassword, plhEmployee;

    public NewUser() {
        initComponents();
        
        this.setTitle("Jungla - Crear nuevo usuario");
        this.setLocationRelativeTo(null);
        
        txtCUser.requestFocus();
        
        // Estilos
        
        plhUser = new TextPrompt("Nombre de usuario", txtCUser);
        plhPassword = new TextPrompt("Crear contraseña", txtCPassword);
        plhEmployee = new TextPrompt("Número de empleado", txtCEmployee);
        
        plhUser.changeAlpha(0.5f);
        plhPassword.changeAlpha(0.5f);
        plhEmployee.changeAlpha(0.5f);
        
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnCreateUser = new javax.swing.JButton();
        txtCUser = new javax.swing.JTextField();
        txtCPassword = new javax.swing.JPasswordField();
        txtCEmployee = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        lblLogin = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        btnCreateUser.setBackground(new java.awt.Color(153, 153, 255));
        btnCreateUser.setForeground(java.awt.Color.white);
        btnCreateUser.setText("Crear");
        btnCreateUser.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnCreateUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateUserActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Calibri Light", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(40, 40, 40));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Crear usuario");
        jLabel1.setToolTipText("");

        jLabel2.setText("ó");

        lblLogin.setText("Iniciar sesión");
        lblLogin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblLogin.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 337, Short.MAX_VALUE)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCEmployee)
                            .addComponent(btnCreateUser, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(txtCPassword, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 243, Short.MAX_VALUE)
                            .addComponent(txtCUser, javax.swing.GroupLayout.Alignment.TRAILING))))
                .addGap(54, 54, 54))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(137, 137, 137)
                        .addComponent(lblLogin)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(41, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(txtCUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtCPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtCEmployee, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(38, 38, 38)
                .addComponent(btnCreateUser, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(lblLogin)
                .addGap(72, 72, 72))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void clean(){
        
        txtCUser.setText("");
        txtCPassword.setText("");
        txtCEmployee.setText("");
        
    }
    
    private void btnCreateUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateUserActionPerformed
        
        String user = txtCUser.getText();
        String pass = txtCPassword.getText();
        String emp = txtCEmployee.getText();
        
        if( user.equals("") || pass.equals("") || emp.equals("")){
            JOptionPane.showMessageDialog(null, "¡Debes llenar todos los campos!");
            txtCUser.requestFocus();
        } else {
             
             try{
                 
                String query = " INSERT INTO usuarios (nombre_usuario, contrasena, id_empleado) VALUES (?,?,?) ";
                PreparedStatement insert = cn.prepareStatement(query);
                
                insert.setString(1, user);
                insert.setString(2, pass);
                insert.setInt(3, Integer.parseInt(emp));
                insert.executeUpdate();
                
                JOptionPane.showMessageDialog(null, "¡Usuario creado con éxito!");
                
                Main winMain = new Main();
                winMain.setVisible(true);
                this.dispose();
                 
             } catch (SQLException ex){
                JOptionPane.showMessageDialog(null, "Hubo un error inesperado: " + ex);
                clean();
             } catch (java.lang.NumberFormatException ex){
                JOptionPane.showMessageDialog(null, "¡Solo se admiten números enteros!");
                clean();
             }
             
         }
        
    }//GEN-LAST:event_btnCreateUserActionPerformed

    private void lblLoginMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginMouseClicked

        Main winMain = new Main();
        winMain.setVisible(true);
        this.dispose();

    }//GEN-LAST:event_lblLoginMouseClicked

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
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(NewUser.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new NewUser().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCreateUser;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel lblLogin;
    private javax.swing.JTextField txtCEmployee;
    private javax.swing.JPasswordField txtCPassword;
    private javax.swing.JTextField txtCUser;
    // End of variables declaration//GEN-END:variables
}