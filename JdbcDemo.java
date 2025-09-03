import java.sql.*;

public class JdbcDemo
public static void main(string args[])
{
  try{
   DriverManager.registerDriver(new sun.jdbc.odbc.JdbcOdbcDriver());
   System.out.println("Driver loaded");
   String url="jdbc:odbc:MSBTE";
   Connection cn=DriverManager.grtConnection(url);
   System.out.println("Connection to the database created");
   Statement st=cn.createStatement();
   String str="select * from stud1";
   ResultSet rs=st.executeQuery(str);
   String text=" ";
   System.out.println("Roll Number \t Name");
   while(rs.next())
   {
      text=text+rs.getInt(1)+"\t"+rs.getString(2)+"\n";
	  
   }
   
   System.out.print(text);
   st.close();
   cn.close();
  }
  catch(SQLExccpt.ion s)
  {
	  System.out.println("sql error");
	  }
}
