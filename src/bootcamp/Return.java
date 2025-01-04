package bootcamp;

public class Return {
	private String item;
	private double changeBack;
	
	public Return(String item, double changeBack) {
		this.setItem(item);
		this.setChangeBack(changeBack);
		
}
	public String getItem() {
		return item;
	}
	public void setItem(String item) {
		this.item = item;
	}
	public double getChangeBack() {
		return changeBack;
	}
	public void setChangeBack(double changeBack) {
		this.changeBack = changeBack;
	}
	public String toString() {
		return "Returned Item: " + item + " change : $" + changeBack;
	}
}
