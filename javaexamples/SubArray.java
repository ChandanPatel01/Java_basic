class SubArray{
public static void main(String[]args){
	System.out.println("All the Empty SubArray:");
	//System.out.println(SubArray.length);
 int arr[]={1,2,3,4};
  for(int i=0;i<4;i++){
   for(int j=i;j<4;j++){
    for(int k=i;k<=j;k++){
	   System.out.print( arr[k]+ ", ");
	  // System.out.print();
	}
   }
  }
}
}