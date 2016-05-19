package BlogPackage;

import java.util.ArrayList;
import java.util.Date;

public class ArrayBlog {
	
	ArrayList<String> tilte = new ArrayList<String>();
	ArrayList<String> postText = new ArrayList<String>();
	ArrayList<Date> date = new ArrayList<Date>();
	Date dt = new Date();
	
	public ArrayList<String> getTilte() {
		return tilte;
	}
	public void setTilte(ArrayList<String> tilte) {
		this.tilte = tilte;
	}
	public ArrayList<String> getPost() {
		return postText;
	}
	public void setPost(ArrayList<String> post) {
		this.postText = post;
	}
	public ArrayList<Date> getDate() {
		return date;
	}
	public void setDate(ArrayList<Date> date) {
		this.date = date;
	}
}
