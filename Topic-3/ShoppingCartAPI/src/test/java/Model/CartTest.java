package Model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Factory.ShoppingCartFactory;
import Service.CartService;

public class CartTest {

	Cart cart;
	Product product1;
	Product product2;
	CartService cartService;
	
	@Before
	public void setUp() throws Exception {
		
		cartService = ShoppingCartFactory.getCart();
		product1 = new Product(1, "glock", 4000);
		product2 = new Product(2, "AK47", 8000);
		cartService.addProduct(product1);
		cartService.addProduct(product2);
		cart = cartService.CheckOut();
	}

	@Test
	public void testCart() {
		assertEquals(2, cart.getShoppingCart().size());
		assertEquals(true, cart.getShoppingCart().contains(product1));
		assertEquals(true, cart.getShoppingCart().contains(product2));
	}

	@Test
	public void testGetShoppingCart() {
		assertEquals("Product: 1, Name: glock, Price: 4000, Product: 2, Name: AK47, Price: 8000", cart.getShoppingCart());
	}

	@Test
	public void testGetTotalPrice() {
		assertEquals(12000, cart.getTotalPrice());
	}
}
