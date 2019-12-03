package views;

import dao.DepartamentoDao;
import dao.VisitaDao;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Departamento;
import models.Visita;

public class ListarVisita extends javax.swing.JInternalFrame {

    private DepartamentoDao departamentoDao;
    private VisitaDao visitaDao;
    
    List<Visita> visitas;
    
    //CREA LA TABLA
    DefaultTableModel modeloTabla;
    
    public ListarVisita() {
        super("LISTADO DE VISITAS");
        initComponents();
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        
        String numeroDepartamento = "";
        
        // Obtener modelo tabla
        modeloTabla = (DefaultTableModel) tblVisita.getModel();
        
        // Obtener columnas tabla
        TableColumn columna1 = tblVisita.getColumn("Depto");
        TableColumn columna2 = tblVisita.getColumn("Fecha ingreso");
        TableColumn columna3 = tblVisita.getColumn("Fecha salida");
        TableColumn columna4 = tblVisita.getColumn("Rut");
        //TableColumn columna5 = tblVisita.getColumn("Nombre");
        //TableColumn columna6 = tblVisita.getColumn("Apellido");
        TableColumn columna7 = tblVisita.getColumn("Autorización");
        TableColumn columna8 = tblVisita.getColumn("Estacionamiento");
        TableColumn columna9 = tblVisita.getColumn("Patente");
        
        // Fijar ancho minimo y maximo
        columna1.setMinWidth(50);
        columna1.setMaxWidth(50);
        columna2.setMinWidth(130);
        columna2.setMaxWidth(130);
        columna3.setMinWidth(130);
        columna3.setMaxWidth(130);
        columna4.setMinWidth(80);
        columna4.setMaxWidth(80);
        columna7.setMinWidth(80);
        columna7.setMaxWidth(80);
        columna8.setMinWidth(110);
        columna8.setMaxWidth(110);
        columna9.setMinWidth(70);
        columna9.setMaxWidth(70);

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
        try {
            departamentoDao = new DepartamentoDao();
            cbSeleccionarDepto.addItem("Todos");
            List<Departamento> departamentos = departamentoDao.listadoDepartamentos();
            for (int i = 0; i < departamentos.size(); i++) {
                numeroDepartamento = departamentos.get(i).getNumeroDepartamento();
                System.out.println("Número: " + numeroDepartamento);
                cbSeleccionarDepto.addItem(numeroDepartamento);
            }
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
        
        // VISITAS
        recargarTabla();
        
        // Ocultar mensaje
        jlMensaje.setVisible(false);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblVisita = new javax.swing.JTable();
        btnVolver = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        lbFechaHora = new javax.swing.JLabel();
        jlMensaje = new javax.swing.JLabel();
        cbSeleccionarDepto = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();

        setResizable(true);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        tblVisita.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Depto", "Fecha ingreso", "Fecha salida", "Rut", "Nombre", "Apellido", "Autorización", "Estacionamiento", "Patente"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblVisita.setSurrendersFocusOnKeystroke(true);
        tblVisita.getTableHeader().setResizingAllowed(false);
        tblVisita.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblVisita);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 130, 980, 330));

        btnVolver.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnVolver.setText("CERRAR");
        btnVolver.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        jPanel1.add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 60, 130, 55));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("LISTA DE VISITAS INGRESADAS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        lbFechaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        lbFechaHora.setText("FECHA Y HORA:");
        jPanel3.add(lbFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 15, -1, -1));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jlMensaje.setForeground(new java.awt.Color(255, 255, 255));
        jlMensaje.setText("SIN VISITAS REGISTRADAS");
        jPanel1.add(jlMensaje, new org.netbeans.lib.awtextra.AbsoluteConstraints(390, 80, -1, 20));

        cbSeleccionarDepto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDeptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDepto, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 80, 160, -1));

        jLabel9.setForeground(new java.awt.Color(255, 255, 255));
        jLabel9.setText("SELECCIONAR DEPARTAMENTO:");
        jPanel1.add(jLabel9, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 80, -1, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 484, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void recargarTabla() {
        String numeroDepartamento;
        String autorizaResidente;
        String fechaIngreso;
        String fechaSalida;
        String rut;
        String nombres;
        String apellidos;
        int estacionamiento;
        String patente;
        jlMensaje.setVisible(false);
        try {
            visitaDao = new VisitaDao();
            visitas = visitaDao.listadoRegistroVisitas();
            modeloTabla.setRowCount(0); 
            if (visitas.size() > 0) {
                for (int i = 0; i < visitas.size(); i++) {
                    Vector fila = new Vector();
                    estacionamiento = visitas.get(i).getIdEstacionamiento();
                    numeroDepartamento = visitas.get(i).getNumeroDepartamento();
                    if (visitas.get(i).getAutorizaResidente() == null || visitas.get(i).getAutorizaResidente().isEmpty()) {
                        autorizaResidente = "-";
                    } else {
                        autorizaResidente = visitas.get(i).getAutorizaResidente();
                    }
                    fechaIngreso = visitas.get(i).getFechaIngreso();
                    fechaSalida = visitas.get(i).getFechaSalida();
                    rut = visitas.get(i).getRut();
                    nombres = visitas.get(i).getNombres();
                    apellidos = visitas.get(i).getApellidos();
                    if (visitas.get(i).getPatente() == null) {
                        patente = "-";
                    } else {
                        patente = visitas.get(i).getPatente().toUpperCase();
                    }
                    fila.add(numeroDepartamento);
                    fila.add(fechaIngreso);
                    fila.add(fechaSalida);
                    fila.add(rut);
                    fila.add(nombres);
                    fila.add(apellidos);
                    fila.add(autorizaResidente);
                    fila.add(estacionamiento);
                    fila.add(patente);
                    modeloTabla.addRow(fila);
                }
            } else {
                // Sin visitas
                jlMensaje.setVisible(true);
            } 
        } catch (Exception e) {
            System.out.println("Error: " + e);
        }
    }
    
    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.setVisible(false);
    }//GEN-LAST:event_btnVolverActionPerformed

    private void cbSeleccionarDeptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDeptoActionPerformed
        String numeroDepartamento;
        String autorizaResidente;
        String fechaIngreso;
        String fechaSalida;
        String rut;
        String nombres;
        String apellidos;
        int estacionamiento;
        String patente;
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDepto.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged")) {
            if (!departamento.equals("Todos")) {
                jlMensaje.setVisible(false);
                visitas = visitaDao.listadoRegistroVisitasDepartamento(departamento);
                modeloTabla.setRowCount(0);
                if (visitas.size() > 0) {
                    for (int i = 0; i < visitas.size(); i++) {
                        Vector fila = new Vector();
                        estacionamiento = visitas.get(i).getIdEstacionamiento();
                        numeroDepartamento = visitas.get(i).getNumeroDepartamento();
                        if (visitas.get(i).getAutorizaResidente() == null || visitas.get(i).getAutorizaResidente().isEmpty()) {
                            autorizaResidente = "-";
                        } else {
                            autorizaResidente = visitas.get(i).getAutorizaResidente();
                        }
                        fechaIngreso = visitas.get(i).getFechaIngreso();
                        fechaSalida = visitas.get(i).getFechaSalida();
                        rut = visitas.get(i).getRut();
                        nombres = visitas.get(i).getNombres();
                        apellidos = visitas.get(i).getApellidos();
                        if (visitas.get(i).getPatente() == null) {
                            patente = "-";
                        } else {
                            patente = visitas.get(i).getPatente().toUpperCase();
                        }
                        fila.add(numeroDepartamento);
                        fila.add(fechaIngreso);
                        fila.add(fechaSalida);
                        fila.add(rut);
                        fila.add(nombres);
                        fila.add(apellidos);
                        fila.add(autorizaResidente);
                        fila.add(estacionamiento);
                        fila.add(patente);
                        modeloTabla.addRow(fila);
                    }
                } else {
                    // Sin visitas
                    jlMensaje.setVisible(true);
                }
            } else {
                recargarTabla();
            }
        }    
    }//GEN-LAST:event_cbSeleccionarDeptoActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnVolver;
    private javax.swing.JComboBox<String> cbSeleccionarDepto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel jlMensaje;
    private javax.swing.JLabel lbFechaHora;
    private javax.swing.JTable tblVisita;
    // End of variables declaration//GEN-END:variables
}
