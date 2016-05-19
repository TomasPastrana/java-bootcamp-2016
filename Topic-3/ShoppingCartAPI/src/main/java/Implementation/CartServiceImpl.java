package Implementation;

import java.util.ArrayList;

import Model.Cart;
import Model.Product;
import Service.CartService;

public class CartServiceImpl implements CartService{

	private ArrayList<Product> shoppingCart;
	
	public CartServiceImpl(){
		shoppingCart = new ArrayList<Product>();
	}
	
	public boolean addProduct(Product product) {
		return shoppingCart.add(product);
	}

	public boolean removeProduct(Product product) {
		return shoppingCart.remove(product);
	}

	public void clearCart() {
		shoppingCart.clear();
	}

	public Product getProduct(int id) {
		return shoppingCart.get(id);
	}

	public Cart CheckOut() {
		return new Cart(shoppingCart);
	}
}
