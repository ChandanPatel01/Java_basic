class Multi_Even_Odd{
   public static void main(String[]args){
    int arr[][]={{3,4,1},{3,9,1},{8,2,6}};
	
	int cout_even=0;
	int cout_odd=0;
	int i=0;
	while(i<3){
		int j=0;
		while(j<3){
			if(arr[i][j]%2==0){
				System.out.print(" " +arr[i][j]);
				cout_even++;
				
			}
			else{
				
				cout_odd++;
				
			}
			j++;
			
		}
		
		i++;
	}
	System.out.println( );
	
	System.out.println("Total Even :: "+cout_even);
	System.out.println("Total Odd :: "+cout_odd);
	
   }
}
