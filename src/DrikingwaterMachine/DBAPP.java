package DrikingwaterMachine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAPP {
	public static   Connection conn;
	public static    Statement stmt;
	public DBAPP() throws SQLException{
		
	////////////////////////////db연동 ///////////////////////////////////
	/////////생성자로 만들어 dbapp객채 생성시 해당 url에 연결되도록함
	  String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
	    // 호스트명 임의지정 / 사용할 databases 명시 / ?타임존 에러 해결
	  String userID="hr"; 
	  String userPW="hr"; 
	  conn = DriverManager.getConnection(jdbcUrl, userID, userPW);
	  stmt = conn.createStatement();
	  
	   }
}
	

