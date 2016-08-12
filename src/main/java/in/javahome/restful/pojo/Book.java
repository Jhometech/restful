package in.javahome.restful.pojo;

import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public class Book {
	private Integer id;
	private String bookName;
	private String authorName;
	private Double cost;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public Double getCost() {
		return cost;
	}

	public void setCost(Double cost) {
		this.cost = cost;
	}

}
