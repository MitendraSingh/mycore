import java.sql.*;

class MyInsert{

public static void main(String args[]){

try{

Class.forName("com.mysql.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst","root","root");
Statement stmt= con.createStatement();
ResultSet rs=stmt.executeQuery("Select * from emp");
while (rs.next()) {
System.out.println(rs.getInt(1));

System.out.println(rs.getString(2));

}

}
catch(Exception ex){

System.out.println(ex);
}

}
}

// C:\Program Files\Java\jdk1.8.0_101\jre\lib\ext   add jar file
