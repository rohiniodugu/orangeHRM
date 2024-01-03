package stringcomparision;

public class StringExample {

	public static void main(String[] args) {
			
		int var='A';
		System.out.println(var);
		
		
		char charvariable='A';
		System.out.println(charvariable);
		
		
		
		String stringvariable="AB";
		System.out.println("the value of the variable string variable is:"+stringvariable);
		
		
		String  srini="this is a supper good batch of mrs vishnu ";
		System.out.println(srini);
		
		
		System.out.println("***************");
		System.out.println();
		
       String string1="LiveTech";
       String string2="venkat";
       
    	
		if(string1.equals(string2))
    			     
    	{
    		//true block
    		System.out.println("string1 variable value is equal to string2 variable value ");
    		
    	}
    	else
    	{
    		//false block 
    		System.out.println("string1 variable value is not equal to string2 variable value ");

    	}
    	

    	String string3="LiveTech";
		   
      	String string4="Livetech";
      	
      			
      			if(string3.equals(string4))
      	{
      		//true block
      		System.out.println("String3  variable value is equal to String4 variable value ");
      		
      	}
      	else
      	{
      		//false block 
      		System.out.println("String3 variable value is not equal to String4 variable value ");

      	}
      	
      	String string5="LiveTech";//developed text by developer 
		   
      	String string6="Livetech";//client requirement
      	
      	if(string5.equalsIgnoreCase(string6))
      		//will compare  both the strings -character by character,but will ignore the 
      		//upper case and lower case letters of the alphabets of the strings 
      		
      	{
      		//true block
      		System.out.println("String5 variable value is equal to String6 variable value ");
      		
      	}
      	else
      	{
      		//false block 
      		System.out.println("String5 variable value is not equal to String6 variable value ");

      	}
 		System.out.println("#############");
 		System.out.println();
    	String string7="LiveTech";//developed text by developer 
		   
      	String string8="Livetech";//client requirement
      	
      	if(string7.equalsIgnoreCase(string8))
      		//will compare  both the strings -character by character,but will ignore the 
      		//upper case and lower case letters of the alphabets of the strings 
      		
      	{
      		//true block
      		System.out.println("String7 variable value is equal to String8 variable value ");
      		
      	}
      	else
      	{
      		//false block 
      		System.out.println("String7 variable value is not equal to String8 variable value ");

      	}
			System.out.println("#############");
 		    System.out.println();
 		    
    	String string9="LiveTech";
		   
      	String string10="tech";
      	
      	if(string9.contains (string10))
      		//will compare  both the strings -character by character,but will ignore the 
      		//upper case and lower case letters of the alphabets of the strings 
      		
      	{
      		//true block
      		System.out.println("String value existing");
      		
      	}
      	else
      	{
      		//false 
      		System.out.println("expected string not found ");

      	}
  		System.out.println("############TO LOWERCASE############# ");
  		System.out.println();
  		String stringLowerCase=string9.toLowerCase();
  		System.out.println("the value of the variable  string LowerCase after converting  the alphabets  to lowercase are:-"+stringLowerCase);
 
  		System.out.println("############TO upperCASE############# ");
  		System.out.println();
  		String stringUpperCase=string9.toUpperCase();
  		System.out.println("the value of the variable  string UpperCase after converting  the alphabets  to UpperCase are:-"+stringUpperCase);
  		
  		
  		System.out.println("###########Find the numberof characters of string#########");
  		System.out.println();
  		int stringCharatersLength =string9.length();
  		System.out.println("the number of the characters  of the string 9 variable is :-"+stringCharatersLength);
  		
  		
  		char alphabetAtAlocationOfTheString=string9.charAt(5);
  		System.out.println(" the character at the 5th index of the string variable string9 is:-alphabetAtAlocationOfTheString ");
  		System.out.println(string9.charAt(5));
  		//finding which variable has more number of characters
  		int string9Length=string9.length();
  		int string10Length=string10.length();
  		if(string9Length>string10Length)
  		{
  			System.out.println("string9 variable has more number of characters  than string 10 variable ");
  		}
  		else
  		{
  			System.out.println("string10 variable has more number of characters  than string 9 variable ");

  		}

  		
 

	}

}
