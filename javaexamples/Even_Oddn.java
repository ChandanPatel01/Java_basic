// Even Odd With Para Meter and Retrun Type//
class Even_Oddn{
	
   static String mCheck(int  n){
       if(n%2==0){ 
	   return ("Even");
	   } 
	   else{
	    return ("Odd");  
	   }
}

   public static void main(String[]args){
        System.out.println(" Start Main Method");
		    // int n=50;
	    
		   String r =mCheck(20);
		   System.out.println(r);
	
		
   }
}