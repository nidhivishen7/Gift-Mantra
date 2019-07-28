package exam.hello;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class orderdetails {
	@Id
	private int detailsid;
	private int orderID, quantity, productID ;
	private String name;
	private float price;
	public orderdetails() {
	}
	public orderdetails(int detailsID, int orderID, int quantity, int productID, String name, float price) {
		super();
		this.detailsid = detailsID;
		this.orderID = orderID;
		this.quantity = quantity;
		this.productID = productID;
		this.name = name;
		this.price = price;
	}
	public int getDetailsID() {
		return detailsid;
	}
	public void setDetailsID(int detailsID) {
		this.detailsid = detailsID;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getProductID() {
		return productID;
	}
	public void setProductID(int productID) {
		this.productID = productID;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	@Override
	public String toString() {
		return "orderdetails [detailsID=" + detailsid + ", orderID=" + orderID + ", quantity=" + quantity
				+ ", productID=" + productID + ", name=" + name + ", price=" + price + "]";
	}
	
}
