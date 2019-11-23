package views;
import java.util.Calendar;
import javax.swing.JFrame;
//import java.util.Calendar;
/*
Nomenclatura de variables en general
txt = textfield
cb = combobox
ch = checkbox
btn = button
*/

public class Menu extends javax.swing.JFrame {
    
    RegistroVisita registroVisita;
    RegistroSalida registroSalida;
    ListarVisita listarVisita;
    AsignarEstado asignarEstado;
    ListarEstado listarEstado;
    ReservaSala reservaSala;
    ListarReserva listarReserva;
    RegistroVisitaTESTING registroVisitaTest;
    
    public Menu() {
        //TITULO
        super ("Egiladmin Conserjería: Menú");
        initComponents();
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
        asignarEstado = new AsignarEstado();
        listarEstado = new ListarEstado();
        reservaSala = new ReservaSala();
        listarReserva = new ListarReserva();
        registroVisitaTest = new RegistroVisitaTESTING();        
        // Agregar JInternalFrame a JDesktopPane
        escritorio.add(registroVisita);
        escritorio.add(registroSalida);
        escritorio.add(listarVisita);
        escritorio.add(asignarEstado);
        escritorio.add(listarEstado);
        escritorio.add(reservaSala);
        escritorio.add(listarReserva);
        escritorio.add(registroVisitaTest);
        Calendar cal=Calendar.getInstance();
        
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+ ":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        String fechahora=fecha +" : "+hora;
       
        //fecha y hora sistema
        //JOptionPane.showMessageDialog(null, fechahora);
        
        RegistroVisita rv = new RegistroVisita();
        escritorio.add(rv);
   
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        escritorio = new javax.swing.JDesktopPane();
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
        menutest = new javax.swing.JMenuItem();

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

        javax.swing.GroupLayout escritorioLayout = new javax.swing.GroupLayout(escritorio);
        escritorio.setLayout(escritorioLayout);
        escritorioLayout.setHorizontalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 680, Short.MAX_VALUE)
        );
        escritorioLayout.setVerticalGroup(
            escritorioLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 276, Short.MAX_VALUE)
        );

        MenuListarVisita.setText("REGISTRO VISITAS");

        MenuIngresoVisitas.setText("INGRESO VISITA");
        MenuIngresoVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuIngresoVisitasActionPerformed(evt);
            }
        });
        MenuListarVisita.add(MenuIngresoVisitas);

        MenuSalidaVisita.setText("SALIDA VISITA");
        MenuSalidaVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalidaVisitaActionPerformed(evt);
            }
        });
        MenuListarVisita.add(MenuSalidaVisita);

        MenuListarVisitas.setText("LISTAR VISITAS");
        MenuListarVisitas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarVisitasActionPerformed(evt);
            }
        });
        MenuListarVisita.add(MenuListarVisitas);

        jMenuBar1.add(MenuListarVisita);

        jMenu4.setText("ESTADOS DEPARTAMENTOS");

        MenuAsignarEstadoDpto.setText("ASIGNAR ESTADO DEPARTAMENTO");
        MenuAsignarEstadoDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuAsignarEstadoDptoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuAsignarEstadoDpto);

        MenuListarEstado.setText("LISTAR ESTADO DEPARTAMENTOS");
        MenuListarEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarEstadoActionPerformed(evt);
            }
        });
        jMenu4.add(MenuListarEstado);

        jMenuBar1.add(jMenu4);

        jMenu6.setText("RESERVAS");

        MenuReservaSala.setText("RESERVA SALA DE EVENTOS");
        MenuReservaSala.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuReservaSalaActionPerformed(evt);
            }
        });
        jMenu6.add(MenuReservaSala);

        MenuListarReservas.setText("LISTAR RESERVAS");
        MenuListarReservas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuListarReservasActionPerformed(evt);
            }
        });
        jMenu6.add(MenuListarReservas);

        jMenuBar1.add(jMenu6);

        MenuSalir.setText("SALIR");

        MenuSalirAplicacion.setText("CERRAR APLICACION");
        MenuSalirAplicacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MenuSalirAplicacionActionPerformed(evt);
            }
        });
        MenuSalir.add(MenuSalirAplicacion);

        menutest.setText("jMenuItem1");
        menutest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menutestActionPerformed(evt);
            }
        });
        MenuSalir.add(menutest);

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
        // Abrir informe de Visitas
        escritorio.getDesktopManager().maximizeFrame(asignarEstado);
        asignarEstado.show();
    }//GEN-LAST:event_MenuAsignarEstadoDptoActionPerformed

    private void MenuIngresoVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuIngresoVisitasActionPerformed
        // Maximizar JInternalFrame
       // escritorio.getDesktopManager().maximizeFrame(registroVisita);
        // Mostrar JInternalFrame
        registroVisita.show();   
       
    }//GEN-LAST:event_MenuIngresoVisitasActionPerformed

    private void MenuReservaSalaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuReservaSalaActionPerformed
        escritorio.getDesktopManager().maximizeFrame(reservaSala);
        reservaSala.show();    
    }//GEN-LAST:event_MenuReservaSalaActionPerformed

    private void MenuSalidaVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalidaVisitaActionPerformed
        escritorio.getDesktopManager().maximizeFrame(registroSalida);
        registroSalida.show();
    }//GEN-LAST:event_MenuSalidaVisitaActionPerformed

    private void MenuSalirAplicacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuSalirAplicacionActionPerformed
        System.exit(0);
    }//GEN-LAST:event_MenuSalirAplicacionActionPerformed

    private void MenuListarEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarEstadoActionPerformed
        escritorio.getDesktopManager().maximizeFrame(listarEstado);
        listarEstado.show();
    }//GEN-LAST:event_MenuListarEstadoActionPerformed

    private void MenuListarVisitasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarVisitasActionPerformed
        escritorio.getDesktopManager().maximizeFrame(listarVisita);
        listarVisita.show();
    }//GEN-LAST:event_MenuListarVisitasActionPerformed

    private void MenuListarReservasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_MenuListarReservasActionPerformed
        escritorio.getDesktopManager().maximizeFrame(listarReserva);
        listarReserva.show();
    }//GEN-LAST:event_MenuListarReservasActionPerformed

    private void menutestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menutestActionPerformed
        // TODO add your handling code here:
         escritorio.getDesktopManager().maximizeFrame(registroVisitaTest);
        registroVisitaTest.show();
        
    }//GEN-LAST:event_menutestActionPerformed

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
                if ("Windows".equals(info.getName())) {
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
                new Menu().setVisible(true);
               
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
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JMenuItem menutest;
    // End of variables declaration//GEN-END:variables
}