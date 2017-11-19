import java.sql.*;
class MyCo
{
public static void main(String arg[])
{
try
{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myFirst","root","root");
Statement pst=con.createStatement();
String sql="insert into emp values(2,'Nishant')";
pst.executeUpdate(sql);
System.out.println("insert sucessfully");

}
catch(Exception ee)
{
System.out.println(ee);
}

}
}