
import Styles.TextPrompt;
import javax.swing.JOptionPane;

public class Productos extends javax.swing.JFrame {

    private String tabla = "productos"; 
    
    TextPrompt plhMProducto, plhMNombre, plhMEmpresa, plhMCantidad, plhMPrecio, plhMDescripcion, plhMDepartamento, plhMCaducidad;
    TextPrompt plhAProducto, plhANombre, plhAEmpresa, plhACantidad, plhAPrecio, plhADescripcion, plhADepartamento, plhACaducidad;
    TextPrompt plhDProducto;
    
    public Productos() {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Jungla - Productos");
        
        plhMProducto = new TextPrompt("ID Producto", txtMProducto);
        plhMNombre = new TextPrompt("Nombre del producto", txtMNombre);
        plhMEmpresa = new TextPrompt("Código de la empresa", txtMEmpresa);
        plhMCantidad = new TextPrompt("Cantidad", txtMCantidad);
        plhMPrecio = new TextPrompt("Precio", txtMPrecio);      
        plhMDescripcion= new TextPrompt("Descripcion", txtMDescripcion);
        plhMDepartamento = new TextPrompt("Departamento", txtMDepartamento);       
        plhMCaducidad = new TextPrompt ("Caducidad (yyyy-mm-dd)", txtMCaducidad);
        plhAProducto = new TextPrompt("ID Producto", txtAProducto);
        plhANombre = new TextPrompt("Nombre del producto", txtANombre);        
        plhAEmpresa = new TextPrompt("Código de la empresa", txtAEmpresa);        
        plhACantidad = new TextPrompt("Cantidad", txtACantidad);        
        plhAPrecio = new TextPrompt("Precio", txtAPrecio);        
        plhADescripcion = new TextPrompt("Descripcion", txtADescripcion);        
        plhADepartamento = new TextPrompt("Departamento", txtADepartamento);        
        plhACaducidad = new TextPrompt("Caducidad (yyyy-mm-dd)", txtACaducidad);       
        plhDProducto = new TextPrompt("ID Producto", txtDProducto);    
        
        plhMProducto.changeAlpha(0.5f);
        plhMNombre.changeAlpha(0.5f);        
        plhMEmpresa.changeAlpha(0.5f);  
        plhMCantidad.changeAlpha(0.5f);        
        plhMPrecio.changeAlpha(0.5f);
        plhMDescripcion.changeAlpha(0.5f);        
        plhMDepartamento.changeAlpha(0.5f);        
        plhMCaducidad.changeAlpha(0.5f);        
        plhAProducto.changeAlpha(0.5f);        
        plhANombre.changeAlpha(0.5f);        
        plhAEmpresa.changeAlpha(0.5f);        
        plhACantidad.changeAlpha(0.5f);       
        plhAPrecio.changeAlpha(0.5f);
        plhADescripcion.changeAlpha(0.5f);        
        plhADepartamento.changeAlpha(0.5f);        
        plhACaducidad.changeAlpha(0.5f);        
        plhDProducto.changeAlpha(0.5f);
                
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        boton_consultas1 = new javax.swing.JButton();
        jFrame1 = new javax.swing.JFrame();
        jFrame2 = new javax.swing.JFrame();
        jFrame3 = new javax.swing.JFrame();
        jFrame4 = new javax.swing.JFrame();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel4 = new javax.swing.JPanel();
        btnConsulta = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblProductos = new javax.swing.JTable();
        jPanel3 = new javax.swing.JPanel();
        boton_agregar2 = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        txtAProducto = new javax.swing.JTextField();
        txtANombre = new javax.swing.JTextField();
        txtADepartamento = new javax.swing.JTextField();
        txtAPrecio = new javax.swing.JTextField();
        txtACantidad = new javax.swing.JTextField();
        txtACaducidad = new javax.swing.JTextField();
        txtAEmpresa = new javax.swing.JTextField();
        txtADescripcion = new javax.swing.JTextField();
        jPanel5 = new javax.swing.JPanel();
        jLabel8 = new javax.swing.JLabel();
        txtMProducto = new javax.swing.JTextField();
        txtMNombre = new javax.swing.JTextField();
        txtMEmpresa = new javax.swing.JTextField();
        txtMPrecio = new javax.swing.JTextField();
        txtMCantidad = new javax.swing.JTextField();
        txtMDescripcion = new javax.swing.JTextField();
        txtMDepartamento = new javax.swing.JTextField();
        txtMCaducidad = new javax.swing.JTextField();
        btnModificar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        boton_agregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        txtDProducto = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        tblDCargos = new javax.swing.JTable();
        lblReturn = new javax.swing.JLabel();

        boton_consultas1.setBorder(null);
        boton_consultas1.setBorderPainted(false);
        boton_consultas1.setContentAreaFilled(false);
        boton_consultas1.setFocusPainted(false);
        boton_consultas1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_consultas1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jFrame1Layout = new javax.swing.GroupLayout(jFrame1.getContentPane());
        jFrame1.getContentPane().setLayout(jFrame1Layout);
        jFrame1Layout.setHorizontalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame1Layout.setVerticalGroup(
            jFrame1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame2Layout = new javax.swing.GroupLayout(jFrame2.getContentPane());
        jFrame2.getContentPane().setLayout(jFrame2Layout);
        jFrame2Layout.setHorizontalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame2Layout.setVerticalGroup(
            jFrame2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame3Layout = new javax.swing.GroupLayout(jFrame3.getContentPane());
        jFrame3.getContentPane().setLayout(jFrame3Layout);
        jFrame3Layout.setHorizontalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame3Layout.setVerticalGroup(
            jFrame3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout jFrame4Layout = new javax.swing.GroupLayout(jFrame4.getContentPane());
        jFrame4.getContentPane().setLayout(jFrame4Layout);
        jFrame4Layout.setHorizontalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        jFrame4Layout.setVerticalGroup(
            jFrame4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 255));

        jPanel4.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        btnConsulta.setBackground(new java.awt.Color(153, 153, 255));
        btnConsulta.setText("Consultar");
        btnConsulta.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnConsulta.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConsultaActionPerformed(evt);
            }
        });
        jPanel4.add(btnConsulta, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 550, 177, 44));

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel6.setText("Consultar Productos");
        jPanel4.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 30, -1, 60));

        tblProductos.setBackground(new java.awt.Color(204, 204, 255));
        tblProductos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tblProductos);

        jPanel4.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(18, 110, 560, -1));

        jTabbedPane1.addTab("Consultar", jPanel4);

        boton_agregar2.setBackground(new java.awt.Color(153, 153, 255));
        boton_agregar2.setText("Agregar nueva venta");
        boton_agregar2.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregar2ActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel4.setText("Agregar Producto");

        txtAProducto.setBackground(new java.awt.Color(204, 204, 255));

        txtANombre.setBackground(new java.awt.Color(204, 204, 255));

        txtADepartamento.setBackground(new java.awt.Color(204, 204, 255));

        txtAPrecio.setBackground(new java.awt.Color(204, 204, 255));

        txtACantidad.setBackground(new java.awt.Color(204, 204, 255));

        txtACaducidad.setBackground(new java.awt.Color(204, 204, 255));

        txtAEmpresa.setBackground(new java.awt.Color(204, 204, 255));

        txtADescripcion.setBackground(new java.awt.Color(204, 204, 255));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(boton_agregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(txtAPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtACantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAEmpresa)
                            .addComponent(txtANombre, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtAProducto)
                            .addComponent(txtADescripcion, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 473, Short.MAX_VALUE)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel3Layout.createSequentialGroup()
                                .addComponent(txtADepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(txtACaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(204, 204, 204))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtAProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtANombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(txtAEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtAPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtACantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtADepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtACaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(txtADescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(boton_agregar2, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Agregar", jPanel3);

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel8.setText("Modificar Producto");

        txtMProducto.setBackground(new java.awt.Color(204, 204, 255));

        txtMNombre.setBackground(new java.awt.Color(204, 204, 255));

        txtMEmpresa.setBackground(new java.awt.Color(204, 204, 255));

        txtMPrecio.setBackground(new java.awt.Color(204, 204, 255));
        txtMPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMPrecioActionPerformed(evt);
            }
        });

        txtMCantidad.setBackground(new java.awt.Color(204, 204, 255));
        txtMCantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMCantidadActionPerformed(evt);
            }
        });

        txtMDescripcion.setBackground(new java.awt.Color(204, 204, 255));

        txtMDepartamento.setBackground(new java.awt.Color(204, 204, 255));
        txtMDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtMDepartamentoActionPerformed(evt);
            }
        });

        txtMCaducidad.setBackground(new java.awt.Color(204, 204, 255));

        btnModificar.setBackground(new java.awt.Color(153, 153, 255));
        btnModificar.setText("Editar");
        btnModificar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        btnModificar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnModificarActionPerformed(evt);
            }
        });

        jLabel2.setText("Debes colocar el id del producto para poder modificar");

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addGap(155, 155, 155))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(198, 198, 198)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtMProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 194, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(52, 52, 52)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(txtMDescripcion)
                        .addGroup(jPanel5Layout.createSequentialGroup()
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtMCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 215, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtMCantidad, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                    .addComponent(txtMNombre)))
                            .addGap(35, 35, 35)
                            .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(txtMEmpresa, javax.swing.GroupLayout.DEFAULT_SIZE, 215, Short.MAX_VALUE)
                                .addComponent(txtMPrecio)
                                .addComponent(txtMDepartamento)))))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(txtMProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMEmpresa, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMCantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtMDepartamento, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtMCaducidad, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addComponent(txtMDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, 118, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(btnModificar, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Editar", jPanel5);

        boton_agregar.setBackground(new java.awt.Color(153, 153, 255));
        boton_agregar.setText("Eliminar venta");
        boton_agregar.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        boton_agregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                boton_agregarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Eliminar Productos");

        txtDProducto.setBackground(new java.awt.Color(204, 204, 255));

        tblDCargos.setBackground(new java.awt.Color(204, 204, 255));
        tblDCargos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tblDCargos);

        lblReturn.setText("Volver");
        lblReturn.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        lblReturn.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblReturnMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(196, 196, 196))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(txtDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(169, 169, 169))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(80, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 441, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(77, 77, 77))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(168, 168, 168))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addComponent(lblReturn)
                        .addGap(48, 48, 48))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(56, 56, 56)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(txtDProducto, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(64, 64, 64)
                .addComponent(boton_agregar, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 136, Short.MAX_VALUE)
                .addComponent(lblReturn))
        );

        jTabbedPane1.addTab("Eliminar", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jTabbedPane1)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(9, Short.MAX_VALUE)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 650, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(51, 51, 51))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void boton_consultas1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_consultas1ActionPerformed
        JOptionPane.showMessageDialog(this, "hola");
    }//GEN-LAST:event_boton_consultas1ActionPerformed

    private void btnConsultaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConsultaActionPerformed
        String query = "SELECT * FROM " +tabla;
        Querys q = new Querys(query);
        q.setTableSelected(tblProductos);
        q.read("Id producto", "Nombre", "Empresa", "Cantidad", "Precio", "Descripcion", "Departamento", "Caducidad");
    }//GEN-LAST:event_btnConsultaActionPerformed

    private void boton_agregar2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregar2ActionPerformed
        String query = "INSERT INTO " +tabla+ "(id_producto, nombre_producto, empresa, cantidad, precio, descripcion, departamento, caducidad) VALUES (?,?,?,?,?,?,?,?)";
        Querys q = new Querys(query);
        q.create(txtAProducto, txtANombre, txtAEmpresa, txtACantidad, txtAPrecio, txtADescripcion, txtADepartamento, txtACaducidad);
    }//GEN-LAST:event_boton_agregar2ActionPerformed

    private void boton_agregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_boton_agregarActionPerformed
        String query = "DELETE from " +tabla+ " WHERE id_producto=?";
        Querys q = new Querys(query);
        q.delete(txtDProducto);
    }//GEN-LAST:event_boton_agregarActionPerformed

    private void btnModificarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnModificarActionPerformed
        String query = "UPDATE " +tabla+ " SET  nombre=?, empresa=?, cantidad=?, precio=?, descripcion=?, departamento=?, caducidad=?  WHERE id_producto=?";
        Querys q = new Querys(query);
        q.update(txtMNombre, txtMEmpresa, txtMCantidad, txtMPrecio, txtMDescripcion, txtMDepartamento, txtMCaducidad, txtMProducto);
    }//GEN-LAST:event_btnModificarActionPerformed

    private void txtMDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMDepartamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMDepartamentoActionPerformed

    private void txtMCantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMCantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMCantidadActionPerformed

    private void txtMPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtMPrecioActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtMPrecioActionPerformed

    private void lblReturnMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblReturnMouseClicked
        Menu winMenu = new Menu();
        winMenu.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_lblReturnMouseClicked

    private void clean(){
        
    }
    
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
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Productos.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new Productos().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton boton_agregar;
    private javax.swing.JButton boton_agregar2;
    private javax.swing.JButton boton_consultas1;
    private javax.swing.JButton btnConsulta;
    private javax.swing.JButton btnModificar;
    private javax.swing.JFrame jFrame1;
    private javax.swing.JFrame jFrame2;
    private javax.swing.JFrame jFrame3;
    private javax.swing.JFrame jFrame4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblReturn;
    private javax.swing.JTable tblDCargos;
    private javax.swing.JTable tblProductos;
    private javax.swing.JTextField txtACaducidad;
    private javax.swing.JTextField txtACantidad;
    private javax.swing.JTextField txtADepartamento;
    private javax.swing.JTextField txtADescripcion;
    private javax.swing.JTextField txtAEmpresa;
    private javax.swing.JTextField txtANombre;
    private javax.swing.JTextField txtAPrecio;
    private javax.swing.JTextField txtAProducto;
    private javax.swing.JTextField txtDProducto;
    private javax.swing.JTextField txtMCaducidad;
    private javax.swing.JTextField txtMCantidad;
    private javax.swing.JTextField txtMDepartamento;
    private javax.swing.JTextField txtMDescripcion;
    private javax.swing.JTextField txtMEmpresa;
    private javax.swing.JTextField txtMNombre;
    private javax.swing.JTextField txtMPrecio;
    private javax.swing.JTextField txtMProducto;
    // End of variables declaration//GEN-END:variables


 
}
