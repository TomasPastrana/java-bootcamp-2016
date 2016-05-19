package Service;

import Model.Cart;
import Model.Product;

public interface CartService {

	public boolean addProduct(Product product);
	public boolean removeProduct(Product product);
	public void clearCart();
	public Product getProduct(int id);
	public Cart CheckOut();
}
