package Vista;

import Persistencia.Conexion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Grupo 11
 */
public class ModificarAlumno extends javax.swing.JInternalFrame {

    //private DefaultTableModel tablaAltaBaja = new DefaultTableModel();
    /**
     * Creates new form ModificarAlumno
     */
    public ModificarAlumno() {
        initComponents();
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        IngresarIDAlumno = new javax.swing.JTextField();
        Salir = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DarDeBajaAlumno = new javax.swing.JButton();
        DarDeAltaAlumno = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        TablaAltaBaja = new javax.swing.JTable();
        Contrasena = new javax.swing.JPasswordField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Alta / Baja de Alumnos");

        jLabel2.setText("ID de Alumno:");

        IngresarIDAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                IngresarIDAlumnoActionPerformed(evt);
            }
        });
        IngresarIDAlumno.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IngresarIDAlumnoKeyReleased(evt);
            }
        });

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        jLabel3.setText("(solo personal administrativo)");

        DarDeBajaAlumno.setText("Dar de baja");
        DarDeBajaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarDeBajaAlumnoActionPerformed(evt);
            }
        });

        DarDeAltaAlumno.setText("Dar de alta");
        DarDeAltaAlumno.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DarDeAltaAlumnoActionPerformed(evt);
            }
        });

        TablaAltaBaja.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "ID Alumno", "Apellido", "Nombre", "Estado"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(TablaAltaBaja);

        Contrasena.setText("****");
        Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContrasenaMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Salir))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                .addComponent(DarDeBajaAlumno)
                                .addGap(193, 193, 193)
                                .addComponent(DarDeAltaAlumno))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(6, 6, 6)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(88, 88, 88))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(IngresarIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 283, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))))
                .addContainerGap(42, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IngresarIDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(DarDeBajaAlumno)
                    .addComponent(DarDeAltaAlumno))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                        .addComponent(Salir)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void IngresarIDAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_IngresarIDAlumnoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_IngresarIDAlumnoActionPerformed

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void DarDeBajaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarDeBajaAlumnoActionPerformed
        if (!IngresarIDAlumno.getText().isEmpty() && Contrasena.getText().equalsIgnoreCase("123")) {
            int alumnito = (Integer.parseInt(IngresarIDAlumno.getText()));
            
             String sql = "UPDATE alumno SET estado = 0 "
                + "WHERE idAlumno = ?";

        try (java.sql.Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, alumnito);
            ResultSet rs = ps.executeQuery();
            listarAlumnosAltaBaja(Integer.parseInt(IngresarIDAlumno.getText()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al des-habilitar alumno." + e.getMessage());
        }
        } else {
            DefaultTableModel model = (DefaultTableModel) TablaAltaBaja.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_DarDeBajaAlumnoActionPerformed

    private void DarDeAltaAlumnoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DarDeAltaAlumnoActionPerformed
        if (!IngresarIDAlumno.getText().isEmpty() && Contrasena.getText().equalsIgnoreCase("123")) {
            int alumnito = (Integer.parseInt(IngresarIDAlumno.getText()));
            
             String sql = "UPDATE alumno SET estado = 1 "
                + "WHERE idAlumno = ?";

        try (java.sql.Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setDouble(1, alumnito);
            ResultSet rs = ps.executeQuery();
            listarAlumnosAltaBaja(Integer.parseInt(IngresarIDAlumno.getText()));
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al habilitar alumno." + e.getMessage());
        }
        } else {
            DefaultTableModel model = (DefaultTableModel) TablaAltaBaja.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_DarDeAltaAlumnoActionPerformed

    private void IngresarIDAlumnoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IngresarIDAlumnoKeyReleased
        if (!IngresarIDAlumno.getText().isEmpty()) {
            listarAlumnosAltaBaja(Integer.parseInt(IngresarIDAlumno.getText()));
        } else {
            DefaultTableModel model = (DefaultTableModel) TablaAltaBaja.getModel();
            model.setRowCount(0);
        }

    }//GEN-LAST:event_IngresarIDAlumnoKeyReleased

    private void ContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaMouseClicked
        Contrasena.setText("");
    }//GEN-LAST:event_ContrasenaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JButton DarDeAltaAlumno;
    private javax.swing.JButton DarDeBajaAlumno;
    private javax.swing.JTextField IngresarIDAlumno;
    private javax.swing.JButton Salir;
    private javax.swing.JTable TablaAltaBaja;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void listarAlumnosAltaBaja(int idAlumno) {
        DefaultTableModel modelo = new DefaultTableModel();
        modelo.addColumn("ID Alumno");
        modelo.addColumn("Apellido");
        modelo.addColumn("Nombre");
        modelo.addColumn("Estado");

        TablaAltaBaja.setModel(modelo);

        String sql = "SELECT idAlumno, apellido, nombre, estado "
                + "FROM alumno "
                + "WHERE idAlumno = ?";

        try (Connection con = Conexion.getConexion(); PreparedStatement ps = con.prepareStatement(sql)) {

            ps.setInt(1, idAlumno);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Object[] fila = {
                    rs.getInt("idAlumno"),
                    rs.getString("apellido"),
                    rs.getString("nombre"),
                    rs.getBoolean("estado"),};
                modelo.addRow(fila);
            }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Error al listar alumnos: " + e.getMessage());
        }

    }
}
