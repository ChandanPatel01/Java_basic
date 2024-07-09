// Even Odd Without Para Meter and with Retrun Type//
class EvenOdd4{
	
   static String toCheck(){
   int n=10;
       if(n%2==0){
		return("Even Number");
	   }
	   else{
	    return("Odd Number");   
	   }
	   
	   
}

   public static void main(String[]args){
        System.out.println(" Start Main Method");
		
		String n = toCheck();
		System.out.println(n);
		
   }
}