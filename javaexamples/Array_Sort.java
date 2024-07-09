class Array_Sort{
  public static void main(String[]args){
   int arr[]={5,8,1,3,7,6};
   int i=0;
   while(i<arr.length){
      int j=i+1;
	  while(j<arr.length){
	  int temp=0;
	     if(arr[i]<arr[j]){
		 
		    temp=arr[i];
			arr[i]=arr[j];
			arr[j]=temp;
		 }
		 
		 j++;
		  }
       System.out.println(arr[i]);
     i++;
	 
   }
   
  }
}