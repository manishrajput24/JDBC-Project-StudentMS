package com.JDBC2;
import java.sql.*;
import java.util.Scanner;

public class adduser {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);

		Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/studentms";
    	String username="root";
    	String password="123456";
    	
    	Connection con=DriverManager.getConnection(url,username,password);
    	System.out.println("********Add Your Student to DB**********");
    	System.out.println("Enter Stubent No");
    	int mid=scan.nextInt();
    	System.out.println("Enter Student Name");
    	scan.nextLine();
    	String sname=scan.nextLine();
    	System.out.println("Enter Student Class");
    	String sclass=scan.nextLine();
    	System.out.println("Enter Student Marks");
		int smark=scan.nextInt();
		
		String query="insert into studentd values( ?,?,?,?)";
		
		PreparedStatement pst=con.prepareStatement(query);
		pst.setInt(1, mid);
		pst.setString(2,sname);
		pst.setString(3,sclass);
		pst.setInt(4, smark);
		
		int count=pst.executeUpdate();
		System.out.println(count+" row(s) effected");
		
		con.close();
		scan.close();

	}

}
