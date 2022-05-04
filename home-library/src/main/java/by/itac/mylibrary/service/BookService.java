package by.itac.mylibrary.service;

import by.itac.mylibrary.entity.Book;

public interface BookService {
	
	void save(Book book);
	Book findByID(int id);

}
