package by.itac.mylibrary.service.impl;

import by.itac.mylibrary.dao.CRUDBookDAO;
import by.itac.mylibrary.dao.DAOProvider;
import by.itac.mylibrary.entity.Book;
import by.itac.mylibrary.service.BookService;

public class BookServiceImpl implements BookService {

	public void save(Book book) {
		// 1 VALIDATION INPUT DATA
		
        if (book == null) {
        	throw new RuntimeException ("There is no book in the link");
        } else if (book.getTitle() == null || book.getTitle() == Book.getDefaultTitle()) {
			throw new RuntimeException("Book without title cannot be saved");
		} else if (book.getId() == Book.getDefaultId()) {
			throw new RuntimeException ("Book without id cannot be saved");
		} else if (book.getAuthor() == null) {
			throw new RuntimeException ("Book without author cannot be saved");
		} else if (book.getYear() == 0) {
			throw new RuntimeException ("Book without year of publishing cannot be saved");
		}
		
		DAOProvider provider = DAOProvider.getInstance();
		CRUDBookDAO dao = provider.getBookDAO();
		dao.save(book);

	}

	public Book findByID(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
