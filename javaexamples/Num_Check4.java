//Method without parameter with retruntype//

class Num_Check4{
  static String checkNumbers(){
	  int num=93;
  if(num>0){
     return ("Positive");
   }
   
   else if(num==0){
       return("Equal");
   }
   
   else{
     return("Nagetive");
   }
  }  
  
  
  
  public static void main(String[]args){
     String n=checkNumbers();
	 System.out.println(n);
	  
  }

}