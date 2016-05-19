package Factory;

import Implementation.CartServiceImpl;
import Service.CartService;

public class ShoppingCartFactory {

	public static CartService getCart(){
		return new CartServiceImpl();
	}
}
