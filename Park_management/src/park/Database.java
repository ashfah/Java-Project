/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package park;

/**
 *
 * @author User
 */
import java.sql.*;
public class Database {

   public String URL = "jdbc:sqlserver://localhost:1433; databaseName=park; user=sa; password=jotydiu143"; 
   public Connection con = null;
   public ResultSet rs = null;
   public PreparedStatement pst = null;
   
   public void connect() 
   {
       
       try {
           
           Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
           con = DriverManager.getConnection(URL);  
          
           
       } catch (ClassNotFoundException | SQLException e) {
           
           System.out.println(e);
       }
       
   }
   
   
           
}
