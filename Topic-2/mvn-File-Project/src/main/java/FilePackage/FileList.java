package FilePackage;

public class FileList {

	public static void main(String[] args) {
		
		//Calling ArrayClass, FileClass, and ScannerClass
		ArrayClass ar = new ArrayClass();
		FileClass fc = new FileClass();
		ScannerClass sc = new ScannerClass();
		
		int a = 1;

		System.out.println("Empty list...\nInsert file name here\nType 'dir' to get file names or 'exit' to finish the program");
		
		while(a==1){
			//insert file name in console
			sc.fileName = sc.input.nextLine();
			
			for(int i = 0; i < fc.listOfFiles.length; i++){
				
				//get names of all files in C:/
				if(sc.fileName.equals("dir")){
					System.out.println(fc.listOfFiles[i].getName());
				}
				//Compare keyboard input with the file name
				if(fc.listOfFiles[i].getName().equals(sc.fileName)){
					
					//if the file already exist in arrayList: remove the position and put it again in 0
					if(ar.arrayList.contains(fc.listOfFiles[i].getName())){
						
						ar.arrayList.remove(ar.arrayList.indexOf(fc.listOfFiles[i].getName()));
						ar.arrayList.add(0, fc.listOfFiles[i].getName());
					} else {
						ar.arrayList.add(0, fc.listOfFiles[i].getName());
					}
					//erase after 5 files in list
					if(ar.arrayList.size() > 5){
						
						ar.arrayList.remove(15);
					}
					
					//Print result
					if(fc.listOfFiles[i].isFile()){
						System.out.println("File: " + ar.arrayList);
					} else if(fc.listOfFiles[i].isDirectory()){
						System.out.println("Directory: " + ar.arrayList);
					}
				} else if(i >= fc.listOfFiles.length){
					System.out.println("File doesn't exist");
				}
			}
			if(sc.fileName.equals("exit")){
				a = 0;
			}
		}
		System.out.println("Bye!\n Tomás Pastrana all rights reserved");
	}

}
