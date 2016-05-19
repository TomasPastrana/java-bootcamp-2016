package Model;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import Model.Product;

public class ProductTest {

	Product product;
	
	@Before
	public void setUp() throws Exception {
		
		product = new Product(1, "glock", 4000);
	}

	@Test
	public void testGetProductId() {
		
		assertEquals(1, product.getProductId());
	}

	@Test
	public void testGetName() {
		
		assertEquals("glock", product.getName());
	}

	@Test
	public void testGetPrice() {
		
		assertEquals(4000, product.getPrice());
	}

}
