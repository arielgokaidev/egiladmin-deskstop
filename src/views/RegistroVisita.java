/*
Se debe agregar validacion y carga de datos cuando un rut ya exista en la tabla de visitas

*/

package views;

import dao.DepartamentoDao;
import dao.EstacionamientoVisitaDao;
import dao.ResidenteDao;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import models.Departamento;
import models.EstacionamientoVisita;
import models.Residente;

public class RegistroVisita extends javax.swing.JInternalFrame {

   private String rut,nombre,apellido,seleccionardpto,seleccionarestacionamiento,seleccionarresidente,usoestacionamientovisita,autorizaresidente;
   
   private DepartamentoDao departamentoDao;
   private ResidenteDao residenteDao;
   private EstacionamientoVisitaDao estacionamientoDao;
   
    public RegistroVisita() {
        initComponents();
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
 
        // Variables para cargar combobox desde List
        String numeroDepartamento = "";
        String nombre = "";
        String numero = "";
        
        //import java.util.Calendar;
        Calendar cal=Calendar.getInstance();
        
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+ ":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        String fechahora=fecha +" : "+hora;
       
        //fecha y hora sistema
        //JOptionPane.showMessageDialog(null, fechahora);
        this.LbFechaHora.setText(fechahora);
        
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
        
        // ESTACIONAMIENTOS
        try {   
            estacionamientoDao = new EstacionamientoVisitaDao();
            cbSeleccionarEstacionamiento.addItem("-");
            List<EstacionamientoVisita> estacionamientos = estacionamientoDao.listadoEstacionamientos();
            for (int i = 0; i < estacionamientos.size(); i++) {
                numero = String.valueOf(estacionamientos.get(i).getNumero());
                System.out.println("Número: " + numero);
                cbSeleccionarEstacionamiento.addItem(numero);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }

        // RESIDENTES
        /*
        try {   
            residenteDao = new ResidenteDao();
            cbSeleccionarResidente.addItem("Seleccionar Residente");
            List<Residente> residentes = residenteDao.listadoResidentes();
            for (int i = 0; i < residentes.size(); i++) {
                nombre = residentes.get(i).getNombres() + " " + residentes.get(i).getApellidos();
                System.out.println("Nombre: " + nombre);
                cbSeleccionarResidente.addItem(nombre);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }*/
        
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
        jLabel8 = new javax.swing.JLabel();
        LbFechaHora = new javax.swing.JLabel();
        txtPatente = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtApellido = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
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

        cbSeleccionarEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarEstacionamientoActionPerformed(evt);
            }
        });
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

        jPanel1.add(cbSeleccionarResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 260, 238, -1));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("INGRESO DE VISITAS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("FECHA Y HORA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 15, -1, -1));

        LbFechaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(LbFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 11, 200, 22));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        txtPatente.setBackground(new java.awt.Color(204, 204, 204));
        jPanel1.add(txtPatente, new org.netbeans.lib.awtextra.AbsoluteConstraints(710, 120, 140, -1));

        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("SELECCIONAR NUMERO DEPARTAMENTO:");
        jPanel1.add(jLabel5, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(270, 80, 250, -1));

        txtRut.setBackground(new java.awt.Color(204, 204, 204));
        txtRut.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });
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
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, 130, 20));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-10, 0, 890, 590));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSeleccionarEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarEstacionamientoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbSeleccionarEstacionamientoActionPerformed

    private void chSeleccionarEstacionamientoVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chSeleccionarEstacionamientoVisitaActionPerformed
        // TODO add your handling code here:
         if(chSeleccionarEstacionamientoVisita.isSelected()){
            cbSeleccionarEstacionamiento.setEnabled(true);
            txtPatente.setEnabled(true);
        }else{
            cbSeleccionarEstacionamiento.setEnabled(false);
            txtPatente.setEnabled(false);
        }
        
    }//GEN-LAST:event_chSeleccionarEstacionamientoVisitaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void btnGuardarVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarVisitaActionPerformed
        // TODO add your handling code here:
        //rut,nombre,apellido,seleccionardpto,seleccionarestacionamiento,seleccionarresidente,usoestacionamientovisita,autorizaresidente;
        rut = txtRut.getText();
        nombre = txtNombre.getText();
        apellido = txtApellido.getText();
        String selectdpto = (String)cbSeleccionarDpto.getSelectedItem();
        String selectest = (String)cbSeleccionarEstacionamiento.getSelectedItem();
        // Valida vacios
       // if(rut.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || selectdpto.isEmpty()|| selectest.isEmpty()){
        if (rut.isEmpty() || nombre.isEmpty() || apellido.isEmpty() || selectdpto.isEmpty()){  
            JOptionPane.showMessageDialog(this, "Debe completar todos los campos");
        } else {
            //Metodo validador de rut 
            boolean valida = validarRut(rut);
            if (!valida){
                    JOptionPane.showMessageDialog(this, "Rut invalido");
                } else {
                    JOptionPane.showMessageDialog(this, "Visita Ingresada Correctamente al Sistema");
                    System.out.println("lista deptos " + selectdpto);
            } 
        }
    }//GEN-LAST:event_btnGuardarVisitaActionPerformed

    private void chAutorizacionResidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chAutorizacionResidenteActionPerformed
        String departamento = "";
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

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        System.out.println(evt.getActionCommand());
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        System.out.println(chAutorizacionResidente.isSelected());
        if (actionCommand.equals("comboBoxChanged") && !departamento.equals("-") && chAutorizacionResidente.isSelected()) {
            cargarResidentes(departamento);
        }
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed
    
    public void cargarResidentes(String departamento) {
        cbSeleccionarResidente.removeAllItems();
        if (!departamento.equals("-")) {
            try {   
                residenteDao = new ResidenteDao(); 
                List<Residente> residentes = residenteDao.listadoResidentesDepartamento(departamento);
                if (residentes.size() > 0) {
                    for (int i = 0; i < residentes.size(); i++) {
                        nombre = residentes.get(i).getNombres() + " " + residentes.get(i).getApellidos();
                        System.out.println("Nombre: " + nombre);
                        cbSeleccionarResidente.addItem(nombre);
                    }
                } else {
                    cbSeleccionarResidente.addItem("Sin residentes");
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }
    
    public static boolean validarRut(String rut) {
        boolean validacion = false;
        try {
            rut =  rut.toUpperCase();
            //rut = rut.replace(".", "");
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
    private javax.swing.JLabel LbFechaHora;
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
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtPatente;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
