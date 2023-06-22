package o2lambdaExpressions.example;

public class Book {
	int id;
	String name;
	int pages;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPages() {
		return pages;
	}
	@Override
	public String toString() {
		return "Book [id=" + id + ", name=" + name + ", pages=" + pages + "]";
	}
	public void setPages(int pages) {
		this.pages = pages;
	}
	public Book(int id, String name, int pages) {
		super();
		this.id = id;
		this.name = name;
		this.pages = pages;
	}
	public Book() {
		super();
	}
	

}
