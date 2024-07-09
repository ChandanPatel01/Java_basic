class Multi_Diogonal{
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
	 int frist_d=0;

	 while(i<3){
		 int j=0;
		 while(j<3){
			if(i==j){
				 System.out.print(" "+arr[i][j]);
			 frist_d=frist_d+arr[i][j];
			}
		j++;
		 }
		 i++;
	 }
	 
	  System.out.println(" :: This is Fisrt Digonol Sum :"+frist_d);
	
	 
}
}