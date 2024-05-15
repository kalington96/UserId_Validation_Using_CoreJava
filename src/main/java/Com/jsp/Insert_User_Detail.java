package Com.jsp;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import com.mysql.cj.xdevapi.PreparableStatement;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Insert_User_Detail {
	public static PreparedStatement v2;
	Scanner m=new Scanner(System.in);

	public Insert_User_Detail(Connection b) throws SQLException {
		 v2=b.prepareStatement("Insert Into User(Name,Email,PhoneNo,DateTime)values(?,?,?,?)");
		 System.out.println("Enter Name");
		 v2.setString(1,m.nextLine());
		 System.out.println("Enter Email");
		 class A
		 {
			 public void m1() throws SQLException
			 {
				String vj=m.next();
				Pattern pattern = Pattern.compile("[a-zA-Z][a-zA-Z0-9]*@[a-zA-Z]+[.]com"); 
				 Matcher m = pattern.matcher(vj);
				 if(m.matches())
				 {
					 v2.setString(2,vj);
					 System.out.println("Enter Phone No");
					 
				 }
				 else {
					 System.out.println("Enter Valid Email");
					 m1();
					 
				 }
					 
					 
				 
			 }
		 }A v21=new A();
		 v21.m1();
		 class D
		 {
			 public void m2() throws SQLException
			 {
				    String vj1=m.next();
					Pattern pattern = Pattern.compile("[6-9][0-9]{9}"); 
					Matcher m = pattern.matcher(vj1);
					 if(m.matches())
					 {
						 v2.setString(3,vj1);
					 }else
					 {
						 System.out.println("Enter Valid Phone No");
						 m2();
					 }
			 }
		 }D x=new D();
		 x.m2();
		 LocalDateTime myDateObj = LocalDateTime.now();
		 DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy HH:mm:ss");

		 String formattedDate = myDateObj.format(myFormatObj);
		 v2.setString(4,formattedDate);
		 v2.execute();
		 System.out.println("Registration will complete");
		 Fetch_Data n=new Fetch_Data(b);
		 
		 
	}

}