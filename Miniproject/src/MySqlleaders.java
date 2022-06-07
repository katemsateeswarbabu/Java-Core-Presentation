import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class MySqlleaders {

	public static void main(String[] args) throws ClassNotFoundException, SQLException 
	{
		MySqlleaders n=new MySqlleaders();
		Scanner sc=new Scanner(System.in);
		while(true)
		{
			System.out.println();
		System.out.println("enter the number which u want to execute.");
		System.out.println();
		System.out.println("1.Create.");
		System.out.println("2.Read.");
		System.out.println("3.Update.");
		System.out.println("4.Delete.");
		System.out.println("5.Exit.");
		System.out.println();
		int num=sc.nextInt();
		switch(num)
		{
		case 1: n.Create();
		break;
		case 2: n.Read();
		break;
		case 3: n.Update();
		break;
		case 4: n.Delete();
		break;
		case 5: System.out.print("exited");
		System.exit(0);
		default: System.out.println("Invalid-enter btw 1 to 4 only");
		}
	}
	}
	public void Create() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/satideveloper","root","Sateeswarbabukatem@143");
		Statement st=con.createStatement();
		System.out.println("Before Creating");
		System.out.println();
		ResultSet rs=st.executeQuery("select * from Employees");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
		st.executeUpdate("insert into Employees values(6,'poojith','vijayawada',200000,23,'2000-05-05');");
		System.out.println();
		System.out.println("After Creating");
		System.out.println();
		ResultSet rs1=st.executeQuery("select * from Employees");
		while(rs1.next())
		{
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6));
		}
	}
	
	public void Read() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/satideveloper","root","Sateeswarbabukatem@143");
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employees");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
	}
	
	public void Update() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/satideveloper","root","Sateeswarbabukatem@143");
		Statement st=con.createStatement();
		System.out.println("Before Update");
		System.out.println();
		ResultSet rs=st.executeQuery("select * from Employees");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
		System.out.println();
		st.executeUpdate("update Employees set name='sateewarbabu' where id=3;");
		System.out.println();
		System.out.println("After Update");
		System.out.println();
		ResultSet rs1=st.executeQuery("select * from Employees");
		while(rs1.next())
		{
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6));
		}
	}

	public void Delete() throws ClassNotFoundException, SQLException
	{
		//Class.forName("com.mysql.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/satideveloper","root","Sateeswarbabukatem@143");
		Statement st=con.createStatement();
		System.out.println("Before Delete");
		System.out.println();
		ResultSet rs=st.executeQuery("select * from Employees");
		while(rs.next())
		{
		System.out.println(rs.getString(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getString(5)+"\t"+rs.getString(6));
		}
		st.executeUpdate("delete from Employees where id=6");
		System.out.println();
		System.out.println("After Delete");
		System.out.println();
		ResultSet rs1=st.executeQuery("select * from Employees");
		while(rs1.next())
		{
		System.out.println(rs1.getString(1)+"\t"+rs1.getString(2)+"\t"+rs1.getString(3)+"\t"+rs1.getString(4)+"\t"+rs1.getString(5)+"\t"+rs1.getString(6));
		}
	}
}
