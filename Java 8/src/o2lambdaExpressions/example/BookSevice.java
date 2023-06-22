package o2lambdaExpressions.example;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BookSevice {
	@SuppressWarnings("unchecked")
	public List<Book> getBooksInSortingOrder(){
		List<Book> list = new BookDao().getBooks();
		Collections.sort(list, (o1,o2)->{
			return o1.getName().compareTo(o2.getName());
		});
		return list;
	}

	
//	@Override
//	public int compareTo(BookSevice o) {
//		// TODO Auto-generated method stub
//		return 0;
//	}
}

//class MyComparator implements Comparator<Book>{
//
//	@Override
//	public int compare(Book o1, Book o2) {
//		return o2.getName().compareTo(o1.getName());
//	}
	
//}