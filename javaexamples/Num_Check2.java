//Method with parameter with retruntype//

class Num_Check2{
  static String checkNumbers(int num){
	  
  if(num>0){
     return("Positive");
   }
   
   else if(num==0){
       return("Equal");
   }
   
   else{
       return("Nagetive");
   }
  }   
  
  
  
  public static void main(String[]args){
      String n=checkNumbers(7);
	  System.out.println(n);
  }

}
