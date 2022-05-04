package by.itac.mylibrary.dao;

import java.util.List;

import by.itac.mylibrary.entity.Book;

public interface FindBookDAO {
	
	Book find(int id);
	List<Book> findByTitle(String title);
	List<Book> findByAuthor(String author);

}
