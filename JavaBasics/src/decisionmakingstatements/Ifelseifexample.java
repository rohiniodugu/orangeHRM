package decisionmakingstatements;

public class Ifelseifexample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
           int var1=60;
           int var2=70;
           int var3=90;
           if(var1>var2&&var1>var3)
           {
        	System.out.println("var1 variable value is greater than var2 andvar3 variable value"); 
        	
           }
           else
        	   if(var2>var3)
          {
           System.out.println("var2 variable value is greater than var1 andvar3 variable value"); 
           }
           else
           {   
               System.out.println("var3 variable value is greater than var1 andvar2 variable value"); 
               
           }
	}

}
