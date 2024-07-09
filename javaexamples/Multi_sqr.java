class Multi_sqr{
   public static void main(String[]args){
	    System.out.println("this this 2d Array");
     int arr[][]={{3,4,1},{3,4,1},{8,2,6}};

	 int i=0;
	 int c;
	 while(i<3){
		 int j=0;
		 while(j<3){
			 
		System.out.print(" "+ arr[i][j]);
			j++;
		 }
		 i++;
		 System.out.println();
	 }
	 i=0;
	 
	 System.out.println(" Now, This is Sqr Array ");
	 
	 while(i<3){
		 int j=0;
		 while(j<3){
			 
		c =arr[i][j]*arr[i][j];
		
		System.out.print(" " +c);
			j++;
		 }
		 i++;
		 System.out.println();
	 }
   }
}
	  
	