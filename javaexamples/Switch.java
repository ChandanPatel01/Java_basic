class Switch{

   public static void main(String[]args)
{
    int x =20;
    int y=10;
   char op   =  '+';
   int result = 0;

 switch(op)
{
  case  '+'  :

  result= x+y;

  break;
  

case  '-' :
  result=  x-y;
  break;

case  '*' :
  result= x*y;
  break;

case  '/' :
  result= x/y;
  break;

case  '%' :
  result= x%y;
  break;

default :
 System .out.println(" Invelid Number:");

}
    System.out.println(" Result is::" + result);
 
}

 
}
     