public class ProxyDB {

	public static void main(String[] args) {
		//creates a Proxy object
		Proxy proxy = new Proxy();
		//creates a FastAccess object
		FastAccess fastAccess = new FastAccess();
		//calls accessConfirmation()
		fastAccess.accessConfirmation();
		//calls accessConfirmation on proxy object
		proxy.accessConfirmation();
	}

}
