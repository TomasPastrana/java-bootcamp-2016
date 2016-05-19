package BlogPackage;

public class Blog {
	
	static ArrayBlog ab = new ArrayBlog();
	static ScannerBlog sb = new ScannerBlog();
	public static void main(String[] args) {
	
		int a = 1;
		int index;
		System.out.println("Empty blog. Please generate new entry with 'new' comand\nType 'exit' to logout\nIf you want to vew your post please type the name of the post you want to see");
		
		while (a==1){
			
			sb.keyboardInput = sb.input.nextLine();
			//new post entry
			if(sb.keyboardInput.equals("new")){
				
			metodoCualquiera();
				
			} else if(ab.tilte.contains(sb.keyboardInput)){ //view post by title
				
				index = ab.tilte.indexOf(sb.keyboardInput);
				System.out.println("Post: " + ab.tilte.get(index) + " text: " + ab.postText.get(index) + " date: " + ab.date.get(index));
				//delete post from array
				System.out.println("Do you want to delet this post? y/n");
				sb.keyboardInput = sb.input.nextLine();
				if(sb.keyboardInput.equals("y")){
					
					ab.tilte.remove(index);
					ab.postText.remove(index);
					ab.date.remove(index);
					System.out.println("Post deleted...");
				}
			} else if(sb.keyboardInput.equals("viewposts")){
				//if  post are less than 10, shows all posts
				if(ab.tilte.size() < 10){
					
					for(int i =0; i<ab.tilte.size(); i++){
						
						System.out.println("Post: " + ab.tilte.get(i) + " text: " + ab.postText.get(i) + " date: " + ab.date.get(i));
					}
				} else{
					// if posts are more than 10, show only the 10 most recent
					for(int i =0; i<10; i++){
						
						System.out.println("Post: " + ab.tilte.get(i) + " text: " + ab.postText.get(i) + " date: " + ab.date.get(i));
					}
				}
			} else if(sb.keyboardInput.equals("exit")){ //exit blog
					
				a = 0;
				System.out.println("LogedOut");
			} else { //error message
				
				System.out.println("error");
			}
		}
	}
	
	public static void metodoCualquiera(){
		//add new title to title
		System.out.println("Please put a new title to the post:");
		sb.keyboardInput = sb.input.nextLine();
		ab.tilte.add(0, sb.keyboardInput);
		System.out.println("your new title is: " + sb.keyboardInput);
		//add new text to postText
		System.out.println("please write something on your post");
		sb.keyboardInput = sb.input.nextLine();
		ab.postText.add(0, sb.keyboardInput);
		System.out.println("your text is: " +sb.keyboardInput);
		//add new date to date
		ab.date.add(0, ab.dt);
		System.out.println("Date of the post: " + ab.date);
	}
}
