package lamba;

public class customer {
private int id;
private String name;
private String product;
private String type;
public customer(int id, String name, String product, String type) {
	super();
	this.id = id;
	this.name = name;
	this.product = product;
	this.type = type;
}
public int getId() {
	return id;
}
public void setId(int id) {
	this.id = id;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getProduct() {
	return product;
}
public void setProduct(String product) {
	this.product = product;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
@Override
public String toString() {
	return "customer [id=" + id + ", name=" + name + ", product=" + product + ", type=" + type + "]";
}

}
