package views;

import dao.DepartamentoDao;
import dao.VisitaDao;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import models.Departamento;
import models.Visita;

public class RegistroSalida extends javax.swing.JInternalFrame {

    // Instancias DAO
    private DepartamentoDao departamentoDao;
    private VisitaDao visitaDao;

    // Listados
    List<Visita> visitas;
   
    public RegistroSalida() {
        initComponents();
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
 
        // Variables para cargar combobox desde List
        String numeroDepartamento = "";
        
        //import java.util.Calendar;
        Calendar cal=Calendar.getInstance();
        
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+ ":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        String fechahora=fecha +" : "+hora;
       
        //fecha y hora sistema
        //JOptionPane.showMessageDialog(null, fechahora);
        this.LbFechaHora.setText(fechahora);
        
        //Check apagado visita
        cbSeleccionarVisita.setEnabled(false);
        //Check apagado uso estacionamiento
        txtPatente.setEnabled(false);
        
        // DEPARTAMENTOS
        try {
            departamentoDao = new DepartamentoDao();
            cbSeleccionarDpto.addItem("-");
            List<Departamento> departamentos = departamentoDao.listadoDepartamentos();
            for (int i = 0; i < departamentos.size(); i++) {
                numeroDepartamento = departamentos.get(i).getNumeroDepartamento();
                System.out.println("Número: " + numeroDepartamento);
                cbSeleccionarDpto.addItem(numeroDepartamento);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        // VISITAS
        cbSeleccionarVisita.addItem("-");

    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        btnGuardarVisita = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        cbSeleccionarVisita = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LbFechaHora = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();

        setResizable(true);
        setTitle("REGISTRAR SALIDA");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("ESTACIONAMIENTO DE VISITA PATENTE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        btnGuardarVisita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarVisita.setText("GUARDAR SALIDA");
        btnGuardarVisita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 240, 158, 55));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 240, 158, 55));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECCIONAR NOMBRE VISITA:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 120, -1, -1));

        cbSeleccionarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 120, 360, -1));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("REGISTRO DE SALIDA");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("FECHA Y HORA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(410, 20, -1, -1));

        LbFechaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(LbFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(550, 20, 200, 22));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 50));

        txtPatente.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 160, 130, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECCIONAR NUMERO DEPARTAMENTO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 80, 360, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 820, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVisitaActionPerformed
        boolean guardar = false;
        /*
        String departamento, rut, nombres, apellidos, autorizaresidente, estacionamiento, patente, fecha;
        departamento = (String) cbSeleccionarDpto.getSelectedItem();
        rut = txtRut.getText();
        nombres = txtNombre.getText();
        apellidos = txtApellido.getText();
        estacionamiento = (String) cbSeleccionarEstacionamiento.getSelectedItem();
        patente = txtPatente.getText();
        Calendar calendar = Calendar.getInstance();
        int dia = calendar.get(Calendar.DAY_OF_MONTH);
        int mes = calendar.get(Calendar.MONTH);
        int year = calendar.get(Calendar.YEAR);
        int horas = calendar.get(Calendar.HOUR_OF_DAY);
        int minutos = calendar.get(Calendar.MINUTE);
        int segundos = calendar.get(Calendar.SECOND);
        String hora;
        if (minutos < 10) {
            hora = String.valueOf(horas) + ":0" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
        } else {
            hora = String.valueOf(horas) + ":" + String.valueOf(minutos) + ":" + String.valueOf(segundos);
        }
        fecha = String.valueOf(year) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia) + " " + hora;
        if (chAutorizacionResidente.isSelected()) {
            autorizaresidente = "Autorizado";
        } else {
            autorizaresidente = "";
        }
        // Valida vacios
        if (departamento.isEmpty() || departamento.equals("-") || rut.isEmpty() || nombres.isEmpty() || apellidos.isEmpty() || 
                (chSeleccionarEstacionamientoVisita.isSelected() && (patente.isEmpty() || estacionamiento.equals("-")))) {
            JOptionPane.showMessageDialog(this, "¡Debe completar todos los campos!");
        } else {
            // Metodo validador de rut 
            boolean valida = validarRut(rut);
            if (!valida){
                JOptionPane.showMessageDialog(this, "¡Rut inválido!");
            } else {
                System.out.println("Rut valido ");
                visitaDao = new VisitaDao();
                if (chSeleccionarEstacionamientoVisita.isSelected()) {
                    ingreso = visitaDao.ingresarVisitaEstacionamiento(departamento, autorizaresidente, fecha, rut, nombres, apellidos, estacionamiento, patente);
                } else {
                    ingreso = visitaDao.ingresarVisita(departamento, autorizaresidente, fecha, rut, nombres, apellidos);        
                }
            } 
        }
        if (ingreso) {
            JOptionPane.showMessageDialog(this, "¡Visita ingresada correctamente al Sistema!");
            cbSeleccionarDpto.setSelectedItem("-");
        //     txtRut.setText("");
        //     txtNombre.setText("");
        //     txtApellido.setText("");
         //    chAutorizacionResidente.setSelected(false);
         //    chSeleccionarEstacionamientoVisita.setSelected(false);
         //    txtPatente.setText("");
          //   cbSeleccionarEstacionamiento.setEnabled(false);
          //   cbSeleccionarEstacionamiento.removeAllItems();
            cargarEstacionamientos();
        }*/
    }//GEN-LAST:event_btnGuardarVisitaActionPerformed

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        String nombre, fecha;
        if (actionCommand.equals("comboBoxChanged")) {
            if (!departamento.equals("-")) {
                cbSeleccionarVisita.setEnabled(false);
                cbSeleccionarVisita.removeAllItems();
                try {   
                    visitaDao = new VisitaDao();
                    visitas = visitaDao.listadoRegistroVisitasSalida(departamento);
                    if (visitas.size() > 0) {
                        for (int i = 0; i < visitas.size(); i++) {
                            nombre = visitas.get(i).getNombres() + " " + visitas.get(i).getApellidos();
                            fecha = visitas.get(i).getFechaIngreso();                      
                            System.out.println("Nombre: " + nombre);
                            cbSeleccionarVisita.addItem(fecha + " - " + nombre);
                        }
                        cbSeleccionarVisita.setEnabled(true);
                    } else {
                        cbSeleccionarVisita.addItem("Sin visitas");
                    }
                } catch (Exception e) {
                    System.out.println("Error: " + e);
                }  
            } else {
                cbSeleccionarVisita.setEnabled(false);
                cbSeleccionarVisita.removeAllItems();
                cbSeleccionarVisita.addItem("-");
            }
        }
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed

    private void cbSeleccionarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarVisitaActionPerformed
        String actionCommand = evt.getActionCommand();
        String patente;
        if (actionCommand.equals("comboBoxChanged")) {
            int indexVisita = cbSeleccionarVisita.getSelectedIndex();
            if (indexVisita > -1) {
                String visita = cbSeleccionarVisita.getSelectedItem().toString();
                if (!visita.equals("-") && visitas.size() > 0) {
                    patente = visitas.get(indexVisita).getPatente();
                    if (patente != null) {
                        txtPatente.setText(patente);
                    } else {
                        txtPatente.setText("SIN PATENTE");
                    }
                }
            } else {
                txtPatente.setText("");
            }
        }
    }//GEN-LAST:event_cbSeleccionarVisitaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbFechaHora;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardarVisita;
    private javax.swing.JComboBox<String> cbSeleccionarDpto;
    private javax.swing.JComboBox<String> cbSeleccionarVisita;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtPatente;
    // End of variables declaration//GEN-END:variables
}
