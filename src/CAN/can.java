package CAN;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import DrikingwaterMachine.DBAPP;
import DrikingwaterMachine.DrikingwaterMachineADMIN;
/////////////////////////////////can 테이블 가져오기 /////////////////////////////////////////
public class can {
	public can(){
		 try{  
		    new DBAPP(); 
		    canshow();
	  	    	 
	  	    	   
	 
	  	  DBAPP.stmt.close();  
	  	  DBAPP.conn.close(); 
	    
	    } catch ( SQLException  e ) {
	  	  System.err.println("DB Error" + e.getMessage());     
	  	  return; 
	  	  }
		
	}

  public static void canshow() throws SQLException {
	  
	  ResultSet rs;     
	  String sql;

 
    sql =    "SELECT * from cantable"; 
	    rs = DBAPP.stmt.executeQuery( sql ); 
	    while (rs.next()){  

	    	String name = rs.getString("canname");
	    	String number= rs.getString("cannumber");
	    	String moeney  = rs.getString("canmoney"); 
	    
	    	String[] add={name,number,moeney};//추가할 데이터
	    	DrikingwaterMachineADMIN.model.addRow(add);//


}
  }
}



