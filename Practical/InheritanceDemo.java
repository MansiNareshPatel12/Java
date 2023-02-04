class Owner{
	
	final int area = 1000;
	String dateOfPurchase = "21-05-2002";
	String name = "Mansi";
	boolean noc = true;
	
	public void renew(){
		String color = "Pink";
		String flat = "2bhk";
		int ceilingheight = 8;
		System.out.println("Old Flat Value: " + (color + " " + flat + " " + ceilingheight));
	}
}

class New_Owner extends Owner{
	
	String dateOfRegisteration = "01-01-2060";
	double flatvalue = 2.3000000;
	String name = "Mahek";
	public void display(){
		System.out.println("Area is : " + area);
		System.out.println("Owner is : " + super.name);
		System.out.println("Curret Flat Price : " + flatvalue);
		System.out.println("New Owner is : " + name);
		super.renew();
	}

	public void renew(){
		String color = "Purple";
		String flat = "3bhk";
		int ceilingheight = 11;
		System.out.println("New Flat Value: " + (color + " " + flat + " " + ceilingheight));
		
		}
}

class InheritanceDemo{
	
	public static void main(String rock[]){
		New_Owner n = new New_Owner();
		n.display();
		n.renew();
	}
}