class Multi_RowSqr{
   public static void main(String[]args){
	    System.out.println("this this 2d Array");
     int arr[][]={{3,4,1},{3,94,1},{8,2,6}};

	 int i=0;
	 int sqr=0;
	 //int sqr_c=0;
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
	 
	 System.out.println(" Now, This is 1 Row Sqr  Array ");
	 
	 while(i<arr.length){
		 
		 sqr = arr[0][i]*arr[0][i];// for row
		 
		System.out.print(" " +sqr);
		
		  //sqr_c = arr[i][0]*arr[i][0];// for coulumn
		  //System.out.print(" " +sqr_c);
		 i++;
	 }
	  System.out.println(" ");
   }
}
	  
	