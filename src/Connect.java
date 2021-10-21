import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class Connect {

    Connection con;
    
    public Connection connecting(){
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:3306/junglasql","root","");
        }catch(ClassNotFoundException | SQLException e){
            JOptionPane.showMessageDialog(null,"Error:"+e);
        }
         return con;   
    }

}