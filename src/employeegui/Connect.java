


package employeegui;

import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;




public class Connect {
    
    
    public static Connection connect() {
     
    try 
    {
    Class.forName("org.sqlite.JDBC");
    Connection con = DriverManager.getConnection("jdbc:sqlite:school");
    return con;
    } 
    
    catch (Exception e) 
    {
    JOptionPane.showMessageDialog(null, "cant connect to database");
    }
    
    return null;
   
    }
}
    

