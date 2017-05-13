package com.th.kingpower.bw;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import com.th.kingpower.bw.entity.Airline;
/**
 * @author torgan.p 24 เม.ย. 2560 17:52:36
 *
 */
public class ApplicationMain {

    /**
     * @param args
     */
    public static void main(String[] args) {
	// TODO Auto-generated method stub
	
	 Connection connection = null;
	      try {                  
	         connection = DriverManager.getConnection("jdbc:sap://142.1.10.130:30115?reconnect=true&timeout=0","MOTIF", "@Motif2016");                  
	      } catch (SQLException e) {
	         System.err.println("Connection Failed. User/Passwd Error?"+e.getMessage());
	         return;
	      }
	      if (connection != null) {
	         try {
	            System.out.println("Connection to HANA successful!");
	            Statement stmt = connection.createStatement();

	            ResultSet resultSet = stmt.executeQuery("SELECT * FROM SAPBWD.\"/BIC/AZPOS_D0100\" WHERE \"/BIC/ZPASSPORT\"= 'G38644372'");

	           
	          
	            
//	            select * from SAPBWD.ASU/\\CONTENTNVT
	            
//	            "SCHEMA\".\"/BI0/TCUSTOMER"
	            
//	            resultSet.next();
//	            String hello = resultSet.getString(1);
//	            System.out.println(hello);
	            int i = 1;
	            while(resultSet.next()){
	        	 System.out.println(i);
	        	   String hello = resultSet.getString(i);
	        	   System.out.println(hello);
	        	  
	        	   i++;
	            }
	            System.out.println("finish");
	       } catch (SQLException e) {
	          System.err.println("Query failed!"+e.getMessage());
	       }
	     }

    }

}
