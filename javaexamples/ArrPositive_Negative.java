class ArrPositive_Negative{
public static void main(String[]args){
     int arr1[]={17,86,-83,89,-58,55};
	 int i=0;
	 int size =arr1.length;
	 
	 int total_positive=0;
	 int total_negative=0;
	 System.out.println("Size Of Array : " +size);
	 while(i<6){
	 if(arr1[i]>0){
	      System.out.println("Postive Number are : " +arr1[i]);
		  total_positive=total_positive+1;
		  } 
	 i++;
	 }
	 System.out.println("Total_Postive Number are : " +total_positive);
	 
	 
	 i=0;
	 while(i<6){
	     if(arr1[i]<0){
		 System.out.println("Negative Number are :" +arr1[i]);
		 total_negative=total_negative+1;
		 }
		 i++;
	 }
	 System.out.println("Total_Nagative Number are : " +total_negative);
	 
}

}