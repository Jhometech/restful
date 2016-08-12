package in.javahome.restful.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import in.javahome.restful.dao.BookDAO;
import in.javahome.restful.pojo.Book;

@RestController
public class BookController {
	@Autowired
	private BookDAO bookDao;

	@RequestMapping(value = "/book", method = RequestMethod.PUT)
	public String addBook(@RequestBody Book b) {
		bookDao.addBook(b);
		return "Book added into inventry";
	}

	@RequestMapping(value = "/books", method = RequestMethod.GET, 
			produces = { "application/json", "application/xml"})
	public Book getAllBooks() {
		return bookDao.findAll().get(0);
	}
}
