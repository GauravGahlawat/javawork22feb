import java.sql.*;

public class DemoTransaction {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		

			Connection con;
			Statement stmt;
			ResultSet rs;
			Class.forName("com.mysql.cj.jdbc.Driver");     //forName is for registering the driver
			con = DriverManager.getConnection("jdbc:mysql://localhost:3307/mysqljdbc","root","gaurav1997TISHA");
			stmt = con.createStatement();
			System.out.println("Driver is loaded");
			con.setAutoCommit(false);
			try
			{
				int i1 = stmt.executeUpdate("insert into candidate_skills values(101,3)");
				int i2 = stmt.executeUpdate("update skills set name='Ruby' where id=8");
				int i3 = stmt.executeUpdate("delete from candidates where id=0");
				con.commit();
				System.out.println("Transactions is successfull");
				
			}
			catch(Exception e)
			{
				try
				{
					con.rollback();
					System.out.println("transactions failed");
				}
				catch(Exception ex)
				{
					System.out.println(ex);
				}
				stmt.close();
				con.close();
				System.out.println("connection is closed");
			}

	}

}
