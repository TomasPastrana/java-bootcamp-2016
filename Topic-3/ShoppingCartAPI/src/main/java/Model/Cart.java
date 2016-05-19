package Model;

import java.util.ArrayList;

public class Cart {

	public ArrayList<Product> shoppingCart;
	public int totalPrice;
	
	public Cart(ArrayList<Product> shoppingCart) {
		super();
		this.shoppingCart = shoppingCart;
	}

	public ArrayList<Product> getShoppingCart() {
		return shoppingCart;
	}

	public int getTotalPrice() {
		for(int i=0; i<shoppingCart.size(); i++){
			totalPrice = totalPrice + shoppingCart.get(i).getPrice();
		}
		return totalPrice;
	}
}
