class Nasted
{
  public static void main(String[]args)
  {
	  System.out.println(">>>>>>Welcome to Passport Elegibility>>>>");
     char Country='I';
	 
	 char City='D';
	 
	 int age =19;
	       
	 
    if(Country== 'I'){
		System.out.println("Country Match Successfully ");
		
		if(City=='D'){
			System.out.println("City Match Successfully ");
			
			if(age>=18){
				System.out.println("Age Match Successfully ");
			}
			else{
				System.out.println("Age Failed !");
			}
		}
		else{
			System.out.println("City Failed ! ");
		}
		
	}
    else{
		System.out.println(" Country Failed !");
	}
	 
  }

}