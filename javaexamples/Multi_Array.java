class Multi_Array{
 public static void main(String[]args){
  //  int arr[][]={{53,84,61},{23,84,11},{88,32,66}};// First declrationand inslization
	  
	  int arr[][]=new int [3][3];
	  arr[0][0]=85;	
	  arr[0][1]=25;
	  arr[0][2]=23;
	  arr[1][0]=24;
	  arr[1][1]=47;
	  arr[1][2]=51;
	  arr[2][0]=49;
	  arr[2][1]=20;
	  arr[2][2]=98;
	
	int i=0;
	while(i<3){
	int j=0;
	    while(j<3){
		  System.out.print(" "+arr[i][j]);
		    j++;
		}
	    System.out.println();
	   i++;
	}
 }

}