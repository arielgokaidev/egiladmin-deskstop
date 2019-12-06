package views;

import dao.DepartamentoDao;
import dao.EstadoDao;
import dao.ReservaDao;
import dao.ResidenteDao;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.List;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import models.Departamento;
import models.Residente;

public class ReservaSala extends javax.swing.JInternalFrame {
    
    // Instancias DAO
    private DepartamentoDao departamentoDao;
    private ResidenteDao residenteDao;
    private ReservaDao reservaDao;
    
    private String rutUsuario;

    // Listados
    List<Residente> residentes;
    
    public ReservaSala(String rutUsuario) {
        initComponents();
        
        this.rutUsuario = rutUsuario;
        
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        
        String numeroDepartamento = "";
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
        String fechahora = "FECHA Y HORA: " + fecha + " - "+hora;
        // Fin fecha y hora
        */
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
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        cbSeleccionarResidente = new javax.swing.JComboBox<>();
        chTurno10 = new javax.swing.JCheckBox();
        chTurno14 = new javax.swing.JCheckBox();
        chTurno18 = new javax.swing.JCheckBox();
        calendarioReserva = new com.toedter.calendar.JDateChooser();
        btnVolver = new javax.swing.JButton();
        btnReservar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();

        setResizable(true);
        setTitle("Reserva Sala");
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 80, 238, -1));

        jPanel1.add(cbSeleccionarResidente, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 120, 238, -1));

        chTurno10.setBackground(new java.awt.Color(0, 51, 102));
        chTurno10.setForeground(new java.awt.Color(255, 255, 255));
        chTurno10.setText("10:00 a 14:00 hrs.");
        chTurno10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chTurno10ActionPerformed(evt);
            }
        });
        jPanel1.add(chTurno10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 240, -1, -1));

        chTurno14.setBackground(new java.awt.Color(0, 51, 102));
        chTurno14.setForeground(new java.awt.Color(255, 255, 255));
        chTurno14.setText("14:00 a 18:00 hrs.");
        chTurno14.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chTurno14ActionPerformed(evt);
            }
        });
        jPanel1.add(chTurno14, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 280, -1, -1));

        chTurno18.setBackground(new java.awt.Color(0, 51, 102));
        chTurno18.setForeground(new java.awt.Color(255, 255, 255));
        chTurno18.setText("18:00 a 22:00 hrs.");
        chTurno18.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                chTurno18ActionPerformed(evt);
            }
        });
        jPanel1.add(chTurno18, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 320, -1, -1));

        calendarioReserva.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.add(calendarioReserva, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 120, 184, -1));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setText("CERRAR");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 290, 158, 55));

        btnReservar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnReservar.setText("RESERVAR SALA");
        btnReservar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnReservar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnReservarActionPerformed(evt);
            }
        });
        jPanel1.add(btnReservar, new org.netbeans.lib.awtextra.AbsoluteConstraints(530, 290, 158, 55));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("RESERVA SALA DE EVENTOS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 740, 50));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONAR DEPARTAMENTO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 80, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONAR FECHA DE RESERVA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(510, 80, -1, -1));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("SELECCIONAR RESIDENTE:");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, 10));

        jLabel4.setBackground(new java.awt.Color(0, 51, 102));
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("SELECCIONAR TURNO:");
        jPanel1.add(jLabel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 200, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 3, 740, 390));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

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

    private void chTurno10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chTurno10ActionPerformed
        if (chTurno10.isSelected()) {
            chTurno14.setSelected(false);
            chTurno18.setSelected(false);
        }     
    }//GEN-LAST:event_chTurno10ActionPerformed

    private void chTurno14ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chTurno14ActionPerformed
        if (chTurno14.isSelected()) {
            chTurno10.setSelected(false);
            chTurno18.setSelected(false);
        }
    }//GEN-LAST:event_chTurno14ActionPerformed

    private void chTurno18ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_chTurno18ActionPerformed
        if (chTurno18.isSelected()) {
            chTurno10.setSelected(false);
            chTurno14.setSelected(false);
        }
    }//GEN-LAST:event_chTurno18ActionPerformed

    private void btnReservarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnReservarActionPerformed
        boolean restriccion = false;
        boolean fechaDisponible = true;
        boolean ingreso = false;
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        String residente = cbSeleccionarResidente.getSelectedItem().toString();
        //System.out.println("Fecha: " + calendarioReserva.getDate());
        SimpleDateFormat dateFormatSql = new SimpleDateFormat("yyyy-MM-dd");
        String fecha;
        int valorTurno = 5000;
        String turno = "";
        if (chTurno10.isSelected()) {
            turno = chTurno10.getText();
        } else if (chTurno14.isSelected()) {
            turno = chTurno14.getText();
        } else if (chTurno18.isSelected()) {
            turno = chTurno18.getText();
        } else {
            turno = "";
        }
        //System.out.println("Turno: " + turno);
        if (departamento.equals("-") || calendarioReserva.getDate() == null || turno.isEmpty()) {
            JOptionPane.showMessageDialog(null, "¡Debe completar todos los campos!");
        } else if (residente.equals("Sin residentes")) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar un residente para crear la reserva!");
        } else {
            int indexResidente = cbSeleccionarResidente.getSelectedIndex();
            String rut = residentes.get(indexResidente).getRut();
            fecha = dateFormatSql.format(calendarioReserva.getDate());
            //System.out.println("Fecha final: "+ fecha);
            // Consultar restriccion
            EstadoDao estadoDao = new EstadoDao();
            restriccion = estadoDao.revisarRestriccion(departamento);
            // Consultar disponibilidad
            reservaDao = new ReservaDao();
            fechaDisponible = reservaDao.revisarFecha(fecha, turno);
            if (restriccion) {
                JOptionPane.showMessageDialog(null, "¡Departamento tiene restriccion de uso de espacios comunes!");
            } else if (fechaDisponible) {
                ingreso = reservaDao.ingresarReserva(rut, departamento, rutUsuario, fecha, valorTurno, turno);
                if (ingreso) {
                    cbSeleccionarDpto.setSelectedItem("-");
                    calendarioReserva.setCalendar(null);
                    chTurno10.setSelected(false);
                    chTurno14.setSelected(false);
                    chTurno18.setSelected(false);
                    Menu.getListarReserva().recargarTabla();
                    JOptionPane.showMessageDialog(this, "¡Reserva registrada correctamente!");
                } else {
                    JOptionPane.showMessageDialog(this, "Ha ocurrido un error");
                }
            } else {
                JOptionPane.showMessageDialog(this, "¡La fecha y turno seleccionado no están disponibles!");
            }
        }
    }//GEN-LAST:event_btnReservarActionPerformed

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
    private javax.swing.JButton btnReservar;
    private javax.swing.JButton btnVolver;
    private com.toedter.calendar.JDateChooser calendarioReserva;
    private javax.swing.JComboBox<String> cbSeleccionarDpto;
    private javax.swing.JComboBox<String> cbSeleccionarResidente;
    private javax.swing.JCheckBox chTurno10;
    private javax.swing.JCheckBox chTurno14;
    private javax.swing.JCheckBox chTurno18;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    // End of variables declaration//GEN-END:variables
}
