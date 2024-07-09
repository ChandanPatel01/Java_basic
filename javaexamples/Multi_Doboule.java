class Multi_Doboule{
   public static void main(String[]args){
	    System.out.println("this this 2d Array");
     int arr[][]={{3,4,1},{3,4,1},{8,2,6}};

	 int i=0;
	 int d;
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
	 
	 System.out.println("This is Double Array ");
	 
	 while(i<3){
		 int j=0;
		 while(j<3){
			 
		d =arr[i][j]*2;
		
		System.out.print(" " +d);
			j++;
		 }
		 i++;
		 System.out.println();
	 }
	  
	
	 
}
}