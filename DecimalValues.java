//Create a package named ' EncapsalationTest' and make a class 'Number'. 
package EncapsalationTest;
public class number  
{
	//Declare field/variable as private. 
	private int y;
	
	//Create a public getter method for private variable. 
	public int get() {
	return y;
}
	//Create a public setter method for private variable and declare the parameter. 
	public void set(int y) {
	this.y=y;
}
	public class encaptest 
	{
		public static void main(String[] args)
	{
			//create a  object of class using new keyword
			number S = new number();
			//call setter method
			S.set(5);
			//call getter method
			int num = S.get();
			
			System.out.println(num);
	}
	}
}
