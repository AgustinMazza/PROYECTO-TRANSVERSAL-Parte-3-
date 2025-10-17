package Persistencia;

import Modelo.Inscripcion;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.HashSet;
import javax.swing.JOptionPane;

public class inscripcionData {

    private Connection con = null;

    public inscripcionData(){
        con = Conexion.getConexion();
    }
    
   

    public void guardarInscripcion(Inscripcion inscripcion) {

        String sql = "INSERT INTO inscripcion ( idInscripto, nota , idMateria, idAlumno) VALUES ( ? , ? , ? , ? )";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, inscripcion.getIdInscripto());
            ps.setDouble(2, inscripcion.getNota());
            ps.setInt(3, inscripcion.getIdMateria());
            ps.setInt(4, inscripcion.getIdAlumno());

            ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if (rs.next()) {
                inscripcion.setIdMateria(rs.getInt(1));
                JOptionPane.showMessageDialog(null, "Inscripcion agregada.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }

    }

    public void modificarInscripcion(Inscripcion inscripcion) {
        String sql = "UPDATE inscripcion SET nota=? ,idAlumno= ? ,idMateria= ?  WHERE idInscripto =? ";

        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setDouble(1, inscripcion.getNota());
            ps.setInt(2, inscripcion.getIdAlumno());
            ps.setInt(3, inscripcion.getIdMateria());
            ps.setInt(4, inscripcion.getIdInscripto());
            ps.executeUpdate();

            int n = ps.executeUpdate();
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Inscripcion modificada con exito.");
            }

            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }

    }

    public void dehabilitarInscripcion(int id) {
        String sql = "UPDATE materia SET estado = 0 WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int n = ps.executeUpdate();
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Materia deshabilitada con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");

        }
    }

    public Inscripcion buscarInscripcion(int id) {
        String sql = "SELECT nota, idAlumno , idMateria FROM inscripcion WHERE idInscripcion = ? ";

        Inscripcion inscripcion = null;
        try {

            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                inscripcion = new Inscripcion();
                inscripcion.setIdInscripto(id);
                inscripcion.setNota(rs.getDouble("Nota"));
                inscripcion.getIdAlumno();
                inscripcion.getIdMateria();

            } else {
                JOptionPane.showMessageDialog(null, "Inscripcion con id" + id + " no encontrado.");
            }
            ps.close();
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }

        return inscripcion;
    }

    public void habilitarInscripcion(int id) {
        String sql = "UPDATE materia SET estado = 1 WHERE idMateria = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            int n = ps.executeUpdate();
            if (n == 1) {
                JOptionPane.showMessageDialog(null, "Materia habilitada con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla materia.");
        }

    }

    public void cargarNota(int idMateria, int idAlumno, double nota) {

        String sql = "UPDATE inscripcion SET nota = ? WHERE idMateria = ? AND idAlumno = ?";

        try {
            
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setDouble(1, nota);
            ps.setInt(2, idMateria);
            ps.setInt(3, idAlumno);
            
            int n = ps.executeUpdate();
            if (n == 1) {
            
                JOptionPane.showMessageDialog(null, "Nota Cargada con exito.");
            }

        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null, "Error al acceder a la tabla inscripcion.");
        }

    }

}
