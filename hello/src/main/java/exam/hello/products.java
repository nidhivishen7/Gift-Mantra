package exam.hello;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class products {
	@Id
	private int productID;
	private int categoryID;
	private String productName, productDesc, productShortDesc, productLongDesc;
	private float productPrice;
	public products() {
	
	}
	
	
	public products(int productID, int categoryID, String productName, String productDesc, String productShortDesc,
			String productLongDesc, float price) {
		super();
		this.productID = productID;
		this.categoryID = categoryID;
		this.productName = productName;
		this.productDesc = productDesc;
		this.productShortDesc = productShortDesc;
		this.productLongDesc = productLongDesc;
		this.productPrice = price;
	}


	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public int getCategoryID() {
		return categoryID;
	}
	public void setCategoryID(int categoryID) {
		this.categoryID = categoryID;
	}
	public String getProductName() {
		return productName;
	}
	public void setProductName(String productName) {
		this.productName = productName;
	}
	public String getProductDesc() {
		return productDesc;
	}
	public void setProductDesc(String productDesc) {
		this.productDesc = productDesc;
	}
	public String getProductShortDesc() {
		return productShortDesc;
	}
	public void setProductShortDesc(String productShortDesc) {
		this.productShortDesc = productShortDesc;
	}
	public String getProductLongDesc() {
		return productLongDesc;
	}
	public void setProductLongDesc(String productLongDesc) {
		this.productLongDesc = productLongDesc;
	}
	public float getPrice() {
		return productPrice;
	}
	public void setPrice(float price) {
		this.productPrice = price;
	}


	@Override
	public String toString() {
		return "products [productID=" + productID + ", categoryID=" + categoryID + ", productName=" + productName
				+ ", productDesc=" + productDesc + ", productShortDesc=" + productShortDesc + ", productLongDesc="
				+ productLongDesc + ", price=" + productPrice + "]";
	}


	
	
	
}
