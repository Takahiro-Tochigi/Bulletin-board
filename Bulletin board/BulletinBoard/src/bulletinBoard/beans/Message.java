package bulletinBoard.beans;

import java.io.Serializable;
import java.util.Date;

public class Message implements Serializable {
	private  static final long serialVersionUID = 1L;

	private int id ;
	private String subject;
	private String body;
	private String category;
	private int name_id;
	private Date insert_date;
	private Date update_date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public int getName_id() {
		return name_id;
	}
	public void setName_id(int name_id) {
		this.name_id = name_id;
	}
	public Date getInsertdate() {
		return insert_date;
	}
	public void setInsertdate(Date insertdate) {
		this.insert_date = insertdate;
	}
	public Date getUpdateDate() {
		return update_date;
	}
	public void setUpdateDate(Date updateDate) {
		this.update_date = updateDate;
	}
}

