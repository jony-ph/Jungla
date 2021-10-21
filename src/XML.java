import javax.xml.parsers.DocumentBuilderFactory;
import javax.swing.JOptionPane;
import java.sql.*;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.*;

public class XML extends javax.swing.JFrame {
    
    static String server, user, password, port;

    public XML() {
        initComponents();
        this.setTitle("Comprobando conexión con MySQL");
        this.setLocationRelativeTo(null);
        btnEnter.setEnabled(false);
    }


    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        txtServer = new javax.swing.JTextField();
        txtUser = new javax.swing.JTextField();
        txtPort = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnValidate = new javax.swing.JButton();
        btnEnter = new javax.swing.JButton();
        txtPassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtUser.setToolTipText("");

        txtPort.setText("3306");

        jLabel1.setText("Servidor");

        jLabel2.setText("Usuario");

        jLabel3.setText("Contraseña");

        jLabel4.setText("Puerto");

        btnValidate.setText("Validar");
        btnValidate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnValidateActionPerformed(evt);
            }
        });

        btnEnter.setText("Ingresar");
        btnEnter.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEnterActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(112, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel3)
                                .addGap(43, 43, 43)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(52, 52, 52)
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(67, 67, 67))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(btnValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(134, 134, 134))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtServer, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtPort, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtUser, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(47, 47, 47)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 42, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnEnter, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnValidate, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(45, 45, 45))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void checkConnection(String ser, String us, String pass, String pt){
     
        // Creando conexión y comprobando acceso
        try{
            
            Connection con = DriverManager.getConnection("jdbc:mysql://" + ser + ":" + pt
            + "?&uselSSL=false&user=" + us + "&password=" + pass);
            btnEnter.setEnabled(true);
            
            JOptionPane.showMessageDialog(null, "¡Conexión válida!");
            
        } catch(SQLException e){
            JOptionPane.showMessageDialog(null, "¡Conexión inválida! " + e);
        }

    }
    
    
    public void generateXML(String ser, String us, String pass, String pt, String file) throws Exception{
        
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder builder = dbf.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document doc = implementation.createDocument(null, file, null);
            doc.setXmlVersion("1.0");
            
            // Creando elemento raíz
            Element root = doc.getDocumentElement();
            
                // Creando elemento servidor
                Element itemNode = doc.createElement("Elemento");

                    Element keyNode = doc.createElement("Nombre");
                    Text nodeKeyValue = doc.createTextNode("Servidor");
                    keyNode.appendChild(nodeKeyValue);

                    Element valueNode = doc.createElement("Valor");
                    Text nodeValue = doc.createTextNode(ser);
                    valueNode.appendChild(nodeValue);

                itemNode.appendChild(keyNode);
                itemNode.appendChild(valueNode);
                
                // Creando elemento usuario
                Element itemNode2 = doc.createElement("Elemento");

                    Element keyNode2 = doc.createElement("Nombre");
                    Text nodeKeyValue2 = doc.createTextNode("Usuario");
                    keyNode2.appendChild(nodeKeyValue2);

                    Element valueNode2 = doc.createElement("Valor");
                    Text nodeValue2 = doc.createTextNode(us);
                    valueNode2.appendChild(nodeValue2);

                itemNode2.appendChild(keyNode2);
                itemNode2.appendChild(valueNode2);
            
                // Creando elemento contraseña
                Element itemNode3 = doc.createElement("Elemento");

                    Element keyNode3 = doc.createElement("Nombre");
                    Text nodeKeyValue3 = doc.createTextNode("Contraseña");
                    keyNode3.appendChild(nodeKeyValue3);

                    Element valueNode3 = doc.createElement("Valor");
                    Text nodeValue3 = doc.createTextNode(pass);
                    valueNode3.appendChild(nodeValue3);

                itemNode3.appendChild(keyNode3);
                itemNode3.appendChild(valueNode3);
                
                // Creando elemento puerto
                Element itemNode4 = doc.createElement("Elemento");

                    Element keyNode4 = doc.createElement("Nombre");
                    Text nodeKeyValue4 = doc.createTextNode("Puerto");
                    keyNode4.appendChild(nodeKeyValue4);

                    Element valueNode4 = doc.createElement("Valor");
                    Text nodeValue4 = doc.createTextNode(pt);
                    valueNode4.appendChild(nodeValue4);

                itemNode4.appendChild(keyNode4);
                itemNode4.appendChild(valueNode4);
                
                
            root.appendChild(itemNode);
            root.appendChild(itemNode2);
            root.appendChild(itemNode3);
            root.appendChild(itemNode4);
            
            // Genera el archivo XML a partir del DOM creado
            Source source = new DOMSource(doc);
            Result result = new StreamResult(new java.io.File(file + ".xml"));
            javax.xml.transform.Transformer transformer = TransformerFactory.newDefaultInstance().newInstance().newTransformer();
            transformer.transform(source, result);
            JOptionPane.showMessageDialog(null, "Se creó XML correctamente");
            
        } catch (ParserConfigurationException e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo!" + e);
        }
    }
    
    private void btnValidateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnValidateActionPerformed

        // Extraer texto de inputs
        server = txtServer.getText();
        user = txtUser.getText();
        password = txtPassword.getText();
        port = txtPort.getText();
           
        // Comprobando la conexión
        if(server.equals("") || user.equals("") || port.equals("")){
            JOptionPane.showMessageDialog(null, "¡Debes llenar los campos!");
        } else {
            checkConnection(server, user, password, port);     
        }
            
    }//GEN-LAST:event_btnValidateActionPerformed

    private void btnEnterActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEnterActionPerformed
        
        // Generando archivo XML
        String file = "Conexion";
        try {
            generateXML(server, user, password, port, file);
            
            Main win = new Main();
            win.setVisible(true);
            this.dispose();
                    
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "No se pudo crear el archivo!" + e);
        }
       
    }//GEN-LAST:event_btnEnterActionPerformed

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
            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(XML.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new XML().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnEnter;
    private javax.swing.JButton btnValidate;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPasswordField txtPassword;
    private javax.swing.JTextField txtPort;
    private javax.swing.JTextField txtServer;
    private javax.swing.JTextField txtUser;
    // End of variables declaration//GEN-END:variables
}
