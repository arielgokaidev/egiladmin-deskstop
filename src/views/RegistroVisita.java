package views;

import dao.DepartamentoDao;
import dao.EstacionamientoVisitaDao;
import dao.ResidenteDao;
import dao.VisitaDao;
import java.awt.Color;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import models.Departamento;
import models.EstacionamientoVisita;
import models.Residente;

public class RegistroVisita extends javax.swing.JInternalFrame {

    // Instancias DAO
    private DepartamentoDao departamentoDao;
    private ResidenteDao residenteDao;
    private EstacionamientoVisitaDao estacionamientoDao;
    private VisitaDao visitaDao;

    // Listados
    List<Residente> residentes;
   
    public RegistroVisita() {
        initComponents();
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
 
        // Variables para cargar combobox desde List
        String numeroDepartamento = "";
        
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
        String fechahora = "FECHA Y HORA: " + fecha + " - "+hora;
        // Fin fecha y hora
        
        //Check apagado residente
        cbSeleccionarResidente.setEnabled(false);
        //Check apagado uso estacionamiento
        cbSeleccionarEstacionamiento.setEnabled(false);
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

    }
 
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        chSeleccionarEstacionamientoVisita = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cbSeleccionarEstacionamiento = new javax.swing.JComboBox<>();
        btnGuardarVisita = new javax.swing.JButton();
        btnCerrar = new javax.swing.JButton();
        chAutorizacionResidente = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cbSeleccionarResidente = new javax.swing.JComboBox<>();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setResizable(true);
        setTitle("REGISTRAR VISITAS");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("INGRESAR PATENTE:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 120, -1, -1));

        chSeleccionarEstacionamientoVisita.setBackground(new java.awt.Color(0, 51, 102));
        chSeleccionarEstacionamientoVisita.setForeground(new java.awt.Color(255, 255, 255));
        chSeleccionarEstacionamientoVisita.setText("USO ESTACIONAMIENTO VISITA");
        chSeleccionarEstacionamientoVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chSeleccionarEstacionamientoVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(chSeleccionarEstacionamientoVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 80, -1, -1));

        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("SELECCIONAR ESTACIONMIENTO VISITA");
        jPanel1.add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 160, -1, -1));

        jPanel1.add(cbSeleccionarEstacionamiento, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 190, 197, -1));

        btnGuardarVisita.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnGuardarVisita.setText("GUARDAR INGRESO");
        btnGuardarVisita.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnGuardarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVisitaActionPerformed(evt);
            }
        });
        jPanel1.add(btnGuardarVisita, new org.netbeans.lib.awtextra.AbsoluteConstraints(490, 350, 158, 55));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 350, 158, 55));

        chAutorizacionResidente.setBackground(new java.awt.Color(0, 51, 102));
        chAutorizacionResidente.setForeground(new java.awt.Color(255, 255, 255));
        chAutorizacionResidente.setText("INGRESO AUTORIZADO POR RESIDENTE:");
        chAutorizacionResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chAutorizacionResidenteActionPerformed(evt);
            }
        });
        jPanel1.add(chAutorizacionResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 220, -1, -1));

        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("SELECCIONAR RESIDENTE:");
        jPanel1.add(jLabel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 260, -1, -1));

        cbSeleccionarResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarResidenteActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 238, -1));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("INGRESO DE VISITAS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        txtPatente.setBackground(new java.awt.Color(204, 204, 204));
        txtPatente.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txtPatenteKeyTyped(evt);
            }
        });
        jPanel1.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 140, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECCIONAR NUMERO DEPARTAMENTO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, 20));

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 250, -1));

        txtRut.setBackground(new java.awt.Color(204, 204, 204));
        txtRut.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        jPanel1.add(txtRut, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 110, 157, -1));

        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("INGRESE RUT:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 101, 20));

        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("INGRESE NOMBRES:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 140, 120, 20));

        txtNombre.setBackground(new java.awt.Color(204, 204, 204));
        txtNombre.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtNombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 140, 157, -1));

        txtApellido.setBackground(new java.awt.Color(204, 204, 204));
        txtApellido.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jPanel1.add(txtApellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 170, 157, -1));

        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("INGRESAR APELLIDOS:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 200, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 890, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // Checkbox para seleccionar estacionamiento
    private void chSeleccionarEstacionamientoVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chSeleccionarEstacionamientoVisitaActionPerformed
        if (chSeleccionarEstacionamientoVisita.isSelected()){
            cbSeleccionarEstacionamiento.setEnabled(true);
            txtPatente.setEnabled(true);
        } else {
            cbSeleccionarEstacionamiento.setEnabled(false);
            txtPatente.setEnabled(false);
        }        
    }//GEN-LAST:event_chSeleccionarEstacionamientoVisitaActionPerformed
    // Botón cerrar
    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed
    // Botón guardar
    private void btnGuardarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVisitaActionPerformed
        boolean ingreso = false;
        String departamento, rut, nombres, apellidos, autorizaresidente, estacionamiento, patente, fecha;
        // Obtener datos del formulario
        departamento = (String) cbSeleccionarDpto.getSelectedItem();
        rut = txtRut.getText();
        nombres = txtNombre.getText();
        apellidos = txtApellido.getText();
        estacionamiento = (String) cbSeleccionarEstacionamiento.getSelectedItem();
        patente = txtPatente.getText().toUpperCase();
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
        fecha = String.valueOf(year) + "-" + String.valueOf(mes) + "-" + String.valueOf(dia) + " " + hora;
        System.out.println(fecha);
        // Autorización
        if (chAutorizacionResidente.isSelected()) {
            autorizaresidente = "Residente";
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
                System.out.println("Rut valido");
                // Instancia visitaDao
                visitaDao = new VisitaDao();
                // Método para ingresar, condicional estacionamiento
                if (chSeleccionarEstacionamientoVisita.isSelected()) {
                    ingreso = visitaDao.ingresarVisitaEstacionamiento(departamento, autorizaresidente, fecha, rut, nombres, apellidos, estacionamiento, patente);
                } else {
                    ingreso = visitaDao.ingresarVisita(departamento, autorizaresidente, fecha, rut, nombres, apellidos);        
                }
                // Acciones después de ingresar
                if (ingreso) {
                    Menu.getListarVisita().recargarTabla();
                    JOptionPane.showMessageDialog(this, "¡Visita ingresada correctamente al Sistema!");
                    cbSeleccionarDpto.setSelectedItem("-");
                    txtRut.setText("");
                    txtNombre.setText("");
                    txtApellido.setText("");
                    chAutorizacionResidente.setSelected(false);
                    chSeleccionarEstacionamientoVisita.setSelected(false);
                    txtPatente.setText("");
                    cbSeleccionarEstacionamiento.setEnabled(false);
                    cargarEstacionamientos();
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
                }
            } 
        }
    }//GEN-LAST:event_btnGuardarVisitaActionPerformed

    private void chAutorizacionResidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chAutorizacionResidenteActionPerformed
        String departamento = "";
        txtRut.setText("");
        txtNombre.setText("");
        txtApellido.setText("");
        if (chAutorizacionResidente.isSelected()) {
            txtRut.setEnabled(false);
            txtNombre.setEnabled(false);
            txtApellido.setEnabled(false);
            departamento = cbSeleccionarDpto.getSelectedItem().toString();
            cargarResidentes(departamento);
            cbSeleccionarResidente.setEnabled(true);
        } else {
            cbSeleccionarResidente.setEnabled(false);
            txtRut.setEnabled(true);
            txtNombre.setEnabled(true);
            txtApellido.setEnabled(true);
        }
    }//GEN-LAST:event_chAutorizacionResidenteActionPerformed

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged") && !departamento.equals("-") && chAutorizacionResidente.isSelected()) {
            cargarResidentes(departamento);
        } else {
            cbSeleccionarResidente.removeAllItems();
            cbSeleccionarResidente.addItem("-");
        }
        if (actionCommand.equals("comboBoxChanged") && !departamento.equals("-")) {
            cargarEstacionamientos();
        }
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed

    private void cbSeleccionarResidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarResidenteActionPerformed
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged") && chAutorizacionResidente.isSelected()) {
            if (!departamento.equals("-")) {
                int indexResidente = cbSeleccionarResidente.getSelectedIndex();
                if (indexResidente > -1) {
                    txtRut.setBackground(Color.white);
                    txtNombre.setBackground(Color.white);
                    txtApellido.setBackground(Color.white);
                    if (residentes.size() > 0) {
                        txtRut.setText(residentes.get(indexResidente).getRut());
                        txtNombre.setText(residentes.get(indexResidente).getNombres());
                        txtApellido.setText(residentes.get(indexResidente).getApellidos());
                    } else {
                        txtRut.setText("");
                        txtNombre.setText("");
                        txtApellido.setText("");
                    }
                }
            } else {
                txtRut.setText("");
                txtNombre.setText("");
                txtApellido.setText("");
            }
        }
    }//GEN-LAST:event_cbSeleccionarResidenteActionPerformed

    private void txtPatenteKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtPatenteKeyTyped
        if (txtPatente.getText().length() >= 6) {
            evt.consume();
        }
    }//GEN-LAST:event_txtPatenteKeyTyped
    
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
                        System.out.println("Nombre: " + nombre);
                        cbSeleccionarResidente.addItem(nombre);
                    }
                } else {
                    cbSeleccionarResidente.addItem("Sin residentes");
                    txtRut.setText("");
                    txtNombre.setText("");
                    txtApellido.setText("");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        } else {
            cbSeleccionarResidente.addItem("-");
        }
    }
    
    public void cargarEstacionamientos() {
        String numeroEstacionamiento;
        cbSeleccionarEstacionamiento.removeAllItems();
        try {   
            estacionamientoDao = new EstacionamientoVisitaDao();
            List<EstacionamientoVisita> estacionamientos = estacionamientoDao.listadoEstacionamientos();
            if (estacionamientos.size() > 0) {
                for (int i = 0; i < estacionamientos.size(); i++) {
                    numeroEstacionamiento = String.valueOf(estacionamientos.get(i).getNumero());
                    System.out.println("Número: " + numeroEstacionamiento);
                    cbSeleccionarEstacionamiento.addItem(numeroEstacionamiento);
                }
            } else {
                cbSeleccionarEstacionamiento.addItem("-");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            rut = rut.replace("-", "");
            int rutAux = Integer.parseInt(rut.substring(0, rut.length() - 1));

            char dv = rut.charAt(rut.length() - 1);

            int m = 0, s = 1;
            for (; rutAux != 0; rutAux /= 10) {
                s = (s + rutAux % 10 * (9 - m++ % 6)) % 11;
            }
            if (dv == (char) (s != 0 ? s + 47 : 75)) {
                validacion = true;
            }
        } catch (java.lang.NumberFormatException e) {
            
        } catch (Exception e) {
            
        }
        return validacion;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnGuardarVisita;
    private javax.swing.JComboBox<String> cbSeleccionarDpto;
    private javax.swing.JComboBox<String> cbSeleccionarEstacionamiento;
    private javax.swing.JComboBox<String> cbSeleccionarResidente;
    private javax.swing.JCheckBox chAutorizacionResidente;
    private javax.swing.JCheckBox chSeleccionarEstacionamientoVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
