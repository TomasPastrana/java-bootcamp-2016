package Service;

import java.util.ArrayList;

import Model.Cart;
import Model.Product;

/**
 * @author Tomás
 *
 */
public interface UserService {

	/**
	 * adds a product to the cart
	 * @param add the selected product
	 *
	 */
	public void addCartProduct(Product product);
	/**
	 * remove a product from the cart
	 * @param remove the selected product
	 *
	 */
	public void removeCartProduct(Product product);
	/**
	 * select a product
	 * @param serch it with id
	 *
	 */
	public Product selectProduct(int id);
	/**
	 * show all products in the cart so far
	 * all the products in the array
	 *
	 */
	public ArrayList<Product> showCart();
	/**
	 * show the cost of the products
	 * you selected to buy
	 *
	 */
	public int total();
	/**
	 * do a checkout with the products
	 * in the cart
	 *
	 */
	public Cart goToPay();
}
