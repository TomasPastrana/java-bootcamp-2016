//import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class AppTest1 {

	@Test
	public void test() {
		Assert.assertEquals(App.getUrl(), "jdbc:mysql://localhost:3306/demodb");
		//fail("Not yet implemented");
	}

}
