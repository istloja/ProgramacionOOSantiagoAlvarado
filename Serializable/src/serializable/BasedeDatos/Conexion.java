package serializable.BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import serializable.Equipo;

public class Conexion {

    public void Conexion(String usuario, String clave) {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            System.out.println(poo.getCatalog());
            Statement s = poo.createStatement();//inicializamos consulta
            ResultSet resultado = s.executeQuery("select * from persona");
            while (resultado.next()) {
                System.out.println(resultado.getInt("idpersona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("cedula"));
            }

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public void escribir(String usuario, String clave, int idpersona, String nombre, String apellido, String cedula, int edad) throws SQLException {
        try {
            DriverManager.registerDriver(new org.gjt.mm.mysql.Driver());
            Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            PreparedStatement s = poo.prepareStatement("insert into persona values (?,?,?,?,?)");
            s.setInt(1, idpersona);
            s.setString(2, nombre);
            s.setString(3, apellido);
            s.setString(4, cedula);
            s.setInt(5, edad);
            s.executeUpdate();

        } catch (Exception e) {
            System.out.println(e);
        }

    }

    public static void main(String[] args) {
        Conexion db = new Conexion();
        db.Conexion("root", "root");
        try {
            db.escribir("root", "root", 12, "Miguel", "perez", "11037256", 21);
              db.escribir("root", "root", 13, "Juan", "Sanchez", "123936251", 12);
        } catch (SQLException ex) {
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
        }
    
                
                }
    
}
