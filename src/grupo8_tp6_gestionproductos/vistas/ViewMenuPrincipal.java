
package grupo8_tp6_gestionproductos.vistas;

import clases.Producto;
import java.awt.Graphics;
import java.awt.Image;
import java.util.TreeMap;
import javax.swing.ImageIcon;


public class ViewMenuPrincipal extends javax.swing.JFrame {
    
    protected static TreeMap <Long,Producto> mapaProductos;

    
    public ViewMenuPrincipal() {
        initComponents();
        setLocationRelativeTo(null);
        mapaProductos = new TreeMap();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ImageIcon icono = new ImageIcon(getClass().getResource("/imagenes/fondo1.jpg"));
        Image mImg = icono.getImage();
        jdPrincipal = new javax.swing.JDesktopPane(){
            public void paintComponent(Graphics g){
                g.drawImage(mImg, 0, 0,getWidth(), getHeight(),this);
            }
        };
        jmbMenu = new javax.swing.JMenuBar();
        jmAdministracion = new javax.swing.JMenu();
        jmConsultas = new javax.swing.JMenu();
        jmiPrecio = new javax.swing.JMenuItem();
        jmiNombre = new javax.swing.JMenuItem();
        jmiRubro = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jdPrincipalLayout = new javax.swing.GroupLayout(jdPrincipal);
        jdPrincipal.setLayout(jdPrincipalLayout);
        jdPrincipalLayout.setHorizontalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 1007, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 700, Short.MAX_VALUE)
        );

        jmbMenu.setPreferredSize(new java.awt.Dimension(120, 50));

        jmAdministracion.setText("Administracion");
        jmAdministracion.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jmAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAdministracionMouseClicked(evt);
            }
        });
        jmbMenu.add(jmAdministracion);

        jmConsultas.setText("  Consultas");
        jmConsultas.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N

        jmiPrecio.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmiPrecio.setText("Por Precio");
        jmiPrecio.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiPrecioActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiPrecio);

        jmiNombre.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmiNombre.setText("Por Nombre");
        jmiNombre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jmiNombreActionPerformed(evt);
            }
        });
        jmConsultas.add(jmiNombre);

        jmiRubro.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        jmiRubro.setText("Por Rubro");
        jmConsultas.add(jmiRubro);

        jmbMenu.add(jmConsultas);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jdPrincipal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAdministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAdministracionMouseClicked
        jdPrincipal.removeAll();
        jdPrincipal.repaint();
       ViewAdministracion internoAdmin = new ViewAdministracion();
       internoAdmin.setVisible(true);
       jdPrincipal.add(internoAdmin);
       jdPrincipal.moveToFront(internoAdmin);
      
    }//GEN-LAST:event_jmAdministracionMouseClicked

    private void jmiPrecioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiPrecioActionPerformed
        // TODO add your handling code here:
       jdPrincipal.removeAll();
       jdPrincipal.repaint();
       ViewPrecio internoPrecio = new ViewPrecio();
       internoPrecio.setVisible(true);
       jdPrincipal.add(internoPrecio);
       jdPrincipal.moveToFront(internoPrecio);
    }//GEN-LAST:event_jmiPrecioActionPerformed

    private void jmiNombreActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jmiNombreActionPerformed
        // TODO add your handling code here:
        jdPrincipal.removeAll();
       jdPrincipal.repaint();
       ViewNombre internoNombre = new ViewNombre();
       internoNombre.setVisible(true);
       jdPrincipal.add(internoNombre);
       jdPrincipal.moveToFront(internoNombre);
    }//GEN-LAST:event_jmiNombreActionPerformed

   
    public static void main(String args[]) {
        
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
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ViewMenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ViewMenuPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jdPrincipal;
    private javax.swing.JMenu jmAdministracion;
    private javax.swing.JMenu jmConsultas;
    private javax.swing.JMenuBar jmbMenu;
    private javax.swing.JMenuItem jmiNombre;
    private javax.swing.JMenuItem jmiPrecio;
    private javax.swing.JMenuItem jmiRubro;
    // End of variables declaration//GEN-END:variables
}
