package bootcamp;

public class Item {
private String item;
private String description;


public Item(String item, String description) {
	this.setItem(item);
	this.setDescription(description);
	
}


public String getItem() {
	return item;
}


public void setItem(String item) {
	this.item = item;
}


public String getDescription() {
	return description;
}


public void setDescription(String description) {
	this.description = description;
}
public String toString() {
	return item + ":" + description;
}
}
