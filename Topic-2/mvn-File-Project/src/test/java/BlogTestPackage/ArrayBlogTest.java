package BlogTestPackage;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.junit.*;
import BlogPackage.ArrayBlog;

public class ArrayBlogTest {

	ArrayBlog ab = new ArrayBlog();
	ArrayList<String> list = new ArrayList<String>();
	
	@Before
	public void fillArray(){
		
		for(int i=0; i<10; i++ ){
			
			list.add(0, "titulo" + i);
			ab.setTilte(list);
		}
	}
	
	@Test
	public void testEmptyArray() {
		
		assertEquals(false, ab.getTilte().isEmpty());
		assertEquals(true, ab.getPost().isEmpty());
		assertEquals(true, ab.getDate().isEmpty());
	}

	@Test
	public void testAdd10Posts() {
		
		assertEquals(10, ab.getTilte().size());
	}

	@Test
	public void testRemovePost() {
		
		list.remove(3);
		assertEquals(9, ab.getTilte().size());
	}

}
