package FileTestPackage;

import static org.junit.Assert.*;
import org.junit.Test;

import FilePackage.ArrayClass;
import FilePackage.FileClass;

public class FileListTest {
	
	ArrayClass ar = new ArrayClass();
	FileClass fc = new FileClass();
	
	@Test
	public void testEmptyList() {
		
		assertEquals(true, ar.getArrayList().isEmpty());
	}
	
	@Test
	public void testAddFile(){
		
		ar.getArrayList().add(0, "Hola");
		ar.getArrayList().add(1, "Como");
		ar.getArrayList().add(2, "Estas");
		assertEquals(3, ar.getArrayList().size());
	}
	
	@Test
	public void testBumpToTop(){
		
		ar.getArrayList().add(0, "Hola");
		ar.getArrayList().add(1, "Como");
		ar.getArrayList().add(2, "Estas");
		
		if(ar.getArrayList().contains("Estas")){
			
			ar.getArrayList().remove(2);
			ar.getArrayList().add(0, "Estas");
		}
		assertEquals("Estas", ar.getArrayList().get(0));
	}
	
	@Test
	public void testRemoveFiles(){
		
		ar.getArrayList().clear();
		assertEquals(true, ar.getArrayList().isEmpty());
	}
}
