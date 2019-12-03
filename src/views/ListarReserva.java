package views;

import dao.DepartamentoDao;
import dao.ReservaDao;

import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Departamento;
import models.Reserva;

public class ListarReserva extends javax.swing.JInternalFrame {

    private DepartamentoDao departamentoDao;
    private ReservaDao reservaDao;

    // Listados
    List<Reserva> reservas;
    
    private String fecha;
    private String turno;
    private String numeroDepartamento;
    private String nombres;
    private String apellidos;
    
    DefaultTableModel modeloTabla;
    
    public ListarReserva() {
        System.out.println("ListarReserva");
        initComponents();
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        
        String numeroDepartamento = "";
        String fechaCombobox = "";
        
        // Obtener modelo tabla
        modeloTabla = (DefaultTableModel) tblListarReserva.getModel();
        
        TableColumn columna1 = tblListarReserva.getColumn("Fecha");
        TableColumn columna2 = tblListarReserva.getColumn("Turno");
        TableColumn columna3 = tblListarReserva.getColumn("Depto");
        //TableColumn columna4 = tblListarReserva.getColumn("Residente");
        
        columna1.setMinWidth(90);
        columna1.setMaxWidth(90);
        columna2.setMinWidth(120);
        columna2.setMaxWidth(120);
        columna3.setMinWidth(60);
        columna3.setMaxWidth(60);
        
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
        this.lbFechaHora.setText(fechahora);
        // Fin fecha y hora
        
        // DEPARTAMENTOS
        cbSeleccionarDpto.addItem("Todos");
        try {
            departamentoDao = new DepartamentoDao();
            List<Departamento> departamentos = departamentoDao.listadoDepartamentos();
            for (int i = 0; i < departamentos.size(); i++) {
                numeroDepartamento = departamentos.get(i).getNumeroDepartamento();
                System.out.println("Número: " + numeroDepartamento);
                cbSeleccionarDpto.addItem(numeroDepartamento);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        // FECHAS
        reservaDao = new ReservaDao();
        
        cbSeleccionarFecha.addItem("Todas");
        try {
            List<Reserva> fechas = reservaDao.listadoRegistroFechas();
            for (int i = 0; i < fechas.size(); i++) {
                fechaCombobox = fechas.get(i).getFecha();
                System.out.println("Fecha: " + fechaCombobox);
                cbSeleccionarFecha.addItem(fechaCombobox);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        jlMensaje.setVisible(false);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListarReserva = new javax.swing.JTable();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        btnEliminar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbFechaHora = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        cbSeleccionarFecha = new javax.swing.JComboBox<>();
        jlMensaje = new javax.swing.JLabel();
        btnCerrar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setResizable(true);
        setTitle("Listar Reserva Sala");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblListarReserva.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Fecha", "Turno", "Depto", "Residente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListarReserva.getTableHeader().setResizingAllowed(false);
        tblListarReserva.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblListarReserva);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(280, 60, 600, 420));

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 90, 238, -1));

        btnEliminar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnEliminar.setText("ELIMINAR RESERVA");
        btnEliminar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });
        jPanel1.add(btnEliminar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 290, 158, 55));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("LISTAR RESERVA DE SALA EVENTOS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbFechaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFechaHora.setText("FECHA Y HORA:");
        jPanel3.add(lbFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 15, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 890, 50));

        jLabel1.setBackground(new java.awt.Color(0, 51, 102));
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("SELECCIONAR DEPARTAMENTO:");
        jPanel1.add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 70, -1, -1));

        jLabel2.setBackground(new java.awt.Color(0, 51, 102));
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("SELECCIONAR FECHA RESERVA:");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 130, -1, -1));

        cbSeleccionarFecha.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarFechaActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarFecha, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 150, 238, -1));

        jlMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jlMensaje.setText("SIN RESERVAS REGISTRADAS");
        jPanel1.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 210, -1, -1));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(60, 410, 158, 55));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 493, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recargarTabla() {
        reservaDao = new ReservaDao();
        reservas = reservaDao.listadoRegistroReservas();
        cargarTabla(reservas);
    }
    
    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        boolean eliminar = false;
        String fecha, turno;
        String mensaje = "¿Está seguro que desea eliminar esta reserva?";
        int index = tblListarReserva.getSelectedRow();
        System.out.println("Row index: " + index);
        if (index == -1) {
            JOptionPane.showMessageDialog(null, "¡Debe seleccionar una reserva!");
        } else {
            fecha = reservas.get(index).getFecha();
            turno = reservas.get(index).getTurno();
            int confirmar = JOptionPane.showConfirmDialog(null, mensaje, "¡Precaución!", JOptionPane.YES_NO_OPTION);
            if (confirmar == 0){
                eliminar = reservaDao.eliminarReserva(fecha, turno);
                if (eliminar) {
                    recargarTabla();
                    JOptionPane.showMessageDialog(null, "¡Reserva eliminada correctamente!");
                } else {
                    JOptionPane.showMessageDialog(null, "¡Ha ocurrido un error!");
                }
            }
        }
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged")) {
            if (!departamento.equals("Todos")) {
                reservas = reservaDao.listadoRegistroReservasDepartamento(departamento);
                cargarTabla(reservas);
            } else {
                recargarTabla();
            }
        }
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed

    private void cbSeleccionarFechaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarFechaActionPerformed
        String actionCommand = evt.getActionCommand();
        String fecha = cbSeleccionarFecha.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged")) {
            if (!fecha.equals("Todas")) {
                reservas = reservaDao.listadoRegistroReservasFecha(fecha);
                cargarTabla(reservas);
            } else {
                recargarTabla();
            }
        }
    }//GEN-LAST:event_cbSeleccionarFechaActionPerformed

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    public void cargarTabla(List<Reserva> reservas) {
        modeloTabla.setRowCount(0);
        if (reservas.size() > 0) {
            for (int i = 0; i < reservas.size(); i++) {
                Vector fila = new Vector();
                this.fecha = reservas.get(i).getFecha();
                turno = reservas.get(i).getTurno();
                this.numeroDepartamento = reservas.get(i).getNumeroDepartamento();
                nombres = reservas.get(i).getNombres();
                apellidos = reservas.get(i).getApellidos();
                fila.add(this.fecha);
                fila.add(turno);
                fila.add(this.numeroDepartamento);
                fila.add(nombres + " " + apellidos);
                modeloTabla.addRow(fila);
            }
            jlMensaje.setVisible(false);
        } else {
            jlMensaje.setVisible(true);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCerrar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<String> cbSeleccionarDpto;
    private javax.swing.JComboBox<String> cbSeleccionarFecha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel lbFechaHora;
    private javax.swing.JTable tblListarReserva;
    // End of variables declaration//GEN-END:variables
}
