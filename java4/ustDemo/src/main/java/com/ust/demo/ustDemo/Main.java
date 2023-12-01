package com.ust.demo.ustDemo;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Hello world!
 *
 */
public class Main 
{
    public static void main( String[] args ) throws SQLException
    {
        //load the driver	(skip)
    	Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vishnu","root","");
    	Statement st = con.createStatement();
    	ResultSet rs = st.executeQuery("SELECT * FROM BRANCH");
    	while(rs.next())
    		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3));
    }
}
