class Min_Value{
 public static void main(String[]args){
  int arr[]={52,25,852,364,789,21,24,47}; 
  int i=0;
  int min=arr[0];
  while(i<arr.length){
   if(arr[i]<min){
        min=arr[i];
   }
    i++;
  }
  System.out.println("This is Min Value Of Array : "+ min);
 }
}