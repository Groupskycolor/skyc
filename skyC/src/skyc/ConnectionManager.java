/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package skyc;

/**
 *
 * @author aui12345678
 */
import java.sql.*;
   import java.util.*;


   public class ConnectionManager {

      static Connection con;
      static String url;
            
      public static Connection getConnection()
      {
        
         try
         {
             
             Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");	
		
      
            
            try
            {            	
              con = DriverManager.getConnection("jdbc:sqlserver://AUI12345678-PC\\SQLEXPRESS;user=root;password=123456;database=nasa");
		
                								
            // assuming your SQL Server's	username is "username"               
            // and password is "password"
                 
            }
            
            catch (SQLException ex)
            {
               ex.printStackTrace();
            }
         }

         catch(ClassNotFoundException e)
         {
            System.out.println(e);
         }

      return con;
}
   }

