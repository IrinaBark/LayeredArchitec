package by.itac.mylibrary.dao;

import by.itac.mylibrary.entity.Book;

public interface CRUDBookDAO {
	void save(Book book);
	void update(int id, Book book);
	void delete(Book book);
	void delete(int id);
	
	void updateStatus(int id, int newStatus);

}
