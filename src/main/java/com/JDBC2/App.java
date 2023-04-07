package com.JDBC2;
import java.sql.*;

/**
 * JDBC2 
 *
 */
public class App 
{
    public static void main( String[] args ) throws Exception
    {
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	String url="jdbc:mysql://localhost:3306/studentMS";
    	String username="root";
    	String password="123456";
    	
    	Connection con=DriverManager.getConnection(url,username,password);
    	Statement st=con.createStatement();
    	ResultSet rs=st.executeQuery("select * from studentd");
    	
    	while(rs.next()) {
    		String Studentdata=rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getInt(4);
    		System.out.println(Studentdata);
    	}
    	con.close();
    }
}
