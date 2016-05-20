package Service;

import Model.Cart;
import Model.Product;

/**
 * @author Tomás
 *
 */

public interface CartService {
	
	/**
	 * add a product to the cart
	 * @param add the selected product
	 * (id, "item", price)
	 *
	 */
	public boolean addProduct(Product product);
	/**
	 * remove product in cart
	 * @param remove selected product
	 *
	 */
	public boolean removeProduct(Product product);
	/**
	 * removes all products in cart so far
	 *
	 */
	public void clearCart();
	/**
	 * get a specific product
	 * @param select that product with id
	 *
	 */
	public Product getProduct(int id);
	/**
	 * pay your products in cart
	 *
	 */
	public Cart CheckOut();
}
