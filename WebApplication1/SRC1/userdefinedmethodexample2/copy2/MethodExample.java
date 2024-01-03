package userdefinedmethodexample2.copy2;

public class MethodExample {
	//user defined method can be  createated in java class
	//user defined method though created in a  class- will not get executed by themself
	//a java class can have  any number of  userdefined methods 
	//to perform the operation related to userdefined the an object  should be  created in 
	// the main method for the class -and using the  objected created the usedefined
	// method should be called
	//userdefined methods should  never be  created within the main method
	//a java  class can have any  number of  userdefined method even without a main method 
	//only the user defined methods  called in the  main method will be executed
	//user defined method names should be allways be unique
	public void addition()
	{
		int var1=20;
		int var2=30;
		int var3;
		var3=var1+var2;
		System.out.println("the value of the  variable  after addition is" +var3);
		
		
	}
	
	
	
	

	public static void main(String[] args) {
		MethodExample m2=new MethodExample();
		m2.addition();
		m2.subtraction();
	}
		public void subtraction()
		{
			int var1=20;
			int var2=30;
			int var3;
			var3=var1-var2;
			System.out.println("the value of the  variable  after addition is" +var3);
			

	}

}
