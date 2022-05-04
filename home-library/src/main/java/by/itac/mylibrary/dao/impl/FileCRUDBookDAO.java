package by.itac.mylibrary.dao.impl;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import by.itac.mylibrary.dao.CRUDBookDAO;
import by.itac.mylibrary.entity.Book;

public class FileCRUDBookDAO implements CRUDBookDAO{

	public void save(Book book) {
		
		File file = new File ("./src/main/resources/db-home-library.txt");
		
		String separator = "__ __";
		
		try (FileWriter fileWriter = new FileWriter(file, true)) {
			
			fileWriter.write(book.getId() + separator);
			fileWriter.write(book.getAuthor() + separator);
			fileWriter.write(book.getTitle() + separator);
			fileWriter.write(book.getYear() + System.lineSeparator());
			fileWriter.close();

		} catch (IOException e) {
			System.out.println(e.getMessage());
			e.printStackTrace();
		}
		
	}

	public void update(int id, Book book) {
		// TODO Auto-generated method stub
		
	}

	public void delete(Book book) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int id) {
		// TODO Auto-generated method stub
		
	}

	public void updateStatus(int id, int newStatus) {
		// TODO Auto-generated method stub
		
	}

}
