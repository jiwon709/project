package DrikingwaterMachine;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBAPP {
	public static   Connection conn;
	public static    Statement stmt;
	public DBAPP() throws SQLException{
		
	////////////////////////////db���� ///////////////////////////////////
	/////////�����ڷ� ����� dbapp��ä ������ �ش� url�� ����ǵ�����
	  String jdbcUrl="jdbc:oracle:thin:@localhost:1521:xe";
	    // ȣ��Ʈ�� �������� / ����� databases ��� / ?Ÿ���� ���� �ذ�
	  String userID="hr"; 
	  String userPW="hr"; 
	  conn = DriverManager.getConnection(jdbcUrl, userID, userPW);
	  stmt = conn.createStatement();
	  
	   }
}
	

