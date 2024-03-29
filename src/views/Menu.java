package views;

import java.awt.Dimension;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/*
Nomenclatura de variables en general
txt = textfield
cb = combobox
ch = checkbox
btn = button
*/

public class Menu extends javax.swing.JFrame {
    
    private RegistroVisita registroVisita;
    private RegistroSalida registroSalida;
    private static ListarVisita listarVisita;
    private AsignarEstado asignarEstado;
    private static ListarEstado listarEstado;
    private ReservaSala reservaSala;
    private static ListarReserva listarReserva;
    
    private static String rutUsuario;
    
    public Menu(String rutUsuario) {
        //TITULO
        super("Egiladmin Conserjería: Menú");
        initComponents();
        
        this.rutUsuario = rutUsuario;
        
        //MAXIMIZA LA VENTANA
        setExtendedState(java.awt.Frame.MAXIMIZED_BOTH);
        //CENTRA VENTANA
        this.setLocationRelativeTo(null);
        //CERRAR VENTANA JDESKTOP PANE
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Cargar instancias JInternalFrame
        registroVisita = new RegistroVisita();
        registroSalida = new RegistroSalida();
        listarVisita = new ListarVisita();
        asignarEstado = new AsignarEstado(rutUsuario);
        listarEstado = new ListarEstado();
        reservaSala = new ReservaSala(rutUsuario);
        listarReserva = new ListarReserva();
        
        // Agregar JInternalFrame a JDesktopPane
        escritorio.add(registroVisita);    
        escritorio.add(registroSalida);
        escritorio.add(listarVisita);
        escritorio.add(asignarEstado);
        escritorio.add(listarEstado);
        escritorio.add(reservaSala);
        escritorio.add(listarReserva);

    }
    
    public static ListarVisita getListarVisita() {
        return listarVisita;
    }
    
    public static ListarEstado getListarEstado() {
        return listarEstado;
    }

