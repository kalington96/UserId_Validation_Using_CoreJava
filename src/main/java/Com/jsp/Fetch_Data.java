package Com.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;


public class Fetch_Data {
	public Fetch_Data( Connection v22) throws SQLException
	{
		Scanner c=new Scanner(System.in);
		System.out.println("Welcome to login page");
		PreparedStatement v2=v22.prepareStatement("select* from User where Email=? and PhoneNo=? ");
		System.out.println("Enter Register Email");
		v2.setString(1,c.next());
		System.out.println("Enter Register PhoneNo");
		v2.setString(2, c.next());
		if(v2.execute())
		{
			System.out.println("Wecome login page");
		}
		else System.out.println("go to resistration page");
	}
}
