package views;

import dao.DepartamentoDao;
import dao.EstadoDao;
import dao.ResidenteDao;
import dao.TipoEstadoDao;
import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import models.Departamento;
import models.Residente;
import models.TipoEstado;

public class AsignarEstado extends javax.swing.JInternalFrame {
    
    // Instancias DAO
    private DepartamentoDao departamentoDao;
    private TipoEstadoDao tipoEstadoDao;
    private ResidenteDao residenteDao;
    private EstadoDao estadoDao;
   
    private String rutUsuario;
   
    // Listados
    List<Residente> residentes;
    List<TipoEstado> tipoEstados;
    
    public AsignarEstado(String rutUsuario) {
        initComponents();
        
        this.rutUsuario = rutUsuario;
        
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        
        // Variables para cargar combobox desde List
        String numeroDepartamento = "";
        String nombreEstado = "";
        /*
        // Fecha y hora
        Calendar cal = Calendar.getInstance();
        String fecha;
        String hora;
        int dia = cal.get(Calendar.DAY_OF_MONTH);
        int meses = cal.get(cal.MONTH) + 1;
        if (dia < 10) {
            fecha = "0" + dia + "/" + meses + "/"+cal.get(cal.YEAR);
        } else {
            fecha = dia + "/" + meses + "/" + cal.get(cal.YEAR);
        }
        int horas = cal.get(cal.HOUR_OF_DAY); 
        if (horas < 10) {
            hora = "0" + horas;
        } else {
            hora = String.valueOf(horas);
        }
        int minutos = cal.get(cal.MINUTE);
        if (minutos < 10) {
            hora += ":0" + minutos;
        } else {
            hora += ":" + String.valueOf(minutos);
        }      
        String fechahora = "FECHA Y HORA: " + fecha + " - "+ hora;
        // Fin fecha y hora
        */
        //check de observacion desabilitado
        txtAreaObservacion.setBackground(Color.darkGray);
        txtAreaObservacion.setEnabled(false);
         
        // DEPARTAMENTOS
        try {
            departamentoDao = new DepartamentoDao();
            cbSeleccionarDpto.addItem("-");
            List<Departamento> departamentos = departamentoDao.listadoDepartamentos();
            for (int i = 0; i < departamentos.size(); i++) {
                numeroDepartamento = departamentos.get(i).getNumeroDepartamento();
                //System.out.println("Número: " + numeroDepartamento);
                cbSeleccionarDpto.addItem(numeroDepartamento);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        // TIPO ESTADOS
        try {
            tipoEstadoDao = new TipoEstadoDao();
            tipoEstados = tipoEstadoDao.listadoTipoEstados();
            for (int i = 0; i < tipoEstados.size(); i++) {
                nombreEstado = tipoEstados.get(i).getNombreEstado();
                //System.out.println("Nombre estado: " + nombreEstado);
                cbSeleccionarEstadoDpto.addItem(nombreEstado);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        cbSeleccionarResidente = new javax.swing.JComboBox<>();
        cbSeleccionarEstadoDpto = new javax.swing.JComboBox<>();
        chRestriccion = new javax.swing.JCheckBox();
        btnCerrar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaObservacion = new javax.swing.JTextArea();
        chObservacion = new javax.swing.JCheckBox();

        setResizable(true);
        setTitle("ASIGNAR ESTADO DEPARTAMENTOS");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 100, 238, -1));

        jPanel1.add(cbSeleccionarResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 180, 238, -1));

        jPanel1.add(cbSeleccionarEstadoDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 100, 238, -1));

        chRestriccion.setBackground(new java.awt.Color(0, 51, 102));
        chRestriccion.setForeground(new java.awt.Color(255, 255, 255));
        chRestriccion.setText("RESTRICCION USO ESPACIOS COMUNES");
        jPanel1.add(chRestriccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 180, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 280, 158, 55));

