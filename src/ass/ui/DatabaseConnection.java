/**
 * 
 */
package ass.ui;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author lsong
 * 
 */
public class DatabaseConnection {
	private static final String DATABASENAME = "jdbc:sqlite:noName.s3db";
	private Connection conn;

	public DatabaseConnection() {
		super();
	}

	/**
	 * @return the conn
	 */
	public Connection getConn() {
		return conn;
	}

	/**
	 * @param conn
	 *            the conn to set
	 */
	public void setConn(Connection conn) {
		this.conn = conn;
	}

	public void openConn() {
		try {
			Class.forName("org.sqlite.JDBC");
			System.out.println(this.DATABASENAME);
			this.conn = DriverManager
					.getConnection(this.DATABASENAME);
			if (conn != null) {
				System.out.println("Connected to the database");
			} else {
				System.out.println("Database connection failed!");

			}
		} catch (ClassNotFoundException ex) {
			ex.printStackTrace();
		} catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void closeConn(){
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void readUser(){
		try {
			Statement stat = this.conn.createStatement();
			ResultSet rs = stat.executeQuery("select * from User;");
	        while (rs.next()) {
	            System.out.printf("%-5s%-15s%-15s%-15s%-15s%"
	            		+ "-15s%-15s%-15s%-15s%-15s%-15s\n",
	            		rs.getString("uID"), rs.getString("firstName"), rs.getString("lastName"),
	            		rs.getString("title"), rs.getString("phoneNumbers"), rs.getString("email"),
	            		rs.getString("address"), rs.getString("DOB"), rs.getString("username"),
	            		rs.getString("password"), rs.getString("userType"));
	        }
	        rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
