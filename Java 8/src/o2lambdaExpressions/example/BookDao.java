package o2lambdaExpressions.example;

import java.util.ArrayList;
import java.util.List;

public class BookDao {
	public List<Book> getBooks(){
	List<Book> list = new ArrayList<>();
	list.add(new Book(100,"java",500));
	list.add(new Book(200,"java selenium",380));
	list.add(new Book(300,"python",150));
	list.add(new Book(400,"java data science",560));
	list.add(new Book(500,"C++",600));
	return list;
	}

}
