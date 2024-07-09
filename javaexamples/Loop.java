class Loop{
  public static void main(String[]args){
   int even =0;
   int odd=0;
   int ctr=1;

   while(ctr<=10){
      if(ctr%2==0){
	    even=even+1;
	  }
	  else{
	     odd=odd+1;
	  }
	  
	  ctr++;
   }
   System.out.println("Even :"+even);
   System.out.println("Odd :"+odd);
   
  }
}