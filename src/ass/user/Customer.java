/**
 * 
 */
package ass.user;

import ass.ui.DBConection;

/**
 * @author lsong
 *
 */
public class Customer extends User {

	private double fine;
	/**
	 * 
	 */
	public Customer() {
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
	public Customer(int uID, String firstName, String lastName, String title,
			String phone, String email, String address, String dOB,
			String username, String password) {
		super(uID, firstName, lastName, title, phone, email, address, dOB,
				username, password);
		// TODO Auto-generated constructor stub
	}

	/* (non-Javadoc)
	 * @see ass.user.User#borrowBook()
	 */
	@Override
	public void borrowBook() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see ass.user.User#returnBook()
	 */
	@Override
	public void returnBook() {
		// TODO Auto-generated method stub

	}

	/* (non-Javadoc)
	 * @see ass.user.User#searchBook()
	 */


	/* (non-Javadoc)
	 * @see ass.user.User#login()
	 */
	@Override
	public boolean login() {
		// TODO Auto-generated method stub
		return false;
	}

	/* (non-Javadoc)
	 * @see ass.user.User#logoff()
	 */
	@Override
	public void logoff() {
		// TODO Auto-generated method stub

	}
	
	public void payFine(){
		this.fine = 0;
	}
	
	public void requestABook(){
		
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getuID()
	 */
	@Override
	public int getuID() {
		// TODO Auto-generated method stub
		return super.getuID();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getFirstName()
	 */
	@Override
	public String getFirstName() {
		// TODO Auto-generated method stub
		return super.getFirstName();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setFirstName(java.lang.String)
	 */
	@Override
	public void setFirstName(String firstName) {
		// TODO Auto-generated method stub
		super.setFirstName(firstName);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getLastName()
	 */
	@Override
	public String getLastName() {
		// TODO Auto-generated method stub
		return super.getLastName();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setLastName(java.lang.String)
	 */
	@Override
	public void setLastName(String lastName) {
		// TODO Auto-generated method stub
		super.setLastName(lastName);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getTitle()
	 */
	@Override
	public String getTitle() {
		// TODO Auto-generated method stub
		return super.getTitle();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setTitle(java.lang.String)
	 */
	@Override
	public void setTitle(String title) {
		// TODO Auto-generated method stub
		super.setTitle(title);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getPhone()
	 */
	@Override
	public String getPhone() {
		// TODO Auto-generated method stub
		return super.getPhone();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setPhone(java.lang.String)
	 */
	@Override
	public void setPhone(String phone) {
		// TODO Auto-generated method stub
		super.setPhone(phone);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getEmail()
	 */
	@Override
	public String getEmail() {
		// TODO Auto-generated method stub
		return super.getEmail();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setEmail(java.lang.String)
	 */
	@Override
	public void setEmail(String email) {
		// TODO Auto-generated method stub
		super.setEmail(email);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getAddress()
	 */
	@Override
	public String getAddress() {
		// TODO Auto-generated method stub
		return super.getAddress();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setAddress(java.lang.String)
	 */
	@Override
	public void setAddress(String address) {
		// TODO Auto-generated method stub
		super.setAddress(address);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getdOB()
	 */
	@Override
	public String getdOB() {
		// TODO Auto-generated method stub
		return super.getdOB();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setdOB(java.lang.String)
	 */
	@Override
	public void setdOB(String dOB) {
		// TODO Auto-generated method stub
		super.setdOB(dOB);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getUsername()
	 */
	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setUsername(java.lang.String)
	 */
	@Override
	public void setUsername(String username) {
		// TODO Auto-generated method stub
		super.setUsername(username);
	}

	/* (non-Javadoc)
	 * @see ass.user.User#getPassword()
	 */
	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	/* (non-Javadoc)
	 * @see ass.user.User#setPassword(java.lang.String)
	 */
	@Override
	public void setPassword(String password) {
		// TODO Auto-generated method stub
		super.setPassword(password);
	}

	public void setFine(double fine){
		this.fine = fine;
	}
	
	public double getFine(){
		return this.fine;
	}
	
	public void showMainWindow(){
		
		
	}

	
}
