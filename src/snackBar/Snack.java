package snackBar;

public class Snack {
private static int maxId = 0;
public int id;
private String name;
private int quantity;
private double cost;
private int machineId;

public Snack(String name, int quantity, double cost, int machineId) {
	maxId++;
	id = maxId;
	this.name = name;
	this.quantity = quantity;
	this.cost = cost;
	this.machineId = machineId;
}

public int getId() {
	return id;
}

public void setId(int id) {
	this.id = id;
}

public void setName(String name) {
	this.name = name;
}

public String getName() {
	return name;
}

public int getQuantity() {
	return this.quantity;
}

public void addQuantity(int quantity) {
	this.quantity += quantity;
}

public void buySnack(int quantity) {
	this.quantity -= quantity;
}

public double getCost(int quantity) {
	return quantity * cost;
}

public void setCost(int cost) {
	this.cost = cost;
}

}