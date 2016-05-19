package BlogPackage;

import java.util.Scanner;

public class ScannerBlog {

	String keyboardInput;
	Scanner input = new Scanner(System.in);
	
	public String getPostTitle() {
		return keyboardInput;
	}
	public void setPostTitle(String postTitle) {
		keyboardInput = postTitle;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
}
