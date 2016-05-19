package FilePackage;

import java.io.*;

public class FileClass {
	
	//folder is a File type variable that contains a file form a directory
	File folder = new File("C:/");
	File[] listOfFiles = folder.listFiles();
	
	public File getFolder() {
		return folder;
	}
	public void setFolder(File folder) {
		this.folder = folder;
	}
	public File[] getListOfFiles() {
		return listOfFiles;
	}
	public void setListOfFiles(File[] listOfFiles) {
		this.listOfFiles = listOfFiles;
	}
}
