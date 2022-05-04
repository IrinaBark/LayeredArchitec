package by.itac.mylibrary.start;

import by.itac.mylibrary.entity.Book;
import by.itac.mylibrary.service.BookService;
import by.itac.mylibrary.service.ServiceProvider;

public class Main {

	public static void main(String[] args) {
		ServiceProvider provider = ServiceProvider.getInstance();
		
		BookService service = provider.getBookService();
		
		Book b1 = new Book(123, "Мы", "Евгений Замятин", 1920);
		Book b2 = new Book();
		
		service.save(b1);
		service.save(b2);

	}

}
