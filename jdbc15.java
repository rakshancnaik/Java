import java.sql.*;

class jdbc15
{
	public static void main(String args[]) throws SQLException
	{
		
		Connection con=null;
		PreparedStatement ps=null;
		try
		{
			Class.forName("com.mysql.jdbc.Driver");
			
			
			con=DriverManager.getConnection("jdbc:mysql://localhost:3306/first","root","root");
			ps=con.prepareStatement("insert into employee values(100,'yashika',3000.00,50000.00,11)");
		System.out.println("Connected");
		
		ps.executeUpdate();
		ps.close();
		ps=con.prepareStatement("select * from employee");
		
		ResultSet rs=ps.executeQuery();
		
			while(rs.next())
				{
					System.out.println(rs.getInt("eno"));
				System.out.println(rs.getString("ename"));
				System.out.println(rs.getFloat("salary"));
				
				}
		}
            catch(ClassNotFoundException se) 
		{
		System.out.println(se);
	
		}
		
		finally
		{
			con.setAutoCommit(false);
			con.commit();
		}
		}
	}
		
	



