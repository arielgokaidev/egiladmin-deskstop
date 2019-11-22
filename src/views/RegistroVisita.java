package views;

import dao.DepartamentoDao;
import dao.EstacionamientoDao;
import dao.ResidenteDao;
import java.util.Calendar;
import java.util.List;
import javax.swing.JOptionPane;
import models.Departamento;
import models.Estacionamiento;
import models.Residente;

public class RegistroVisita extends javax.swing.JInternalFrame {

   private String rut,nombre,apellido,seleccionardpto,seleccionarestacionamiento,seleccionarresidente,usoestacionamientovisita,autorizaresidente;
   
   private DepartamentoDao departamentoDao;
   private ResidenteDao residenteDao;
   private EstacionamientoDao estacionamientoDao;
   
    public RegistroVisita() {
        initComponents();
        
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
        //Carga de combobox en duro hasta que se conecte con la base de datos
        //DEPARTAMENTO
        try {
            departamentoDao = new DepartamentoDao();
            cbSelecionarDpto.addItem("Seleccione un departamento");
            List<Departamento> departamentos = departamentoDao.listadoDepartamentos();
            for (int i = 0; i < departamentos.size(); i++) {
                numeroDepartamento = departamentos.get(i).getNumero();
                System.out.println("Número: " + numeroDepartamento);
                cbSelecionarDpto.addItem(numeroDepartamento);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        /*
        cbSelecionarDpto.addItem("");
        cbSelecionarDpto.addItem("101");
        cbSelecionarDpto.addItem("201");
        cbSelecionarDpto.addItem("301");
        cbSelecionarDpto.addItem("401");
        cbSelecionarDpto.addItem("501");
        cbSelecionarDpto.addItem("601");
        */
         //ESTACIONAMIENTO
        try {   
            estacionamientoDao = new EstacionamientoDao();
            cbSeleccionarEstacionamiento.addItem("Seleccione un número");
            List<Estacionamiento> estacionamientos = estacionamientoDao.listadoEstacionamientos();
            for (int i = 0; i < estacionamientos.size(); i++) {
                numero = String.valueOf(estacionamientos.get(i).getNumero());
                System.out.println("Número: " + numero);
                cbSeleccionarEstacionamiento.addItem(numero);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        /*
        cbSeleccionarEstacionamiento.addItem("");
        cbSeleccionarEstacionamiento.addItem("1");
        cbSeleccionarEstacionamiento.addItem("2");
        cbSeleccionarEstacionamiento.addItem("3");
        cbSeleccionarEstacionamiento.addItem("4");
        cbSeleccionarEstacionamiento.addItem("5");
        cbSeleccionarEstacionamiento.addItem("6");
        */
         //RESIDENTE
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
        /*
        cbSeleccionarResidente.addItem("");
        cbSeleccionarResidente.addItem("JUANITO");
        cbSeleccionarResidente.addItem("LUCHITO");
        cbSeleccionarResidente.addItem("PEPITO");
        */
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbSelecionarDpto = new javax.swing.JComboBox<>();
        cbSeleccionarResidente = new javax.swing.JComboBox<>();
        btnGuardarVisita = new javax.swing.JButton();
        chSeleccionarEstacionamientoVisita = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        txtRut = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtApellido = new javax.swing.JTextField();
        chAutorizacionResidente = new javax.swing.JCheckBox();
        cbSeleccionarEstacionamiento = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        LbFechaHora = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("REGISTRAR VISITAS");

        cbSelecionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelecionarDptoActionPerformed(evt);
            }
        });

        btnGuardarVisita.setText("GUARDAR INGRESO");
        btnGuardarVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarVisitaActionPerformed(evt);
            }
        });

        chSeleccionarEstacionamientoVisita.setText("USO ESTACIONAMIENTO VISITA");
        chSeleccionarEstacionamientoVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chSeleccionarEstacionamientoVisitaActionPerformed(evt);
            }
        });

        jLabel1.setText("INGRESE NOMBRE");

        txtRut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtRutActionPerformed(evt);
            }
        });

        jLabel2.setText("INGRESE RUT");

        jLabel3.setText("INGRESAR APELLIDO");

        chAutorizacionResidente.setText("Residente Autoriza el Ingreso de la visita");
        chAutorizacionResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chAutorizacionResidenteActionPerformed(evt);
            }
        });

        cbSeleccionarEstacionamiento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarEstacionamientoActionPerformed(evt);
            }
        });

        btnCerrar.setText("CERRAR");
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });

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

        jLabel4.setText("INGRESE RUT SIN PUNTOS NI GUION");

        jLabel5.setText("SELECCIONAR NUMERO DEPARTAMENTO");

        jLabel6.setText("SELECCIONAR ESTACIONMIENTO VISITA");

        jLabel7.setText("SELECCIONAR RESIDENTE");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(305, 305, 305)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel5)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(LbFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSeleccionarResidente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbSelecionarDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addComponent(jLabel7))
                            .addGap(153, 153, 153)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chSeleccionarEstacionamientoVisita)
                            .addComponent(jLabel4))
                        .addContainerGap(27, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnGuardarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(64, 64, 64))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(cbSeleccionarEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(34, 34, 34)
                    .addComponent(chAutorizacionResidente)
                    .addContainerGap(584, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtRut, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbSelecionarDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtApellido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(chSeleccionarEstacionamientoVisita))
                        .addGap(37, 37, 37)
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addComponent(cbSeleccionarEstacionamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 149, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnGuardarVisita, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(82, 82, 82))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(cbSeleccionarResidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(44, 44, 44)
                        .addComponent(LbFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(248, Short.MAX_VALUE)
                    .addComponent(chAutorizacionResidente)
                    .addGap(199, 199, 199)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSelecionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelecionarDptoActionPerformed
        // TODO add your handling code here:
        
    }//GEN-LAST:event_cbSelecionarDptoActionPerformed

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
        String selectdpto = (String)cbSelecionarDpto.getSelectedItem();
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
    private javax.swing.JComboBox<String> cbSeleccionarEstacionamiento;
    private javax.swing.JComboBox<String> cbSeleccionarResidente;
    private javax.swing.JComboBox<String> cbSelecionarDpto;
    private javax.swing.JCheckBox chAutorizacionResidente;
    private javax.swing.JCheckBox chSeleccionarEstacionamientoVisita;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JTextField txtApellido;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtRut;
    // End of variables declaration//GEN-END:variables
}
