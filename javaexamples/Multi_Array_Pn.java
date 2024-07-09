class Multi_Array_Pn{
   public static void main(String[]args){
   int arr[][]={{7,-9,3},{89,-23,74},{72,-63,58}};
     int i=0;
	 int total_positive=0;
	 int total_negative=0;
	 while(i<3){
	    int j=0;
		while(j<3){
		    if(arr[i][j]>0){
			    System.out.print(" "+ arr[i][j]);
			    total_positive++;
				
			}System.out.print("");
			else{
				
				System.out.print(" "+ arr[i][j]);
			    total_negative++;
				
				
			}
			
			j++;
		}
		
		i++;
	 }
	 System.out.println( );
	 System.out.println("Total Positive Value::"+ total_positive);
	 System.out.println("Total Negative Value::"+ total_negative);
	 
   }
}