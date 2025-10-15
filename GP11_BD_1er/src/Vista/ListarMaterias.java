package Vista;

import Modelo.Alumno;
import Persistencia.AlumnoData;
import Persistencia.Conexion;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ListarMaterias extends javax.swing.JInternalFrame {
    
    // AlumnoData Alumno1 = new AlumnoData(); esto es de la entrega 1

    public ListarMaterias() {
        initComponents();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ListadoDeMaterias = new javax.swing.JLabel();
        IDAlumno = new javax.swing.JLabel();
        Salir = new javax.swing.JButton();
        SPA = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        Tabla = new javax.swing.JTable();
        Contrasena = new javax.swing.JPasswordField();
        IdAlumnito = new javax.swing.JTextField();

        setMaximizable(true);
        setResizable(true);
        setAlignmentX(20.0F);
        setAlignmentY(20.0F);
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setPreferredSize(new java.awt.Dimension(420, 350));

        ListadoDeMaterias.setFont(new java.awt.Font("Segoe UI", 0, 24)); // NOI18N
        ListadoDeMaterias.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        ListadoDeMaterias.setText("Listado de Materias");

        IDAlumno.setText("ID del Alumno:");

        Salir.setText("Salir");
        Salir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SalirActionPerformed(evt);
            }
        });

        SPA.setText("(solo personal administrativo)");

        Tabla.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "ID Alumno", "Nombre", "Apellido", "ID Materia", "Materia"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane2.setViewportView(Tabla);

        Contrasena.setText("****");
        Contrasena.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ContrasenaMouseClicked(evt);
            }
        });

        IdAlumnito.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                IdAlumnitoKeyReleased(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(86, 86, 86)
                .addComponent(ListadoDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 415, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(IDAlumno)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(IdAlumnito))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(SPA, javax.swing.GroupLayout.PREFERRED_SIZE, 282, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Salir)
                                .addGap(12, 12, 12)))))
                .addGap(12, 12, 12))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ListadoDeMaterias, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(IDAlumno, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(IdAlumnito, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Contrasena, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Salir))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(SPA)
                .addContainerGap(18, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void SalirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SalirActionPerformed
        this.dispose();
    }//GEN-LAST:event_SalirActionPerformed

    private void IdAlumnitoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_IdAlumnitoKeyReleased
        
        if (!IdAlumnito.getText().isEmpty() && Contrasena.getText().equalsIgnoreCase("123")){
            listarMateriasPorAlumno(Integer.parseInt(IdAlumnito.getText()));
        }else {
            DefaultTableModel model = (DefaultTableModel) Tabla.getModel();
            model.setRowCount(0);
        }
    }//GEN-LAST:event_IdAlumnitoKeyReleased

    private void ContrasenaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ContrasenaMouseClicked
        Contrasena.setText("");
    }//GEN-LAST:event_ContrasenaMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField Contrasena;
    private javax.swing.JLabel IDAlumno;
    private javax.swing.JTextField IdAlumnito;
    private javax.swing.JLabel ListadoDeMaterias;
    private javax.swing.JLabel SPA;
    private javax.swing.JButton Salir;
    private javax.swing.JTable Tabla;
    private javax.swing.JScrollPane jScrollPane2;
    // End of variables declaration//GEN-END:variables

    private void listarMateriasPorAlumno(int idAlumno) {
    DefaultTableModel modelo = new DefaultTableModel();
    modelo.addColumn("ID Alumno");
    modelo.addColumn("Nombre");
    modelo.addColumn("Apellido");
    modelo.addColumn("ID Materia");
    modelo.addColumn("Materia");
    
    Tabla.setModel(modelo);
    
    String sql = "SELECT a.idAlumno, a.nombre, a.apellido, m.idMateria, m.nombre AS nombreMateria " +
             "FROM inscripcion i " +
             "JOIN alumno a ON i.idAlumno = a.idAlumno " +
             "JOIN materia m ON i.idMateria = m.idMateria " +
             "WHERE i.idAlumno = ? ";
        System.out.println("String");
    try (Connection con = Conexion.getConexion();
         PreparedStatement ps = con.prepareStatement(sql)) {
        
        ps.setInt(1, idAlumno);
        ResultSet rs = ps.executeQuery();
        while (rs.next()) {
            Object[] fila = {
                rs.getInt("idAlumno"),
                rs.getString("nombre"),
                rs.getString("apellido"),
                rs.getInt("idMateria"),
                rs.getString("nombreMateria")
            };
            modelo.addRow(fila);
        }
    } catch (SQLException e) {
        JOptionPane.showMessageDialog(this, "Error al listar materias: " + e.getMessage());
    }
}    
    



}
