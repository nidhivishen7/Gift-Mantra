package exam.hello;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class category {
	@Id
	private int categoryid;
	private String categoryName;
	public category() {
	
	}
	public category(int categoryID, String categoryName) {
		super();
		this.categoryid = categoryID;
		this.categoryName = categoryName;
	}
	public int getCategoryID() {
		return categoryid;
	}
	public void setCategoryID(int categoryID) {
		this.categoryid = categoryID;
	}
	public String getCategoryName() {
		return categoryName;
	}
	public void setCategoryName(String categoryName) {
		this.categoryName = categoryName;
	}
	@Override
	public String toString() {
		return "category [categoryID=" + categoryid + ", categoryName=" + categoryName + "]";
	}
	
}
