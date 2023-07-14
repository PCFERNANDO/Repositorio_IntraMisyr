/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Other/File.java to edit this template
 */
package OtrosCodigos;
import java.sql.Connection;
import java.sql.DriverManager;     

/**
 *
 * @author ignacio
 */
public class ConexionMysql {

    /*defines clase*/
    Connection con;
    
    
    public Connection conectar(){
        try{
            /*Declaras la libreria para conexion*/
            Class.forName("com.mysql.cj.jdbc.Driver");
            /*Relacionas tu base de datos (En la nube o local)*/
            con =(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/pruebas", "root", "");
            /*Mensaje de conexion exitosa*/
            System.out.print("Conectado a la base de datos");
        
        }catch (Exception e){
             /*Mensaje de conexion Erronea*/
            System.err.println("Error de conecxionBd"+e);
        }
        return con;
    }
    public static void main(String args[]) {
        // TODO code application logic here
    }
}
