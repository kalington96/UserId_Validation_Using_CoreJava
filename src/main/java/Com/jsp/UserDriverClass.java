package Com.jsp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class UserDriverClass {
	public static void main(String[]args) throws ClassNotFoundException, SQLException
	{
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection b=DriverManager.getConnection("jdbc:mysql://localhost:3306/Login","root","Kalington@95");
		Insert_User_Detail v=new Insert_User_Detail(b);
	}

}
