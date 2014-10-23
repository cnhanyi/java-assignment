/**
 * 
 */
package ass.ui;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import ass.user.Admin;
import ass.user.Customer;
import ass.user.Receptionist;
import ass.user.User;

/**
 * @author lsong
 * 
 */
public class DBConection {
	private static final String DBNAME = "jdbc:sqlite:noName.s3db";
	private Connection conn;

	public DBConection() {
		super();
	}

	/**
	 * @return the customers
	 */

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
			this.conn = DriverManager.getConnection(this.DBNAME);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	public void closeConn() {
		try {
			this.conn.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public Object[][] listAllbooks() {
		String[][] data = new String[1][1];
		try {
			Statement sta = this.conn.createStatement();
			ResultSet rs = sta.executeQuery("select * from Book");
			int rowNum = 0;
			while (rs.next()) {
				rowNum++;
				
			}
			rs.close();
			ResultSet rs1 = sta.executeQuery("select * from Book");
			data = new String[rowNum][8];
			rs1 = sta.executeQuery("select * from Book");
			int rowNumC = 0;
			while (rs1.next()) {
				data[rowNumC][0] = rs1.getString(1);
				data[rowNumC][1] = rs1.getString(2);
				data[rowNumC][2] = rs1.getString(3);
				data[rowNumC][3] = rs1.getString(4);
				data[rowNumC][4] = rs1.getString(5);
				data[rowNumC][5] = rs1.getString(6);
				data[rowNumC][6] = rs1.getString(7);
				data[rowNumC][7] = rs1.getString(8);
				rowNumC++;
			}

			rs1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
	}

	public Object[][] searchBook(String criteria,String subString) {
		
				
		String[][] data = new String[1][1];
		try {
			Statement sta = this.conn.createStatement();
			String sql=null;
			switch(criteria){
			case "Title":
				sql = "select * from book where title like '%"+ subString + "%'";
			break;
				
			case "Author":
				sql = "select * from book where Author like '%"+ subString + "%'";
			break;
	        case "Publisher":
				sql = "select * from book where Publisher like '%"+ subString + "%'";		
	        break;            
	        default:
				sql = "select * from book where ISBN like '%"+ subString + "%'";
			}
			
			ResultSet rs = sta.executeQuery(sql);
			
			int rowNum = 0;
			while (rs.next()) {
				rowNum++;
				
			}
			rs.close();
//			ResultSet rs1 = sta.executeQuery("select * from Book");
			data = new String[rowNum][8];
			String sql1="";
			switch(criteria){
			
			case "Title":
				
				sql1 = "select * from book where title like '%"+ subString + "%'";
			break;
				
			case "Author":
				sql1 = "select * from book where Author like '%"+ subString + "%'";
			break;
	        case "Publisher":
				sql1 = "select * from book where Publisher like '%"+ subString + "%'";		
	        break;            
	        default:
				sql1 = "select * from book where ISBN like '%"+ subString + "%'";
			}
			ResultSet rs1 = sta.executeQuery(sql);
			
			int rowNumC = 0;
			while (rs1.next()) {
				data[rowNumC][0] = rs1.getString(1);
				data[rowNumC][1] = rs1.getString(2);
				data[rowNumC][2] = rs1.getString(3);
				data[rowNumC][3] = rs1.getString(4);
				data[rowNumC][4] = rs1.getString(5);
				data[rowNumC][5] = rs1.getString(6);
				data[rowNumC][6] = rs1.getString(7);
				data[rowNumC][7] = rs1.getString(8);
				rowNumC++;
			}

			rs1.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return data;
//		try {
//			Statement sta = this.conn.createStatement();
//			ResultSet rs = sta
//					.executeQuery("select * from book where title like '%"
//							+ subString + "%'");
//			while (rs.next()) {
//				System.out.printf("%-15s%-15s%-15s%-15s"
//						+ "%-15s%-15s%-15s%-15s\n", rs.getString(1),
//						rs.getString(2), rs.getString(3), rs.getString(4),
//						rs.getString(5), rs.getString(6), rs.getString(7),
//						rs.getString(8));
//			}
//			rs.close();
//		} catch (SQLException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
	}

	public void readData() {
		try {
			Statement sta = this.conn.createStatement();
			ResultSet rs = sta.executeQuery("select * from user");
			while (rs.next()) {
				System.out.printf("%-5s%-15s%-15s%-15s%-15s%-25s%-15s%"
						+ "-15s%-15s%-15s%-15s\n", rs.getString("userID"),
						rs.getString("firstName"), rs.getString("lastName"),
						rs.getString("title"), rs.getString("phoneNumber"),
						rs.getString("email"), rs.getString("address"),
						rs.getString("DOB"), rs.getString("userName"),
						rs.getString("password"), rs.getString("userType"));

			}
			rs.close();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addBook(double price, String bookStatus, 
			String ISBN, String title, String publisher,
			String author, String shopName) {
		try {
			Statement sta = this.conn.createStatement();
			ResultSet rs = sta.executeQuery("select * from Book");
			// I need take the last bookID
			int lastID = 0;
			while (rs.next()) {
				lastID = Integer.parseInt(rs.getString("bookID"));
			}
			rs.close();
			PreparedStatement statement = this.conn
					.prepareStatement("INSERT INTO Book (bookID,"
							+ "price,bookStatus,ISBN, title, publisher,"
							+ " author,shopName)VALUES(?,?,?,?,?,?,?,?)");
			statement.setInt(1, lastID + 1);
			statement.setDouble(2, price);
			statement.setString(3, bookStatus);
			statement.setString(4, ISBN);
			statement.setString(5, title);
			statement.setString(6, publisher);
			statement.setString(7, author);
			statement.setString(8, shopName);

			statement.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void modifyBook(String SelectedBookID, String price, 
			String ISBN, String title, String publisher,
			String author, String shopName) {
		try {
			Statement sta = this.conn.createStatement();
			String sql = "UPDATE Book SET "
						+ "price = " + price + ",ISBN=\'"+ISBN+"\', title=\'"+title+"\', publisher=\'"+publisher+"\',"
						+"author = \'"+author+"\',shopName = \'"+shopName+"\'"
						+ "WHERE bookID = "+SelectedBookID+"";	
						
			sta.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void deleteBook(String SelectedBookID) {
		try {
			Statement sta = this.conn.createStatement();
			String sql = "DELETE FROM Book WHERE bookID = "+SelectedBookID+"";						
			sta.executeUpdate(sql);
			
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void addNewUser() {

	}

	public User login(String username, String pwd) {

		try {
			Statement sta = this.conn.createStatement();
			ResultSet rs = sta.executeQuery("select * from User Where "
					+ "userName ='" + username + "' and password = '" + pwd
					+ "'");
			User newUser;
			while (rs.next()) {
				if (rs.getString(8).equalsIgnoreCase("cus")) {
					newUser = new Customer(rs.getInt(1), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7),
							rs.getString(9), rs.getString(10),
							rs.getString(11), rs.getString(2), rs.getString(3));
					return newUser;
				}
				if (rs.getString(8).equalsIgnoreCase("recptionist")) {
					newUser = new Receptionist(rs.getInt(1), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7),
							rs.getString(9), rs.getString(10),
							rs.getString(11), rs.getString(2), rs.getString(3));
					return newUser;
				}
				if (rs.getString(8).equalsIgnoreCase("Admin")) {
					newUser = new Admin(rs.getInt(1), rs.getString(4),
							rs.getString(5), rs.getString(6), rs.getString(7),
							rs.getString(9), rs.getString(10),
							rs.getString(11), rs.getString(2), rs.getString(3));
					return newUser;
				}

			}

			rs.close();

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;

	}

}
