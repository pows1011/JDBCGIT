package vo;

public class BookVO {
	private String id;
	private String author;
	private String title;
	private String publisher;
	private int price;
		
	public BookVO() {
		super();
	}

	public BookVO(String id, String author, String title, String publisher, int price) {
		super();
		this.id = id;
		this.author = author;
		this.title = title;
		this.publisher = publisher;
		this.price = price;
	}



	public String getId() {
		return id;
	}



	public void setId(String id) {
		this.id = id;
	}



	public String getAuthor() {
		return author;
	}



	public void setAuthor(String author) {
		this.author = author;
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



	public int getPrice() {
		return price;
	}



	public void setPrice(int price) {
		this.price = price;
	}


	@Override
	public String toString() {
		return "BookVO [id=" + id + ", author=" + author + ", title=" + title + ", publisher=" + publisher + ", price="
				+ price + "]";
	}
	
	
	
}	
