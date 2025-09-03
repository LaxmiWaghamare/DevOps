//WAP to insert records into database table
import java.sql.*;
class InsertRecordIntoTable
{
	public static void main(String args[])throws SQLException,ClassNotFoundException
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		System.out.println("Driver Register Successfully...!!!");
		
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE", "system", "system");
		System.out.println("Database Connection established Successfully...!!!");
		
		Statement stmt=con.createStatement();
		int x=stmt.executeUpdate("insert into vjtech values(4040,'vishal',88)");
		System.out.println("No of Rows Inserted into table:"+x);
		con.close();
	}
}