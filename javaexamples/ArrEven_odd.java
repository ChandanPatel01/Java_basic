class ArrEven_odd{
 public static void main(String[]args){
   int arr[]={1,2,5,6,3,2,2,4};
   int i=0;
   int even_total=0;
   int odd_total=0;
 
     System.out.println(" Even Numbers Are");
	 while(i<8){
		 
		 if(arr[i]%2==0){
			System.out.println (arr[i]);
			even_total=even_total+1;
            }
			
			i++;
		 }
		 System.out.println("Total Even Occur:"+ even_total);
		 // odd 
		 i=0;
		 while(i<8){
			 if(arr[i]%2!=0){
				 System.out.println (arr[i]);
				 odd_total=odd_total+1;
			 }
			 i++;
		 }
		 System.out.println("Total Odd Occur:"+ odd_total);
		  
 }
   
 }
