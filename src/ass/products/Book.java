package ass.products;

public class Book {
	private int bookID;
	private double price;
	private String bookStatus;
	private String ISBN;
	private String title;
	private String publisher;
	private String shopName;
	private String author;


	public Book() {
		super();
	}

	public Book(int bookID, double price,String bookStatus, String ISBN, String title,
			String publisher,  String shopName, String author) {
		super();
		this.bookID = bookID;
		this.price = price;
		this.bookStatus = bookStatus;
		this.ISBN = ISBN;
		this.title = title;
		this.publisher = publisher;
		this.author = author;
		this.shopName = shopName;
	}




public int getBookID() {
		return bookID;
	}

	public void setBookID(int bookID) {
		this.bookID = bookID;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public String getBookStatus() {
		return bookStatus;
	}

	public void setBookStatus(String bookStatus) {
		this.bookStatus = bookStatus;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}

	public String getShopName() {
		return shopName;
	}

	public void setShopName(String shopName) {
		this.shopName = shopName;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

/**
 * Method addAbook is to add a book to system by admin
 * @param bookID
 * @param sn
 * @param title
 * @param author
 * @param publisher
 * @param pages
 * @param price
 */
	public void addAbook(int bookID, double price,String bookStatus, String ISBN, String title,
			String publisher,  String shopName, String author) {
	
		this.bookID = bookID;
		this.price = price;
		this.bookStatus = bookStatus;
		this.ISBN = ISBN;
		this.title = title;
		this.publisher = publisher;
		this.shopName = shopName;
		this.author = author;

	}


}
