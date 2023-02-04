class ConditionalExample{
	
	public void calc(){ //creating non static method
	int a = 20;
	int b = 30;
	
	if(a<b){ //condition is specified in if statement
		System.out.println(a); //if the condition is true, this if block is executed
	}
	else{
		System.out.println("a is less than b"); //if the condition is false, this else block is executed 
	}
	
	}
	
	public static void main(String args[]){ //creating main method
		
		ConditionalExample cd = new ConditionalExample(); //creating object with new keyword
		cd.calc(); //invoking method with the help of object
	}
}