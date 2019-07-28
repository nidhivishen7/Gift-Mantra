package exam.hello;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class orders {
	@Id
	private int orderID;
	private int userID, orderQuantity;
	private float orderAmount;
	public orders() {
	}
	public orders(int orderID, int userID, int orderQuantity, float orderAmount) {
		super();
		this.orderID = orderID;
		this.userID = userID;
		this.orderQuantity = orderQuantity;
		this.orderAmount = orderAmount;
	}
	public int getOrderID() {
		return orderID;
	}
	public void setOrderID(int orderID) {
		this.orderID = orderID;
	}
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	public int getOrderQuantity() {
		return orderQuantity;
	}
	public void setOrderQuantity(int orderQuantity) {
		this.orderQuantity = orderQuantity;
	}
	public float getOrderAmount() {
		return orderAmount;
	}
	public void setOrderAmount(float orderAmount) {
		this.orderAmount = orderAmount;
	}
	@Override
	public String toString() {
		return "orders [orderID=" + orderID + ", userID=" + userID + ", orderQuantity=" + orderQuantity
				+ ", orderAmount=" + orderAmount + "]";
	}
	
	
}
