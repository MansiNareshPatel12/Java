class TypecastingExample{
	
	public static void main(String args[]){
		
		//widening
		int x = 750;
		long z = x;   //automatically convert int to long
		System.out.println(x);
		System.out.println(z);
		double y = x; //automatically convert int to double
		System.out.println(y);
		
		//narrowing
		double a = 25000.25;
		int b = (int)a; //automatically double into int
		System.out.println(a);
		System.out.println(b);
	}
}