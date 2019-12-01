package views;

import dao.DepartamentoDao;
import dao.EstadoDao;
import java.util.Calendar;
import java.util.List;
import java.util.Vector;
import javax.swing.JInternalFrame;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableColumn;
import models.Departamento;
import models.Estado;

public class ListarEstado extends javax.swing.JInternalFrame {

    private DepartamentoDao departamentoDao;
    private EstadoDao estadoDao;
    
    //CREA LA TABLA
    DefaultTableModel modeloTabla;
  
    public ListarEstado() {
        initComponents();
        // Bloquear redimension
        this.setResizable(false);
        // Boton cerrar y ocultar JInternalFrame
        this.setDefaultCloseOperation(JInternalFrame.HIDE_ON_CLOSE);
        
        String numeroDepartamento = "";
        
        // Obtener modelo tabla
        modeloTabla = (DefaultTableModel) tblListaEstado.getModel();
        
        TableColumn columna1 = tblListaEstado.getColumn("Depto");
        TableColumn columna2 = tblListaEstado.getColumn("Fecha");
        TableColumn columna3 = tblListaEstado.getColumn("Estado");
        TableColumn columna4 = tblListaEstado.getColumn("Restricción");
        //TableColumn columna5 = tblListaEstado.getColumn("Observación");
        
        columna1.setMinWidth(50);
        columna1.setMaxWidth(50);
        columna2.setMinWidth(130);
        columna2.setMaxWidth(130);
        columna3.setMinWidth(170);
        columna3.setMaxWidth(170);
        columna4.setMinWidth(210);
        columna4.setMaxWidth(210);
        
        //import java.util.Calendar;
        Calendar cal=Calendar.getInstance();
        
        String fecha=cal.get(Calendar.DATE)+"/"+cal.get(cal.MONTH)+"/"+cal.get(cal.YEAR);
        String hora=cal.get(cal.HOUR_OF_DAY)+ ":"+cal.get(cal.MINUTE)+":"+cal.get(cal.SECOND);
        String fechahora=fecha +" : "+hora;
       
        //fecha y hora sistema
       // JOptionPane.showMessageDialog(null, fechahora);
        this.LbFechaHora.setText(fechahora);
      
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

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        cbSeleccionarDpto = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblListaEstado = new javax.swing.JTable();
        btnCerrar = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        LbFechaHora = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();

        setTitle("LISTAR Y ELIMINAR ESTADOS");

        jPanel1.setBackground(new java.awt.Color(0, 51, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        cbSeleccionarDpto.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSeleccionarDptoActionPerformed(evt);
            }
        });
        jPanel1.add(cbSeleccionarDpto, new org.netbeans.lib.awtextra.AbsoluteConstraints(180, 60, 238, -1));

        tblListaEstado.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Depto", "Fecha", "Estado", "Restricción", "Observación"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tblListaEstado.setSurrendersFocusOnKeystroke(true);
        tblListaEstado.getTableHeader().setResizingAllowed(false);
        tblListaEstado.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tblListaEstado);

        jPanel1.add(jScrollPane1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 100, 980, 270));

        btnCerrar.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        btnCerrar.setText("CERRAR");
        btnCerrar.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        btnCerrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCerrarActionPerformed(evt);
            }
        });
        jPanel1.add(btnCerrar, new org.netbeans.lib.awtextra.AbsoluteConstraints(780, 400, 158, 55));

        jPanel3.setBackground(new java.awt.Color(204, 153, 0));
        jPanel3.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel10.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel10.setText("ASIGNACIÓN DE ESTADOS A DEPARTAMENTOS");
        jPanel3.add(jLabel10, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 10, -1, -1));

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel8.setText("FECHA Y HORA:");
        jPanel3.add(jLabel8, new org.netbeans.lib.awtextra.AbsoluteConstraints(544, 15, -1, -1));

        LbFechaHora.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jPanel3.add(LbFechaHora, new org.netbeans.lib.awtextra.AbsoluteConstraints(660, 11, 200, 22));

        jPanel1.add(jPanel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 1000, 50));

        jLabel3.setBackground(new java.awt.Color(0, 51, 102));
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Seleccionar Departamento");
        jPanel1.add(jLabel3, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 70, 238, -1));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 481, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCerrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCerrarActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_btnCerrarActionPerformed

    private void cbSeleccionarDptoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSeleccionarDptoActionPerformed
        String numeroDepartamento;
        String estado;
        String restriccion;
        String fecha;
        String observacion;
        String actionCommand = evt.getActionCommand();
        String departamento = cbSeleccionarDpto.getSelectedItem().toString();
        if (actionCommand.equals("comboBoxChanged") && !departamento.equals("-")) {
            try {   
                estadoDao = new EstadoDao();
                List<Estado> estados = estadoDao.listadoEstadosDepartamento(departamento);
                modeloTabla.setRowCount(0);
                if (estados.size() > 0) {
                    for (int i = 0; i < estados.size(); i++) {
                        Vector fila = new Vector();
                        numeroDepartamento = estados.get(i).getNumeroDepartamento();
                        fecha = estados.get(i).getFecha();
                        estado = estados.get(i).getNombreTipoEstado();
                        if (estados.get(i).getRestriccion() == null || estados.get(i).getRestriccion().isEmpty()) {
                            restriccion = "-";
                        } else {
                            restriccion = estados.get(i).getRestriccion();
                        }
                        if (estados.get(i).getObservacion() == null || estados.get(i).getObservacion().isEmpty()) {
                            observacion = "-";
                        } else {
                            observacion = estados.get(i).getObservacion();
                        }
                        fila.add(numeroDepartamento);
                        fila.add(fecha);
                        fila.add(estado);
                        fila.add(restriccion);
                        fila.add(observacion);
                        modeloTabla.addRow(fila);
                    }
                } else {
                    // Sin visitas
                    //jlMensaje.setVisible(true);
                }
            } catch (Exception e) {
                System.out.println("Error: " + e);
            }
        }
    }//GEN-LAST:event_cbSeleccionarDptoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel LbFechaHora;
    private javax.swing.JButton btnCerrar;
    private javax.swing.JComboBox<String> cbSeleccionarDpto;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tblListaEstado;
    // End of variables declaration//GEN-END:variables
}
