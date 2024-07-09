class SubArray1{
public static void main(String[]args){
	System.out.println("All the Empty SubArray:");
	//System.out.println(SubArray.length);
 int arr[]={1,2,3,4};
    int i=0;
	int sum=0;
	while(i<4){
	 int j=0;
	 while(i>arr.length){
	   sum=sum +arr[i];
	   j++;
	 }
	 i++;
	 
	}
	System.out.println(sum);
 
}
}