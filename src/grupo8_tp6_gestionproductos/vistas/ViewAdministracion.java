
package grupo8_tp6_gestionproductos.vistas;

import java.util.ArrayList;


public class ViewAdministracion extends javax.swing.JInternalFrame {
    
  

    
    public ViewAdministracion() {
        initComponents();
        inicializadorCombo();
        
        
    }
    
    private void inicializadorCombo(){
        ArrayList <String> categorias = new ArrayList<>();
        categorias.add("Ropa");
        categorias.add("Electrodomesticos");
        categorias.add("Comestible");
        categorias.add("Limpieza");
        
        jcbCategoria.removeAllItems();
        
        for (String cat : categorias){
            jcbCategoria.addItem(cat);
        }
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jToggleButton5 = new javax.swing.JToggleButton();
        jbAgregar = new javax.swing.JButton();
        jpAdmin = new javax.swing.JPanel();
        jlCategoria = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jtfNombre = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jSpinner1 = new javax.swing.JSpinner();
        jToggleButton1 = new javax.swing.JToggleButton();
        jToggleButton2 = new javax.swing.JToggleButton();
        jToggleButton3 = new javax.swing.JToggleButton();
        jToggleButton4 = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jToggleButton5.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton5.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-trash-can-32.png"))); // NOI18N
        jToggleButton5.setText("Borrar");
        jToggleButton5.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jbAgregar.setBackground(new java.awt.Color(0, 0, 0));
        jbAgregar.setForeground(new java.awt.Color(255, 255, 255));
        jbAgregar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-search-32.png"))); // NOI18N
        jbAgregar.setText("Buscar");
        jbAgregar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jpAdmin.setBackground(new java.awt.Color(51, 51, 51));
        jpAdmin.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        jpAdmin.setForeground(new java.awt.Color(255, 255, 255));
        jpAdmin.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jlCategoria.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jlCategoria.setText("Rubro:");

        jcbCategoria.setBackground(new java.awt.Color(102, 102, 102));
        jcbCategoria.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jcbCategoria.setForeground(new java.awt.Color(255, 255, 255));
        jcbCategoria.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcbCategoriaItemStateChanged(evt);
            }
        });
        jcbCategoria.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jcbCategoriaActionPerformed(evt);
            }
        });

        jtfNombre.setBackground(new java.awt.Color(102, 102, 102));
        jtfNombre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfNombre.setForeground(new java.awt.Color(255, 255, 255));
        jtfNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfNombreActionPerformed(evt);
            }
        });

        jlNombre.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlNombre.setForeground(new java.awt.Color(255, 255, 255));
        jlNombre.setText("Descripcion:");

        jlPrecio.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jlPrecio.setForeground(new java.awt.Color(255, 255, 255));
        jlPrecio.setText("Precio:");

        jtfPrecio.setBackground(new java.awt.Color(102, 102, 102));
        jtfPrecio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfPrecio.setForeground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Codigo:");

        jTextField1.setBackground(new java.awt.Color(102, 102, 102));
        jTextField1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jTextField1.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock:");

        jSpinner1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        javax.swing.GroupLayout jpAdminLayout = new javax.swing.GroupLayout(jpAdmin);
        jpAdmin.setLayout(jpAdminLayout);
        jpAdminLayout.setHorizontalGroup(
            jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdminLayout.createSequentialGroup()
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jpAdminLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jpAdminLayout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfPrecio)
                        .addComponent(jtfNombre)
                        .addComponent(jTextField1)
                        .addComponent(jcbCategoria, 0, 137, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAdminLayout.setVerticalGroup(
            jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdminLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jTextField1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jSpinner1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jToggleButton1.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton1.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cross-32.png"))); // NOI18N
        jToggleButton1.setText("Cerrar");
        jToggleButton1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButton2.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton2.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-new-32.png"))); // NOI18N
        jToggleButton2.setText("Nuevo");
        jToggleButton2.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButton3.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton3.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-save-32.png"))); // NOI18N
        jToggleButton3.setText("Guardar");
        jToggleButton3.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jToggleButton4.setBackground(new java.awt.Color(0, 0, 0));
        jToggleButton4.setForeground(new java.awt.Color(255, 255, 255));
        jToggleButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-update-32.png"))); // NOI18N
        jToggleButton4.setText("Actualizar");
        jToggleButton4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Gestion Productos");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jpAdmin, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(39, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jToggleButton3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jToggleButton5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jToggleButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jbAgregar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addComponent(jpAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton2)
                    .addComponent(jToggleButton3)
                    .addComponent(jbAgregar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jToggleButton4)
                    .addComponent(jToggleButton5)
                    .addComponent(jToggleButton1))
                .addContainerGap(29, Short.MAX_VALUE))
        );

        jpAdmin.getAccessibleContext().setAccessibleName("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfNombreActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfNombreActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jcbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCategoriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaItemStateChanged


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JToggleButton jToggleButton1;
    private javax.swing.JToggleButton jToggleButton2;
    private javax.swing.JToggleButton jToggleButton3;
    private javax.swing.JToggleButton jToggleButton4;
    private javax.swing.JToggleButton jToggleButton5;
    private javax.swing.JButton jbAgregar;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JPanel jpAdmin;
    private javax.swing.JTextField jtfNombre;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
}
