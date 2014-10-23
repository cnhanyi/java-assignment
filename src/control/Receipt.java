/**
 * 
 */
package control;

import java.util.ArrayList;

/**
 * @author lsong
 *
 */
public class Receipt {
	private int receiptID;
	private String issueDate;
	private ArrayList<Record> records;
	
	public Receipt() {
		// TODO Auto-generated constructor stub
	}

	public Receipt(int receiptID, String issueDate) {
		super();
		this.receiptID = receiptID;
		this.issueDate = issueDate;
		this.records = new ArrayList<Record>();
	}

	/**
	 * @return the receiptID
	 */
	public int getReceiptID() {
		return receiptID;
	}

	/**
	 * @param receiptID the receiptID to set
	 */
	public void setReceiptID(int receiptID) {
		this.receiptID = receiptID;
	}

	/**
	 * @return the issueDate
	 */
	public String getIssueDate() {
		return issueDate;
	}

	/**
	 * @param issueDate the issueDate to set
	 */
	public void setIssueDate(String issueDate) {
		this.issueDate = issueDate;
	}

	/**
	 * @return the records
	 */
	public ArrayList<Record> getRecords() {
		return records;
	}

	/**
	 * @param records the records to set
	 */
	public void setRecords(ArrayList<Record> records) {
		this.records = records;
	}

	public void printReciept(){
		
	}
	
	public void createReciept(ArrayList<Record> records){
		
	}
	
	
}
