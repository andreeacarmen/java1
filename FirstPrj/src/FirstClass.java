import pack1.*;

public class FirstClass {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Client cl=new Client("das");
		Client cl2=new Client();
		
		//cl.name="lala";
		PostOffEmp postas= new PostOffEmp();
		//System.out.println("hei");
		System.out.println(cl.getName());
		System.out.println(cl2.getName());
		//cl2.name="ana";
	
		PostOffEmp p=null;
		//System.out.println(p.processReq("nume"));
		Integer x=10;
		
		try{
		int y=Integer.parseInt("ana");
		System.out.println(y);
		System.out.println("lala");
		} catch(NumberFormatException ex){
			System.out.println("buna");
		}
		
		System.out.println(Mountains.valueOf("Meridionali"));
		
		//System.out.println(cl2.name);
		//System.out.println(cl.name);
		
		Client cl3= new Client();
		//System.out.println(Client.name);
		//System.out.println(postas.processReq("nume21"));
		String s1= new String("ana");
		String s2= new String("ana");
		if (s1.equals(s2))
			System.out.println("True");
		else
			System.out.println("false");
	
		Mountains m = Mountains.Meridionali;
		System.out.println(m);
		int no=m.ordinal();
		System.out.println(no);
		
		char Pr='h';
		Character obj = new Character('a');
		System.out.println(Pr);
		
		Caine d = new Caine(true);
		Animal a = new Animal(true);
		d.feed("da");
		a.feed("da");
		System.out.println(a.hungry);
		
		Animal z = new Caine(true);
		z.getType(a);
		
		
	}

}
