class Multi_RowADD{
   public static void main(String[]args){
	    System.out.println("this this 2d Array");
     int arr[][]={{3,4,1},{3,94,1},{8,2,6}};

	 int i=0;
	 int sum =0;
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
	 
	 System.out.println(" Now, This is 1 Row Sum  Array ");
	 
	 while(i<arr.length){
		 
		 sum = sum +arr[1][i];
		
		 i++;
	 }
	 System.out.print(" This is 1 Row Additions::" +sum);
   }
}
	  
	