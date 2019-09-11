
package serializable.BasedeDatos;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class Conexion {
    public void Conexion (String usuario,String clave){
        try{
        DriverManager.registerDriver(new org.gjt.mm.mysql.Driver()); 
        Connection poo = DriverManager.getConnection("jdbc:mysql://localhost/futbol_db", usuario, clave);
            System.out.println(poo.getCatalog());
            Statement s=poo.createStatement();//inicializamos consulta
            ResultSet resultado = s.executeQuery("select * from persona");
            while (resultado.next()){
                System.out.println(resultado.getInt("idpersona"));
                System.out.println(resultado.getString("nombre"));
                System.out.println(resultado.getString("apellido"));
                System.out.println(resultado.getString("cedula"));
            }
            
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
    public static void main(String[] args) {
        Conexion db=new Conexion ();
        db.Conexion("root","root");
    }
}
