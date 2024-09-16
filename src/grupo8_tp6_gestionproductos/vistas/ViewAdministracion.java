
package grupo8_tp6_gestionproductos.vistas;

import clases.Producto;
import java.util.Map;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ViewAdministracion extends javax.swing.JInternalFrame {
    
    private DefaultTableModel modeloTabla = new DefaultTableModel()
    { //EXTRA podemos abrir llaves para configurar el metodo.SOBREESCRIBIR.SE LLAMA CLASE INTERN ANONIMA
          @Override
          //por cada celda de la tabla se ejecuta este metodo
        public boolean isCellEditable(int fila, int columna) {
        //return super.isCellEditable(fila, columna); //SI cambiamos el Return por false las tablas no son editables Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
                return false;
        } 
    
    }; 
    
    public ViewAdministracion() {
        initComponents();
        inicializadorCombo();
        cabeceraGestion();
        cargarDatos();
        
        
    }
    
    private void inicializadorCombo(){
        jcbCategoria.addItem("Perfumeria");
        jcbCategoria.addItem("Comestible");
        jcbCategoria.addItem("Limpieza");
        jcbCategoria.addItem("Farmacia");
        jcbCategoria.addItem("Ropa");
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jPanel1 = new javax.swing.JPanel();
        jtbBorrar = new javax.swing.JToggleButton();
        jtbBuscar = new javax.swing.JButton();
        jpAdmin = new javax.swing.JPanel();
        jlCategoria = new javax.swing.JLabel();
        jcbCategoria = new javax.swing.JComboBox<>();
        jtfDescripcion = new javax.swing.JTextField();
        jlNombre = new javax.swing.JLabel();
        jlPrecio = new javax.swing.JLabel();
        jtfPrecio = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jtfCodigo = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jsStock = new javax.swing.JSpinner();
        jtbCerrar = new javax.swing.JToggleButton();
        jtbNuevo = new javax.swing.JToggleButton();
        jtbGuardar = new javax.swing.JToggleButton();
        jtbActualizar = new javax.swing.JToggleButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        jtTablaGestion = new javax.swing.JTable();

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        setBackground(new java.awt.Color(0, 0, 0));

        jPanel1.setBackground(new java.awt.Color(51, 51, 51));

        jtbBorrar.setBackground(new java.awt.Color(0, 0, 0));
        jtbBorrar.setForeground(new java.awt.Color(255, 255, 255));
        jtbBorrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-trash-can-32.png"))); // NOI18N
        jtbBorrar.setText("Borrar");
        jtbBorrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbBorrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbBorrarActionPerformed(evt);
            }
        });

        jtbBuscar.setBackground(new java.awt.Color(0, 0, 0));
        jtbBuscar.setForeground(new java.awt.Color(255, 255, 255));
        jtbBuscar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-search-32.png"))); // NOI18N
        jtbBuscar.setText("Buscar");
        jtbBuscar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbBuscarActionPerformed(evt);
            }
        });

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

        jtfDescripcion.setBackground(new java.awt.Color(102, 102, 102));
        jtfDescripcion.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfDescripcion.setForeground(new java.awt.Color(255, 255, 255));
        jtfDescripcion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtfDescripcionActionPerformed(evt);
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

        jtfCodigo.setBackground(new java.awt.Color(102, 102, 102));
        jtfCodigo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jtfCodigo.setForeground(new java.awt.Color(255, 255, 255));

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Stock:");

        jsStock.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

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
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jtfPrecio)
                        .addComponent(jtfDescripcion)
                        .addComponent(jtfCodigo)
                        .addComponent(jcbCategoria, 0, 137, Short.MAX_VALUE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jpAdminLayout.setVerticalGroup(
            jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jpAdminLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jtfCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(19, 19, 19)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jcbCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jlCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfDescripcion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jlPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jtfPrecio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jpAdminLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jsStock, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        jtbCerrar.setBackground(new java.awt.Color(0, 0, 0));
        jtbCerrar.setForeground(new java.awt.Color(255, 255, 255));
        jtbCerrar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-cross-32.png"))); // NOI18N
        jtbCerrar.setText("Cerrar");
        jtbCerrar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbCerrarActionPerformed(evt);
            }
        });

        jtbNuevo.setBackground(new java.awt.Color(0, 0, 0));
        jtbNuevo.setForeground(new java.awt.Color(255, 255, 255));
        jtbNuevo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-add-new-32.png"))); // NOI18N
        jtbNuevo.setText("Nuevo");
        jtbNuevo.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbNuevoActionPerformed(evt);
            }
        });

        jtbGuardar.setBackground(new java.awt.Color(0, 0, 0));
        jtbGuardar.setForeground(new java.awt.Color(255, 255, 255));
        jtbGuardar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-save-32.png"))); // NOI18N
        jtbGuardar.setText("Guardar");
        jtbGuardar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbGuardarActionPerformed(evt);
            }
        });

        jtbActualizar.setBackground(new java.awt.Color(0, 0, 0));
        jtbActualizar.setForeground(new java.awt.Color(255, 255, 255));
        jtbActualizar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/icons8-update-32.png"))); // NOI18N
        jtbActualizar.setText("Actualizar");
        jtbActualizar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jtbActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtbActualizarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(0, 204, 0));
        jLabel3.setText("Gestion Productos");

        jtTablaGestion.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jtTablaGestion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jtTablaGestionMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(jtTablaGestion);

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
                    .addComponent(jtbActualizar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbNuevo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jtbGuardar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbBorrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtbCerrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jtbBuscar, javax.swing.GroupLayout.DEFAULT_SIZE, 124, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 364, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                    .addComponent(jtbNuevo)
                    .addComponent(jtbGuardar)
                    .addComponent(jtbBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jtbActualizar)
                    .addComponent(jtbBorrar)
                    .addComponent(jtbCerrar))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 174, Short.MAX_VALUE)
                .addContainerGap())
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
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfDescripcionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtfDescripcionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtfDescripcionActionPerformed

    private void jcbCategoriaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jcbCategoriaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaActionPerformed

    private void jcbCategoriaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcbCategoriaItemStateChanged
        // TODO add your handling code here:
    }//GEN-LAST:event_jcbCategoriaItemStateChanged

    private void jtbGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbGuardarActionPerformed
        // TODO add your handling code here:
        try{
            Long codigo = Long.valueOf(jtfCodigo.getText());
            String rubro=(String) jcbCategoria.getSelectedItem();
            String descripcion=jtfDescripcion.getText();
            descripcion.toLowerCase();
            int precio = Integer.parseInt(jtfPrecio.getText());
            int stock = (int) jsStock.getValue();
            if(!rubro.isEmpty()&& !descripcion.isEmpty()){
                Producto productoCreado = new Producto(rubro,descripcion,precio,stock);
                if(!ViewMenuPrincipal.mapaProductos.containsKey(codigo)){
                    ViewMenuPrincipal.mapaProductos.put(codigo, productoCreado);
                     JOptionPane.showMessageDialog(this, "¡Producto almacenado con exito!", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
                }else{
                    JOptionPane.showMessageDialog(this, "El codigo '"+codigo+"' ya fue utilizada. Puede eliminar el producto desde la tabla para actualizar el codigo", "Error en el codigo", JOptionPane.ERROR_MESSAGE);
                }
               
            }else{
                JOptionPane.showMessageDialog(this, "Los campos deben tener informacion", "Error", JOptionPane.ERROR_MESSAGE);
            }
            
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Codigo y precio solo reciben valores numericos", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
        jtbGuardar.setEnabled(false);
        jtfCodigo.setText("");
        jtfDescripcion.setText("");
        jtfPrecio.setText("");
        jsStock.setValue(0);
    }//GEN-LAST:event_jtbGuardarActionPerformed

    private void jtbNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbNuevoActionPerformed
        // TODO add your handling code here:
        jtbGuardar.setEnabled(true);
    }//GEN-LAST:event_jtbNuevoActionPerformed

    private void jtbActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbActualizarActionPerformed
        // TODO add your handling code here:
        jtbGuardar.setEnabled(true);
         modeloTabla.getDataVector().removeAllElements();
         modeloTabla.fireTableDataChanged();
         cargarDatos();
    }//GEN-LAST:event_jtbActualizarActionPerformed

    private void jtTablaGestionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jtTablaGestionMouseClicked
        // TODO add your handling code here:
      
    }//GEN-LAST:event_jtTablaGestionMouseClicked

    private void jtbBorrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbBorrarActionPerformed
        // TODO add your handling code here:
        int selectedRow = jtTablaGestion.getSelectedRow();
        int respuesta= JOptionPane.showConfirmDialog(null, "¿Estás seguro de que quieres eliminar este producto?", "Advertencia", JOptionPane.YES_NO_OPTION);
        if (respuesta == JOptionPane.YES_OPTION) {
            if(selectedRow!=-1){
                Long codigo=(Long)jtTablaGestion.getValueAt(selectedRow, 0);
                ViewMenuPrincipal.mapaProductos.remove(codigo);
                modeloTabla.removeRow(selectedRow);
                JOptionPane.showMessageDialog(this, "Producto eliminado", "Operacion exitosa", JOptionPane.INFORMATION_MESSAGE);
            }else{
                  JOptionPane.showMessageDialog(this, "Ninguna fila seleccionada", "Error", JOptionPane.ERROR_MESSAGE);
            }
        } else {
             JOptionPane.showMessageDialog(this, "Operacion cancelada.", "Operacion finalizada", JOptionPane.INFORMATION_MESSAGE);
        }
    }//GEN-LAST:event_jtbBorrarActionPerformed

    private void jtbCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbCerrarActionPerformed
        // TODO add your handling code here:
        dispose();
    }//GEN-LAST:event_jtbCerrarActionPerformed

    private void jtbBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtbBuscarActionPerformed
        // TODO add your handling code here:
        try{
            Long codigo = Long.valueOf(jtfCodigo.getText());
            for (Map.Entry<Long, Producto> entry : ViewMenuPrincipal.mapaProductos.entrySet()) {
                Object key = entry.getKey();
                if(key==codigo){
                    jtfDescripcion.setText(entry.getValue().getDescripcion());
                    jtfPrecio.setText(entry.getValue().getPrecio()+"");
                    jsStock.setValue(entry.getValue().getStock());
                    
                    String categoria = (String) entry.getValue().getRubro();
                    for (int i = 0; i < jcbCategoria.getItemCount(); i++) {
                         if (categoria.equals(categoria)) {
                            jcbCategoria.setSelectedIndex(i);
                            break;
                        }
                    }
                }
            }
        }catch(NumberFormatException e){
            JOptionPane.showMessageDialog(this, "Ningun codigo ingresado", "Error", JOptionPane.ERROR_MESSAGE);
        
        }
    }//GEN-LAST:event_jtbBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable jTable1;
    private javax.swing.JComboBox<String> jcbCategoria;
    private javax.swing.JLabel jlCategoria;
    private javax.swing.JLabel jlNombre;
    private javax.swing.JLabel jlPrecio;
    private javax.swing.JPanel jpAdmin;
    private javax.swing.JSpinner jsStock;
    private javax.swing.JTable jtTablaGestion;
    private javax.swing.JToggleButton jtbActualizar;
    private javax.swing.JToggleButton jtbBorrar;
    private javax.swing.JButton jtbBuscar;
    private javax.swing.JToggleButton jtbCerrar;
    private javax.swing.JToggleButton jtbGuardar;
    private javax.swing.JToggleButton jtbNuevo;
    private javax.swing.JTextField jtfCodigo;
    private javax.swing.JTextField jtfDescripcion;
    private javax.swing.JTextField jtfPrecio;
    // End of variables declaration//GEN-END:variables
    private void cabeceraGestion(){
         this.modeloTabla.addColumn("Codigo");
         this.modeloTabla.addColumn("Descricpion");
         this.modeloTabla.addColumn("Precio");
         this.modeloTabla.addColumn("Categoria");
         this.modeloTabla.addColumn("Stock");
         jtTablaGestion.setModel(modeloTabla);
    }
     private void cargarDatos(){
         for (Map.Entry<Long, Producto> en : ViewMenuPrincipal.mapaProductos.entrySet()) {
             Long key = en.getKey();
             Producto value = en.getValue();
              modeloTabla.addRow(new Object[]{key,value.getDescripcion(),value.getPrecio(),value.getRubro(),value.getStock()});    
         }
     }

}
