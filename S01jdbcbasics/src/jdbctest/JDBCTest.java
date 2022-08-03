package jdbctest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JDBCTest
{
	
	public static void main(String args[])
	{
		readfromDB();
		//insertIntoDB();
		deleteFromDB();
		//updateDB();
	}
	private static void deleteFromDB() {
		// TODO Auto-generated method stub
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Dilip@520");
				Statement statement =connection.createStatement();) {
			int rowsDeleted=statement.executeUpdate("delete from account where accno=1");	
					System.out.println("number of rows deleted:"+rowsDeleted);
				} catch (SQLException e) 
				{	
					e.printStackTrace();
				}
	}
	private static void updateDB() {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Dilip@520");
				Statement statement =connection.createStatement();) {
			int rowsUpdated=statement.executeUpdate("update account set balance=15000 where accno=1");	
					System.out.println("number of rows Updated:"+rowsUpdated);
				} catch (SQLException e) 
				{	
					e.printStackTrace();
				}
		
	}
	private static void insertIntoDB() {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Dilip@520");
				Statement statement =connection.createStatement();) {
			int rowsInserted=statement.executeUpdate("insert into account values(4,'vidu','tal',3000)");	
					System.out.println("number of rows inserted:"+rowsInserted);
				} catch (SQLException e) 
				{	
					e.printStackTrace();
				}
				
				
		
	}
	private static void readfromDB() {
		try(Connection connection=DriverManager.getConnection("jdbc:mysql://localhost/mydb","root","Dilip@520");
				Statement statement =connection.createStatement();) {
					
					ResultSet resultSet=statement.executeQuery("select * from account");
					while(resultSet.next())
					{
						System.out.println(resultSet.getInt(1)+","+resultSet.getString(2)+","+resultSet.getString(3)+","+resultSet.getInt(4));
					}
				} catch (SQLException e) 
				{
					
					e.printStackTrace();
				}
				
				}
	
		
	
		
	}


