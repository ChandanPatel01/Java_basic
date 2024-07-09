//Method with parameter without retruntype//
class Num_Check3{
  static void checkNumbers(int num){
	  
  if(num>0){
     System.out.print("Positive");
   }
   
   else if(num==0){
       System.out.print("Equal");
   }
   
   else{
      System.out.print("Nagetive");
   }
  }  
  
  
  
  public static void main(String[]args){
     checkNumbers(9);
	  
  }

}