package Implementation;

import java.util.ArrayList;

import Model.Cart;
import Model.Product;
import Service.CartService;
import Service.UserService;
import Factory.ShoppingCartFactory;

public class UserServiceImpl implements UserService{

	public String userName;
	public String userPass;
	CartService cartService = ShoppingCartFactory.getCart();
	
	public UserServiceImpl(String userName, String userPass) {
		this.userName = userName;
		this.userPass = userPass;
	}

	public void addCartProduct(Product product) {
		
		cartService.addProduct(product);
	}

	public void removeCartProduct(Product product) {
		
		cartService.removeProduct(product);
	}

	public Product selectProduct(int id) {
		
		return cartService.getProduct(id);
	}

	public ArrayList<Product> showCart() {
		
		return cartService.CheckOut().getShoppingCart();
	}

	public int total() {
		
		return cartService.CheckOut().getTotalPrice();
	}

	public Cart goToPay() {
		
		return cartService.CheckOut();
	}
}
