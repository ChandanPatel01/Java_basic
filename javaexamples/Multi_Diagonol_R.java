class Multi_Diagonol_R{
 public static void main(String[]args){
     System.out.println("This is 2D Arrar:");
     int arr[][]={{4,5,96},{87,85,96},{24,52,86}};
	 int i=0;
	 int resver_d=0;
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
	while(i<3){
	int j=0;
	  while(j<3){
	  if((i+j)==2){
	 resver_d= resver_d+arr[i][j];
	  }
	  j++;
	  }
	  i++;
	}
	System.out.println("::This is Sum of Reverse diagonoal :" + resver_d);
 }
}