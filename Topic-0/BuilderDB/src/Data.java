
public class Data {

	private String url;
	private String userName;
	private String pass;
	
	//Url
	public String getUrl(){
		return url;
	}
	public void setUrl(String url){
		this.url = url;
	}
	//UserName
	public String getUserName(){
		return userName;
	}
	public void setUserName(String userName){
		this.userName = userName;
	}
	//Password
	public String getPass(){
		return pass;
	}
	public void setPass(String pass){
		this.pass = pass;
	}
	//return info of user and db url
	public String toString(){
		return "User name: " + userName + ", url: " + url + ", password: " + pass;
	}
}
