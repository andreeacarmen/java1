enum Mountains{
	Meridionali, Occidentali, Orientali 
};



public class Client {

	private static String name;
	String pack;

	String getName()
	{
		return this.name;
	}
	
	public Client(){
		name="mypack";
	}
	
	public Client(String name){
		this();
		Client.name=name;
	}
		
	public void sendReq(String pack){
		this.pack=pack;
		
	}
}
