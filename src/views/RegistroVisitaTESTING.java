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

public class RegistroVisitaTESTING extends javax.swing.JInternalFrame {

   private String rut,nombre,apellido,seleccionardpto,seleccionarestacionamiento,seleccionarresidente,usoestacionamientovisita,autorizaresidente;
   
   private DepartamentoDao departamentoDao;
   private ResidenteDao residenteDao;
   private EstacionamientoVisitaDao estacionamientoDao;
   
    public RegistroVisitaTESTING() {
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
        
        // DEPARTAMENTOS
        try {
            departamentoDao = new DepartamentoDao();

            //cbSelecionarDpto.addItem("");

            cbSeleccionarDpto.addItem("Seleccione un departamento");

            List<Departamento> departamentos = departamentoDao.listadoDepartamentos();
            for (int i = 0; i < departamentos.size(); i++) {
                //numeroDepartamento = departamentos.get(i).getNumero();
                System.out.println("Número: " + numeroDepartamento);
                cbSeleccionarDpto.addItem(numeroDepartamento);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        // ESTACIONAMIENTOS
        try {   
            estacionamientoDao = new EstacionamientoVisitaDao();
            cbSeleccionarEstacionamiento.addItem("Seleccione un número");
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
        try {   
            residenteDao = new ResidenteDao();
            cbSeleccionarResidente.addItem("Seleccione un residente");
            List<Residente> residentes = residenteDao.listadoResidentes();
            for (int i = 0; i < residentes.size(); i++) {
                nombre = residentes.get(i).getNombres() + " " + residentes.get(i).getApellidos();
                System.out.println("Nombre: " + nombre);
                cbSeleccionarResidente.addItem(nombre);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        LbFechaHora = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        chSeleccionarEstacionamientoVisita = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        cbSeleccionarEstacionamiento = new javax.swing.JComboBox<>();
        chAutorizacionResidente = new javax.swing.JCheckBox();
        jLabel7 = new javax.swing.JLabel();
        cbSeleccionarResidente = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        btnGuardarVisita = new javax.swing.JButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRAR VISITAS");
        getContentPane().setLayout(null);

        LbFechaHora.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LbFechaHoraAncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        LbFechaHora.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbFechaHoraMouseClicked(evt);
            }
        });
        getContentPane().add(LbFechaHora);
        LbFechaHora.setBounds(48, 459, 238, 23);

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));

        jLabel5.setText("SELECCIONAR NUMERO DEPARTAMENTO");

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE RUT");

        jLabel1.setText("INGRESE NOMBRE");

        jLabel3.setText("INGRESAR APELLIDO");

        jLabel4.setText("INGRESE RUT SIN PUNTOS NI GUION");

        chSeleccionarEstacionamientoVisita.setText("USO ESTACIONAMIENTO VISITA");
        chSeleccionarEstacionamientoVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chSeleccionarEstacionamientoVisitaActionPerformed(evt);
            }
        });

        jLabel6.setText("SELECCIONAR ESTACIONMIENTO VISITA");

        cbSeleccionarEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarEstacionamientoActionPerformed(evt);
            }
        });

        chAutorizacionResidente.setText("Residente Autoriza el Ingreso de la visita");
        chAutorizacionResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chAutorizacionResidenteActionPerformed(evt);
            }
        });

        jLabel7.setText("SELECCIONAR RESIDENTE");

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

        btnGuardarVisita.setText("GUARDAR INGRESO");
        btnGuardarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVisitaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(45, 45, 45)
                .addComponent(jLabel7)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addGap(26, 26, 26)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(cbSeleccionarDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(chAutorizacionResidente))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(cbSeleccionarResidente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(58, 58, 58)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(49, 49, 49)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(10, 10, 10)
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(chSeleccionarEstacionamientoVisita))
                                .addGap(22, 22, 22))
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(cbSeleccionarEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(25, 25, 25)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbSeleccionarDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(chSeleccionarEstacionamientoVisita)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(9, 9, 9)
                        .addComponent(chAutorizacionResidente)
                        .addGap(28, 28, 28)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 134, Short.MAX_VALUE)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(2, 2, 2)
                        .addComponent(cbSeleccionarResidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cbSeleccionarEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnGuardarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))))
        );

        getContentPane().add(jPanel1);
        jPanel1.setBounds(0, 0, 839, 453);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed

    private void cbSeleccionarEstacionamientoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarEstacionamientoActionPerformed
        // TODO add your handling code here:
       
    }//GEN-LAST:event_cbSeleccionarEstacionamientoActionPerformed

    private void chSeleccionarEstacionamientoVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chSeleccionarEstacionamientoVisitaActionPerformed
        // TODO add your handling code here:
         if(chSeleccionarEstacionamientoVisita.isSelected()){
            cbSeleccionarEstacionamiento.setEnabled(true);
        }else{
            cbSeleccionarEstacionamiento.setEnabled(false);
        }
        
    }//GEN-LAST:event_chSeleccionarEstacionamientoVisitaActionPerformed

    private void LbFechaHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbFechaHoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbFechaHoraMouseClicked

    private void LbFechaHoraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LbFechaHoraAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_LbFechaHoraAncestorAdded

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void txtRutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtRutActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtRutActionPerformed

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
        // TODO add your handling code here:
        if(chAutorizacionResidente.isSelected()){
            cbSeleccionarResidente.setEnabled(true);
        }else{
            cbSeleccionarResidente.setEnabled(false);
        }
        
    }//GEN-LAST:event_chAutorizacionResidenteActionPerformed
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
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
