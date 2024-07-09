//Method Use with parameter and with return//
class MarrEevn1{

   static int callMethod1(int arr[]){
   //int arr[]={1,2,5,6,3,2,2,4};
   int i=0;
   int even_total=0;
   int odd_total=0;
 
     System.out.println(" Even Numbers Are");
	 while(i<8){
		 
		 if(arr[i]%2==0)
		    {
			//return(arr[i]);
			return even_total+1;
            }
		 else{
			 return odd_total+1;
		     }
			i++;
		 }
		return (even_total);
		return (odd_total);
		 // odd 
		 /*i=0;
		 while(i<8){
			 if(arr[i]%2!=0){
				return (arr[i]);
				 return odd_total+1;
			 }
			 i++;
		 }
		 return odd_total;
    }*/
}

   public static void main(String[]args){
       
	   int res[]= callMethod1(1,2,5,6,3,2,2,4);
	   System.out.print(res[]);
}
}
