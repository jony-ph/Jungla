import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.ParseException;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;
import java.util.*;
import java.text.SimpleDateFormat;

public class Querys {
       
    // Atributos
    private String query;
    private JTable tableSelected;
    
    private Main winMain = new Main();
    
    public Querys(String query){
        this.query = query;
    }
    
    public void create(JTextField... values){
  
        Pattern number = Pattern.compile("^([0-9])*$");
        Pattern date = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$");
        Pattern datetime = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})(\\s)([0-1][0-9]|2[0-3])(:)([0-5][0-9])$");
        
        try {
            
            PreparedStatement pstmt = winMain.connection().prepareStatement(this.query);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date fechaDate = null;
            
            int i = 0;
            for(JTextField val : values){
                
                i += 1;
                
                Matcher m = number.matcher(val.getText());
                boolean match = m.find();
                
                Matcher m2 = date.matcher(val.getText());
                boolean match2 = m2.find();
                
                Matcher m3 = datetime.matcher(val.getText());
                boolean match3 = m3.find();
                
                try{
                    
                    if(match){ 
                        pstmt.setInt(i, Integer.parseInt(val.getText()));
                    }  else if(match2){
                        
                        try {
                            fechaDate = (Date) formato.parse(val.getText());
                        } catch (ParseException ex) {
                            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        pstmt.setDate(i, fechaDate);
                    } else if(match3){
                        
                        try {
                            fechaDate = (Date) formato2.parse(val.getText());
                        } catch (ParseException ex) {
                            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        pstmt.setDate(i, fechaDate);
                    } else {
                        pstmt.setString(i, val.getText());
                    }

                }catch(java.lang.NumberFormatException ex){
                        pstmt.setString(i, val.getText());
                }

                
            }
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Se agregó a la tabla con éxito!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
          
    }
      
    public void read(String... values){
        
        DefaultTableModel jtable = new DefaultTableModel();
                
        for(String val : values){
            jtable.addColumn(val);
        }
        
        String[] data = new String[values.length];
        
        try{
            
            Statement stmt = winMain.connection().createStatement();
            ResultSet rs = stmt.executeQuery(this.query);
            
            while(rs.next()){
                
                for(int i=0; i < values.length; i++){
                    data[i]=rs.getString(i+1);
                }

                jtable.addRow(data);
                
            }
            
            
            this.getTableSelected().setModel(jtable);                  
            
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "Error: "+ e);
        }
        
    }
        
    public void update(JTextField... values){
        
Pattern number = Pattern.compile("^([0-9])*$");
        Pattern date = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})$");
        Pattern datetime = Pattern.compile("^([0-2][0-9]|3[0-1])(\\/|-)(0[1-9]|1[0-2])\\2(\\d{4})(\\s)([0-1][0-9]|2[0-3])(:)([0-5][0-9])$");
        
        try {
            
            PreparedStatement pstmt = winMain.connection().prepareStatement(this.query);
            SimpleDateFormat formato = new SimpleDateFormat("yyyy/MM/dd");
            SimpleDateFormat formato2 = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");
            Date fechaDate = null;
            
            int i = 0;
            for(JTextField val : values){
                
                val.setEnabled(true);
                
                i += 1;
                
                Matcher m = number.matcher(val.getText());
                boolean match = m.find();
                
                Matcher m2 = date.matcher(val.getText());
                boolean match2 = m2.find();
                
                Matcher m3 = datetime.matcher(val.getText());
                boolean match3 = m3.find();
                
                try{
                    
                    if(match){ 
                        pstmt.setInt(i, Integer.parseInt(val.getText()));
                    }  else if(match2){
                        
                        try {
                            fechaDate = (Date) formato.parse(val.getText());
                        } catch (ParseException ex) {
                            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        pstmt.setDate(i, fechaDate);
                    } else if(match3){
                        
                        try {
                            fechaDate = (Date) formato2.parse(val.getText());
                        } catch (ParseException ex) {
                            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        
                        pstmt.setDate(i, fechaDate);
                    } else {
                        pstmt.setString(i, val.getText());
                    }

                }catch(java.lang.NumberFormatException ex){
                        pstmt.setString(i, val.getText());
                }

                
            }
            
            pstmt.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Se modificó con éxito!");
            
            
        } catch (SQLException ex) {
            Logger.getLogger(Querys.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
        
    public void delete(JTextField value){
        
        int opcion = -1;
        opcion = JOptionPane.showConfirmDialog(null, "¿Realmente desea borrar el producto?", "Confirmar borrado", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        
        if (opcion == 0) {
            
            try {

                PreparedStatement pstmt = winMain.connection().prepareStatement(this.query);
                pstmt.setInt(1, Integer.parseInt(value.getText()));
                pstmt.executeUpdate();
                JOptionPane.showMessageDialog(null, "¡Se eliminó con éxito!");
            } catch (Exception e) {
                System.out.println("Error" + e);
            }
            
        }
        
    }
    
    
    // Getters y Setters

    public JTable getTableSelected() {
        return tableSelected;
    }

    public void setTableSelected(JTable tableSelected) {
        this.tableSelected = tableSelected;
    }
    
}
