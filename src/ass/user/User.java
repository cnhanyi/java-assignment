package ass.user;

import ass.ui.DBConection;
import javax.swing.JTable;



public abstract class User {
	private int uID;
	private String firstName;
	private String lastName;
	private String title;
	private String phone;
	private String email;
	private String address;
	private String dOB;
	private String username;
	private String password;
	
	
	
	public User() {
		super();
	}



	public User(int uID, String firstName, String lastName, String title,
			String phone, String email, String address, String dOB,
			String username, String password) {
		super();
		this.uID = uID;
		this.firstName = firstName;
		this.lastName = lastName;
		this.title = title;
		this.phone = phone;
		this.email = email;
		this.address = address;
		this.dOB = dOB;
		this.username = username;
		this.password = password;
	}
	
	public int getuID() {
		return uID;
	}


	public String getFirstName() {
		return firstName;
	}



	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	public String getLastName() {
		return lastName;
	}



	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	public String getTitle() {
		return title;
	}



	public void setTitle(String title) {
		this.title = title;
	}



	public String getPhone() {
		return phone;
	}



	public void setPhone(String phone) {
		this.phone = phone;
	}



	public String getEmail() {
		return email;
	}



	public void setEmail(String email) {
		this.email = email;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getdOB() {
		return dOB;
	}



	public void setdOB(String dOB) {
		this.dOB = dOB;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}


	public void viewAllBooks(){
		DBConection db = new DBConection();
		db.openConn();
		db.listAllbooks();
		db.closeConn();
	}

	public JTable listAllBook(){
		
		String[] columnNames = {"BookID",
                "Price",
                "BookStatus",
                "ISBN",                
                "Title", 
                "Publisher",
                "Author",
                "ShopName"
                };
		DBConection db = new DBConection();
		db.openConn();
		Object[][] data = db.listAllbooks();
		db.closeConn();
		return new JTable(data, columnNames);
	}

	public JTable searchBook(String criteria,String subString) {
		// TODO Auto-generated method stub
		String[] columnNames = {"BookID",
                "Price",
                "BookStatus",
                "ISBN",                
                "Title", 
                "Publisher",
                "Author",
                "ShopName"
                };
		DBConection db = new DBConection();
		db.openConn();
		Object[][] data = db.searchBook(criteria,subString);;
		db.closeConn();
		return new JTable(data, columnNames);
	}
	public abstract void borrowBook();
	public abstract void returnBook();
	public abstract boolean login();
	public abstract void logoff();
	
}

