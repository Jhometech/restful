package in.javahome.restful.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Repository;

import in.javahome.restful.pojo.Book;

@Repository
public class BookDAO {
	@Autowired
	private JdbcTemplate template;

	public void addBook(Book b) {
		String sql = "INSERT INTO BOOK_REST(ID,BOOK_NAME,AUTHOR_NAME,COST) VALUES(?,?,?,?)";
		template.update(sql, b.getId(), b.getBookName(), b.getAuthorName(), b.getCost());
	}
	
	public List<Book> findAll(){
		String sql = "SELECT * FROM BOOK_REST";
		return template.query(sql, new BookRowMapper());
	}
	
	class BookRowMapper implements RowMapper<Book>{

		public Book mapRow(ResultSet rs, int rowNum) throws SQLException {
			Book b = new Book();
			b.setId(rs.getInt("ID"));
			b.setAuthorName(rs.getString("AUTHOR_NAME"));
			b.setBookName(rs.getString("BOOK_NAME"));
			b.setCost(rs.getDouble("COST"));
			return b;
		}
		
	}
}
