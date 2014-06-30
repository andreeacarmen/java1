
public class Animal {
	boolean hungry=true;
	
	public Animal(boolean h){
		this.hungry=h;
	}
	
	public void feed(String str){
		if (str == "da")
			{hungry=false;
			System.out.println("da");
			}
	}
	
	void getType(Animal x){
		if (x instanceof Caine)
			System.out.println("caine");
		else
			System.out.println("lion");
	}
		
}
