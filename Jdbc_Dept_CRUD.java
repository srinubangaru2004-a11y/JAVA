import java.sql.*;

class Jdbc_Dept_CRUD
{
	public static void main(String[] args)
	{

		Connection con = null;
		int res = 0;
		
		//JDBC Steps
		//1. Loading the Driver
		try 
		{
			Class.forName("com.mysql.cj.jdbc.Driver");
		}
		catch(ClassNotFoundException ce)
		{
			System.out.println("Exception: " + ce);
		}

		//2. Establishing the connection
		try
		{
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studdb", "root", "Mysql@12345");
		}
		catch(SQLException se)
		{
			System.out.println("Exception: " + se);
		}

		String query = "insert into studinfo values(2, 'maganti', 'M.Tech')";
		
		//3. Creating and executing a statement
		try
		{
			Statement st = con.createStatement();
			res = st.executeUpdate(query);
		}
		catch(SQLException se)
		{
			System.out.println("Exception: " + se);
		}

		
		//4. Getting Results
		if(res == 1)
			System.out.println("1 row inserted successfully");
		else
			System.out.println("Unsuccessful");

		//5. Closing connection
		try
		{
			con.close();
		}
		catch(SQLException se)
		{
			System.out.println("Exception: " + se);
		}

	}
}

//javac -cp ".;C:\java_programming\mysql-connector-j-8.0.33.jar" Jdbc_Dept_CRUD.java

//C:\java_programming>java -cp ".;C:\java_programming\mysql-connector-j-8.0.33.jar" Jdbc_Dept_CRUD