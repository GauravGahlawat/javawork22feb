
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class BatchDemo {
	Connection con;
	Statement stmt;
	ResultSet rs;
	BatchDemo()
	{
	}
	void createConnection()
	{
		try
		{
			Class.forName("com.mysql.cj.jdbc.Driver");     //forName is for registering the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","gaurav1997TISHA");
			stmt = con.createStatement();
		}catch(Exception e)
		{
			System.out.println(e);
		}
	}
	// create batch
	void createBatch() throws SQLException 
	{

		try
		{
			// one will execute if other fails but if all three failed throws an error
		stmt.addBatch("insert into skills(name) values('Spring')");
		stmt.addBatch("update skills set name='Web App' where id=6");
		stmt.addBatch("delete from skills where id=7");
		
		con.setAutoCommit(false);
		
			int i[] = stmt.executeBatch();
			con.commit();
			System.out.println("batch is sucessfully executed");
		}
		catch(Exception e)
		{
				con.rollback();
				System.out.println("batch is failed");
		}
		
	}

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
		
		BatchDemo bd = new BatchDemo();
		bd.createConnection();
		bd.createBatch();

	}

}
