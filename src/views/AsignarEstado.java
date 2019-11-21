/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import java.util.Calendar;
import javax.swing.JOptionPane;

/**
 *
 * @author informatica_prac
 */
public class AsignarEstado extends javax.swing.JInternalFrame {

    /**
     * Creates new form Reserva_Sala
     */
    public AsignarEstado() {
        initComponents();
        //import java.util.Calendar;
        Calendar cal=Calendar.getInstance();
        
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+ ":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        String fechahora=fecha +" : "+hora;
       
        //fecha y hora sistema
       // JOptionPane.showMessageDialog(null, fechahora);
        this.LbFechaHora.setText(fechahora);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        cbSeleccionarDepto = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        chRestriccionEstacionamientoVisita = new javax.swing.JCheckBox();
        chRestriccionSalaEvento = new javax.swing.JCheckBox();
        cbSeleccionarNombreResidente = new javax.swing.JComboBox<>();
        btnCerrar = new javax.swing.JButton();
        LbFechaHora = new javax.swing.JLabel();
        cbSeleccionarEstadoDpto = new javax.swing.JComboBox<>();
        cbSeleccionarTipoRestriccion = new javax.swing.JComboBox<>();
        LbFechaHora1 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("ASIGNAR ESTADO DEPARTAMENTOS");

        cbSeleccionarDepto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Departamento", "101", "102", "103", "104", "201", "202", "203", "204", "301", "302", "303", "304" }));
        cbSeleccionarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDeptoActionPerformed(evt);
            }
        });

        jButton1.setText("GUARDAR ESTADO");

        chRestriccionEstacionamientoVisita.setText("RESTRICCIÓN USO ESTACIONAMIENTO VISITA");
        chRestriccionEstacionamientoVisita.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chRestriccionEstacionamientoVisitaActionPerformed(evt);
            }
        });

        chRestriccionSalaEvento.setText("RESTRICCIÓN USO SALA EVENTOS");

        cbSeleccionarNombreResidente.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Nombre Residente", "1", "2", "3", "4", "5" }));
        cbSeleccionarNombreResidente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarNombreResidenteActionPerformed(evt);
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

        cbSeleccionarEstadoDpto.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Estado", "101", "102", "103", "104", "201", "202", "203", "204", "301", "302", "303", "304" }));
        cbSeleccionarEstadoDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarEstadoDptoActionPerformed(evt);
            }
        });

        cbSeleccionarTipoRestriccion.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Seleccionar Tipo Restricción", "101", "102", "103", "104", "201", "202", "203", "204", "301", "302", "303", "304" }));
        cbSeleccionarTipoRestriccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarTipoRestriccionActionPerformed(evt);
            }
        });

        LbFechaHora1.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                LbFechaHora1AncestorAdded(evt);
            }
            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        LbFechaHora1.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                LbFechaHora1MouseClicked(evt);
            }
        });

        jLabel1.setText("FECHA Y HORA:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(LbFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(cbSeleccionarNombreResidente, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSeleccionarDepto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbSeleccionarEstadoDpto, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbSeleccionarTipoRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(45, 45, 45)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(chRestriccionSalaEvento)
                            .addComponent(chRestriccionEstacionamientoVisita)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(LbFechaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(49, 49, 49)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(75, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSeleccionarDepto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chRestriccionEstacionamientoVisita)
                    .addComponent(cbSeleccionarEstadoDpto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbSeleccionarNombreResidente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(chRestriccionSalaEvento)
                    .addComponent(cbSeleccionarTipoRestriccion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 97, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(LbFechaHora1, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCerrar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(LbFechaHora, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(23, 23, 23))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cbSeleccionarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDeptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionarDeptoActionPerformed

    private void cbSeleccionarNombreResidenteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarNombreResidenteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionarNombreResidenteActionPerformed

    private void chRestriccionEstacionamientoVisitaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chRestriccionEstacionamientoVisitaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_chRestriccionEstacionamientoVisitaActionPerformed

    private void LbFechaHoraMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbFechaHoraMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbFechaHoraMouseClicked

    private void LbFechaHoraAncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LbFechaHoraAncestorAdded
        // TODO add your handling code here:
       
    }//GEN-LAST:event_LbFechaHoraAncestorAdded

    private void cbSeleccionarEstadoDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarEstadoDptoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionarEstadoDptoActionPerformed

    private void cbSeleccionarTipoRestriccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarTipoRestriccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_cbSeleccionarTipoRestriccionActionPerformed

    private void LbFechaHora1AncestorAdded(javax.swing.event.AncestorEvent evt) {//GEN-FIRST:event_LbFechaHora1AncestorAdded
        // TODO add your handling code here:

    }//GEN-LAST:event_LbFechaHora1AncestorAdded

    private void LbFechaHora1MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_LbFechaHora1MouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_LbFechaHora1MouseClicked

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
        
    }//GEN-LAST:event_btnCerrarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbFechaHora;
    private javax.swing.JLabel LbFechaHora1;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cbSeleccionarDepto;
    private javax.swing.JComboBox<String> cbSeleccionarEstadoDpto;
    private javax.swing.JComboBox<String> cbSeleccionarNombreResidente;
    private javax.swing.JComboBox<String> cbSeleccionarTipoRestriccion;
    private javax.swing.JCheckBox chRestriccionEstacionamientoVisita;
    private javax.swing.JCheckBox chRestriccionSalaEvento;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