    public static ListarReserva getListarReserva() {
        return listarReserva;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        escritorio = new javax.swing.JDesktopPane();
        jPanel1 = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        MenuListarVisita = new javax.swing.JMenu();
        MenuIngresoVisitas = new javax.swing.JMenuItem();
        MenuSalidaVisita = new javax.swing.JMenuItem();
        MenuListarVisitas = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        MenuAsignarEstadoDpto = new javax.swing.JMenuItem();
        MenuListarEstado = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        MenuReservaSala = new javax.swing.JMenuItem();
        MenuListarReservas = new javax.swing.JMenuItem();
        MenuSalir = new javax.swing.JMenu();
        MenuSalirAplicacion = new javax.swing.JMenuItem();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMaximumSize(new java.awt.Dimension(600, 600));
        setMinimumSize(new java.awt.Dimension(1, 1));
        setPreferredSize(new java.awt.Dimension(680, 680));
        setSize(new java.awt.Dimension(0, 0));

        jPanel1.setBackground(new java.awt.Color(0, 102, 153));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        escritorio.setLayer(jPanel1, javax.swing.JLayeredPane.DEFAULT_LAYER);

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jMenuBar1.setBackground(new java.awt.Color(204, 204, 204));
        jMenuBar1.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jMenuBar1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N

        MenuListarVisita.setBackground(new java.awt.Color(255, 255, 204));
        MenuListarVisita.setText("REGISTRO VISITAS");
        MenuListarVisita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuIngresoVisitas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuIngresoVisitas.setText("INGRESO VISITA");
        MenuIngresoVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresoVisitasActionPerformed(evt);
            }
        });
        MenuListarVisita.add(MenuIngresoVisitas);

        MenuSalidaVisita.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuSalidaVisita.setText("SALIDA VISITA");
        MenuSalidaVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalidaVisitaActionPerformed(evt);
            }
        });
        MenuListarVisita.add(MenuSalidaVisita);

        MenuListarVisitas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuListarVisitas.setText("LISTAR VISITAS");
        MenuListarVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarVisitasActionPerformed(evt);
            }
        });
        MenuListarVisita.add(MenuListarVisitas);

        jMenuBar1.add(MenuListarVisita);

        jMenu4.setText("ESTADOS DEPARTAMENTOS");
        jMenu4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuAsignarEstadoDpto.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuAsignarEstadoDpto.setText("ASIGNAR ESTADO DEPARTAMENTO");
        MenuAsignarEstadoDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAsignarEstadoDptoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuAsignarEstadoDpto);

        MenuListarEstado.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuListarEstado.setText("LISTAR ESTADO DEPARTAMENTOS");
        MenuListarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEstadoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuListarEstado);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("RESERVAS");
        jMenu6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuReservaSala.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuReservaSala.setText("RESERVA SALA DE EVENTOS");
        MenuReservaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservaSalaActionPerformed(evt);
            }
        });
        jMenu6.add(MenuReservaSala);

        MenuListarReservas.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuListarReservas.setText("LISTAR RESERVAS");
        MenuListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarReservasActionPerformed(evt);
            }
        });
        jMenu6.add(MenuListarReservas);

        jMenuBar1.add(jMenu6);

        MenuSalir.setText("SALIR");
        MenuSalir.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N

        MenuSalirAplicacion.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        MenuSalirAplicacion.setText("CERRAR APLICACION");
        MenuSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirAplicacionActionPerformed(evt);
            }
        });
        MenuSalir.add(MenuSalirAplicacion);

        jMenuBar1.add(MenuSalir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(escritorio)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void MenuAsignarEstadoDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuAsignarEstadoDptoActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = asignarEstado.getSize();
        asignarEstado.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        asignarEstado.show();
    }//GEN-LAST:event_MenuAsignarEstadoDptoActionPerformed

    private void MenuIngresoVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngresoVisitasActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = registroVisita.getSize();
        registroVisita.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        registroVisita.show();      
    }//GEN-LAST:event_MenuIngresoVisitasActionPerformed

    private void MenuReservaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservaSalaActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = reservaSala.getSize();
        reservaSala.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        reservaSala.show();       
    }//GEN-LAST:event_MenuReservaSalaActionPerformed

    private void MenuSalidaVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalidaVisitaActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = registroSalida.getSize();
        registroSalida.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        registroSalida.show();
    }//GEN-LAST:event_MenuSalidaVisitaActionPerformed

    private void MenuSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirAplicacionActionPerformed
        //0 si
        //1 no
        // Validación para cerrar la aplicacion
        String mensaje = "¿ESTA SEGURO DESEA SALIR? RECUERDE GUARDAR LOS CAMBIOS AL SALIR.";
        int salir = JOptionPane.showConfirmDialog(null, mensaje, "¡ATENCIÓN!", JOptionPane.YES_NO_OPTION);
        if (salir == 0){
            System.exit(0);
        }
    }//GEN-LAST:event_MenuSalirAplicacionActionPerformed

    private void MenuListarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEstadoActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = listarEstado.getSize();
        listarEstado.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        listarEstado.show();     
    }//GEN-LAST:event_MenuListarEstadoActionPerformed

    private void MenuListarVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarVisitasActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = listarVisita.getSize();
        listarVisita.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        listarVisita.show();
    }//GEN-LAST:event_MenuListarVisitasActionPerformed

    private void MenuListarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarReservasActionPerformed
        Dimension desktopSize = escritorio.getSize();
        Dimension frameSize = listarReserva.getSize();
        listarReserva.setLocation((desktopSize.width - frameSize.width)/2, (desktopSize.height- frameSize.height)/2);
        listarReserva.show();
    }//GEN-LAST:event_MenuListarReservasActionPerformed

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
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Menu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
           
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
          
            public void run() {
                rutUsuario = "19604018-8";
                new Menu(rutUsuario).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem MenuAsignarEstadoDpto;
    private javax.swing.JMenuItem MenuIngresoVisitas;
    private javax.swing.JMenuItem MenuListarEstado;
    private javax.swing.JMenuItem MenuListarReservas;
    private javax.swing.JMenu MenuListarVisita;
    private javax.swing.JMenuItem MenuListarVisitas;
    private javax.swing.JMenuItem MenuReservaSala;
    private javax.swing.JMenuItem MenuSalidaVisita;
    private javax.swing.JMenu MenuSalir;
    private javax.swing.JMenuItem MenuSalirAplicacion;
    private javax.swing.JDesktopPane escritorio;
    private javax.swing.JList<String> jList1;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
