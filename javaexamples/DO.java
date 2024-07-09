class Do{
  public static void main(String[]args){
    int num=5;
	   int ctr=1;
	   int res=0;
	   do{
	     res = num*ctr;
	  
	   System.out.println( num  + " * " +  ctr  + " = :" + res );
	    ctr=ctr+1;
	   }
	   while(ctr<=10);
  }
}