class Multi_Diogonal1{
   public static void main(String[]args){
	    System.out.println("this this 2d Array");
     int arr[][]={{3,9,1},{3,11,1},{8,19,6}};

	 int i=0;
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
	 int s_d=0;

	 while(i<3){
		 int j=0;
		 while(j<3){
			if((i+j)==2){
				 System.out.print(" "+arr[i][j]);
			 s_d=s_d+arr[i][j];
			}
		j++;
		 }
		 i++;
	 }
	 
	  System.out.println(" :: This is Second Digonol Sum :"+s_d);
	
	 
}
}