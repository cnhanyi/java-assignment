/**
 * 
 */
package control;

/**
 * @author lsong
 *
 */
public class Record {
	private int uID;
	private int bookID;
	private int recordID;
	private String borrowDate;
	private String expiryDate;
	private String returnDate;
	
	
	public Record() {
		super();
	}

	public Record(int uID, int bookID, int recordID, String borrowDate,
			String expiryDate, String returnDate) {
		super();
		this.uID = uID;
		this.bookID = bookID;
		this.recordID = recordID;
		this.borrowDate = borrowDate;
		this.expiryDate = expiryDate;
		this.returnDate = returnDate;
	}

	/**
	 * @return the uID
	 */
	public int getuID() {
		return uID;
	}

	/**
	 * @param uID the uID to set
	 */
	public void setuID(int uID) {
		this.uID = uID;
	}

	/**
	 * @return the bookID
	 */
	public int getBookID() {
		return bookID;
	}

	/**
	 * @param bookID the bookID to set
	 */
	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	/**
	 * @return the recordID
	 */
	public int getRecordID() {
		return recordID;
	}

	/**
	 * @param recordID the recordID to set
	 */
	public void setRecordID(int recordID) {
		this.recordID = recordID;
	}

	/**
	 * @return the borrowDate
	 */
	public String getBorrowDate() {
		return borrowDate;
	}

	/**
	 * @param borrowDate the borrowDate to set
	 */
	public void setBorrowDate(String borrowDate) {
		this.borrowDate = borrowDate;
	}

	/**
	 * @return the expiryDate
	 */
	public String getExpiryDate() {
		return expiryDate;
	}

	/**
	 * @param expiryDate the expiryDate to set
	 */
	public void setExpiryDate(String expiryDate) {
		this.expiryDate = expiryDate;
	}

	/**
	 * @return the returnDate
	 */
	public String getReturnDate() {
		return returnDate;
	}

	/**
	 * @param returnDate the returnDate to set
	 */
	public void setReturnDate(String returnDate) {
		this.returnDate = returnDate;
	}
	
	public void updateBookStatus(){
		
	}
	
	
	
}
