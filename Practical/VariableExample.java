class VariableExample{
	
	int a = 28;         //instance variable declaration
	static int b = 50; //static variable declaration
	
	public static void display(){
		double c = 210500.25; 
		System.out.println("Value of c is : " + c); 
	}
	
	public void sum(){
		int x = 15;  //local variable declaration
		int y = 20;  //local variable declaration
		int sum = x + y;
		System.out.println("Sum of x and y is : " + sum); //local variable printing
	}
	
	public static void main(String args[]){
		VariableExample obj = new VariableExample();  //creating object with new keyword
		obj.sum(); //invoking nonstatic method with object
		System.out.println("Instance variable value : " + obj.a); //calling instance variable with the help of object
		System.out.println("Static variable value : " + b);   // calling static variable without the help of object
		display(); //calling static method without the help of object
	}
}