
package bankease;


import java.sql.*;  

public class Conn{
    Connection c;
    Statement s;
    public Conn(){  
        try{  
            
            c =DriverManager.getConnection("jdbc:mysql:///bankmanagementsystem","root","123457");    
            s =c.createStatement(); 
           
          
            
        }catch(Exception e){ 
            e.printStackTrace();
        }  
    }  
}  