package Service;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import Factory.ShoppingCartFactory;
import Model.Cart;
import Model.Product;

public class CartServiceTest {

	Cart cart;
	Product product1;
	Product product2;
	Product product3;
	CartService cartService;
	
	@Before
	public void setUp() throws Exception {
		
		cartService = ShoppingCartFactory.getCart();
		product1 = new Product(1, "glock", 4000);
		product2 = new Product(2, "AK47", 8000);
		product3 = new Product(3, "M4", 8500);
		
		cartService.addProduct(product1);
		cartService.addProduct(product2);
		cartService.addProduct(product3);
		
		cartService.removeProduct(product2);
	}

	@Test
	public void testAddProduct() {
		
		assertTrue(cartService.addProduct(product2));
	}

	@Test
	public void testRemoveProduct() {
		
		assertTrue(cartService.removeProduct(product1));
	}

	@Test
	public void testClearCart() {
		
		cartService.clearCart();
	}

	@Test
	public void testGetProduct() {
		
		assertTrue(product1 == cartService.getProduct(0));
	}

	@Test
	public void testCheckOut() {
		
		Cart cart1;
		cart1 = cartService.CheckOut();
		assertEquals(12500, cart1.getTotalPrice());
	}
}
