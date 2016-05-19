package FilePackage;

import java.util.Scanner;

public class ScannerClass {

	String fileName;
	Scanner input = new Scanner(System.in);
	
	public String getFileName() {
		return fileName;
	}
	public void setFileName(String fileName) {
		this.fileName = fileName;
	}
	public Scanner getInput() {
		return input;
	}
	public void setInput(Scanner input) {
		this.input = input;
	}
}
