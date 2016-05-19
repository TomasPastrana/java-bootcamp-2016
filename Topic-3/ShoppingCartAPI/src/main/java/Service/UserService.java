package Service;

import java.util.ArrayList;

import Model.Cart;
import Model.Product;

public interface UserService {

	public void addCartProduct(Product product);
	public void removeCartProduct(Product product);
	public Product selectProduct(int id);
	public ArrayList<Product> showCart();
	public int total();
	public Cart goToPay();
}
