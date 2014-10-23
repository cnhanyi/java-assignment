/**
 * 
 */
package ass.user;

import ass.ui.AdminWindow;
import ass.ui.DBConection;

/**
 * @author lsong
 * 
 */
public class Admin extends User {

	/**
	 * 
	 */
	public Admin() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param uID
	 * @param firstName
	 * @param lastName
	 * @param title
	 * @param phone
	 * @param email
	 * @param address
	 * @param dOB
	 * @param username
	 * @param password
	 */
	public Admin(int uID, String firstName, String lastName, String title,
			String phone, String email, String address, String dOB,
			String username, String password) {
		super(uID, firstName, lastName, title, phone, email, address, dOB,
				username, password);
		// TODO Auto-generated constructor stub
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ass.user.User#borrowBook()
	 */
	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ass.user.User#returnBook()
	 */
	@Override
	public void returnBook() {
		// TODO Auto-generated method stub

	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ass.user.User#searchBook()
	 */


	/*
	 * (non-Javadoc)
	 * 
	 * @see ass.user.User#login()
	 */
	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see ass.user.User#logoff()
	 */
	@Override
	public void logoff() {
		// TODO Auto-generated method stub

	}

	public void deleteCustomer(int CusID) {

	}

	public void deleteReceptionist(int recptionistID) {

	}


	public void addABook(double price,String bookStatus, String ISBN, String title,
			String publisher,  String shopName, String author) {
	    DBConection db = new DBConection();
	    db.openConn();
	    db.addBook(price, bookStatus, ISBN, title, publisher, author, shopName);
	    db.closeConn();
	}
	
	public void addReceptionist(){
		
	}
	
	public void addCustomer(){
		
	}

	public void takeFine(int CusID){
		
	}
	
	public void updateCustomerInfo(){
		
	}
	
	public void updateReceptionistInfo(){
		
	}
	
	public void updateBookStatus(){
		
	}
	
	public void readCusInfo() {

	}
	
	public void readReceptionistInfo() {

	}
	
	public void printReciept(){
		
	}
	
	public void showMainWindow(){
		AdminWindow window = new AdminWindow();
		window.setVisible(true);
		
	}
}