        btnGuardar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardar.setText("GUARDAR ESTADO");
        btnGuardar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(320, 280, 158, 55));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ASIGNACIÓN DE ESTADOS A DEPARTAMENTOS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECCIONAR TIPO ESTADO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 80, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECCIONAR DEPARTAMENTO:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SELECCIONAR RESIDENTE:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 160, -1, -1));

        txtAreaObservacion.setBackground(new java.awt.Color(102, 102, 102));
        txtAreaObservacion.setColumns(20);
        txtAreaObservacion.setRows(5);
        txtAreaObservacion.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 102, 0)));
        jScrollPane1.setViewportView(txtAreaObservacion);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 170, 310, 190));

        chObservacion.setBackground(new java.awt.Color(0, 51, 102));
        chObservacion.setForeground(new java.awt.Color(255, 255, 255));
        chObservacion.setText("AGREGAR OBSERVACIÓN");
        chObservacion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chObservacionActionPerformed(evt);
            }
        });
        jPanel1.add(chObservacion, new org.netbeans.lib.awtextra.AbsoluteConstraints(570, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 373, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged") && !departamento.equals("-")) {
            cargarResidentes(departamento);
        } else {
            cbSeleccionarResidente.removeAllItems();
            cbSeleccionarResidente.addItem("-");
        }
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);        
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void chObservacionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chObservacionActionPerformed
        if (chObservacion.isSelected()) {
            txtAreaObservacion.setEnabled(true);
            txtAreaObservacion.setBackground(Color.WHITE);
        } else {
            txtAreaObservacion.setEnabled(false);
            txtAreaObservacion.setBackground(Color.darkGray);
        }
    }//GEN-LAST:event_chObservacionActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        //System.out.println(rutUsuario);
        boolean ingreso = false;
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        String residente = cbSeleccionarResidente.getSelectedItem().toString();
        int indexEstado = cbSeleccionarEstadoDpto.getSelectedIndex();
        int estado = tipoEstados.get(indexEstado).getId();
        String restriccion = "Restriccion uso espacios comunes";
        String observacion = txtAreaObservacion.getText().trim();
        if (rutUsuario == null || departamento.equals("-") || (chObservacion.isSelected() && observacion.isEmpty())) {
            JOptionPane.showMessageDialog(null, "¡Debe completar los campos!");
        } else if (residente.equals("Sin residentes")) {
            JOptionPane.showMessageDialog(null, "¡Departamento sin residentes!\nNo es posible guardar el estado");
        } else {
            // Fecha
            Calendar calendar = Calendar.getInstance();
            int dia = calendar.get(Calendar.DAY_OF_MONTH);
            int mes = calendar.get(Calendar.MONTH) + 1;
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
            String fecha = String.valueOf(year) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia) + " " + hora;
            //System.out.println(fecha);
            if (!chRestriccion.isSelected()) {
                restriccion = "";
            }
            estadoDao = new EstadoDao();
            ingreso = estadoDao.ingresarEstado(rutUsuario, departamento, estado, fecha, observacion, restriccion);
            if (ingreso) {
                Menu.getListarEstado().setDepartamentosTodos();
                cbSeleccionarDpto.setSelectedItem("-");
                chRestriccion.setSelected(false);
                chObservacion.setSelected(false);
                txtAreaObservacion.setText("");
                JOptionPane.showMessageDialog(this, "¡Estado de departamento registrado correctamente!");
            } else {
                JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
            }
        }
    }//GEN-LAST:event_btnGuardarActionPerformed
    
    public void cargarResidentes(String departamento) {
        String nombre;
        cbSeleccionarResidente.removeAllItems();
        if (!departamento.equals("-")) {
            try {   
                residenteDao = new ResidenteDao(); 
                residentes = residenteDao.listadoResidentesDepartamento(departamento);
                if (residentes.size() > 0) {
                    for (int i = 0; i < residentes.size(); i++) {
                        nombre = residentes.get(i).getNombres() + " " + residentes.get(i).getApellidos();
                        //System.out.println("Nombre: " + nombre);
                        cbSeleccionarResidente.addItem(nombre);
                    }
                } else {
                    cbSeleccionarResidente.addItem("Sin residentes");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            cbSeleccionarResidente.addItem("-");
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JComboBox<String> cbSeleccionarDpto;
    private javax.swing.JComboBox<String> cbSeleccionarEstadoDpto;
    private javax.swing.JComboBox<String> cbSeleccionarResidente;
    private javax.swing.JCheckBox chObservacion;
    private javax.swing.JCheckBox chRestriccion;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea txtAreaObservacion;
    // End of variables declaration//GEN-END:variables
}
