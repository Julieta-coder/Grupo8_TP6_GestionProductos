
package grupo8_tp6_gestionproductos.vistas;

import grupo8_tp6_gestionproductos.Producto;
import java.util.TreeMap;


public class MenuPrincipal extends javax.swing.JFrame {
    
    protected static TreeMap<Long,Producto> mapaProductos;

    
    public MenuPrincipal() {
        initComponents();
        
        mapaProductos = new TreeMap();
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jdPrincipal = new javax.swing.JDesktopPane();
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
            .addGap(0, 478, Short.MAX_VALUE)
        );
        jdPrincipalLayout.setVerticalGroup(
            jdPrincipalLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 298, Short.MAX_VALUE)
        );

        jmbMenu.setPreferredSize(new java.awt.Dimension(120, 50));

        jmAdministracion.setText("Administracion");
        jmAdministracion.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jmAdministracionMouseClicked(evt);
            }
        });
        jmbMenu.add(jmAdministracion);

        jmConsultas.setText("Consultas");

        jmiPrecio.setText("Precio");
        jmConsultas.add(jmiPrecio);

        jmiNombre.setText("Nombre");
        jmConsultas.add(jmiNombre);

        jmiRubro.setText("Rubro");
        jmConsultas.add(jmiRubro);

        jmbMenu.add(jmConsultas);

        setJMenuBar(jmbMenu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jdPrincipal)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jmAdministracionMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jmAdministracionMouseClicked
       Administracion interno = new Administracion();
       interno.setVisible(true);
       jdPrincipal.add(interno);
      
    }//GEN-LAST:event_jmAdministracionMouseClicked

   
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
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MenuPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MenuPrincipal().setVisible(true);
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
