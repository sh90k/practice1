package firstAssignment;
public class firstAssignment {
	public static void main(String[] args)
	{	
		//swap two numbers with temp
		
		int a = 10;
		int b = 20;
		System.out.println("before swapping:\n");
		System.out.println("a = "+a+ "   b= "+b);
		int temp = a;
		a = b;
		b = temp;
		System.out.println("after swapping:\n");
		System.out.println("a = "+a+ "   b= "+b);
		
		//swap two numbers without temp
		a = 10;
		b = 20;
		System.out.println("before swapping:\n");
		System.out.println("a = "+a+ "   b= "+b);
		a = a + b; 
		b = a - b; 
		a  = a - b;
		System.out.println("after swapping:\n");
		System.out.println("a = "+a+ "   b= "+b);
		
		//swap three numbers with temp
		
		a = 10;
		b = 20;
		int c = 30;
		
		System.out.println("before swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c);
		
		temp = b;  
		b = a;
	    a = c;
	    c = temp;
		
		
		System.out.println("after swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c);
		
		a=10; b = 20; c= 30;
		//swap three numbers without temp
		System.out.println("before swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c);
		a = a + b + c;  
	    b = a - (b+c);  
	    c = a - (b+c);  
	    a = a - (b+c);   
		
		System.out.println("after swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c);
		
		//swap four numbers with temp
		a = 10; b = 20; c = 30; int d = 40;
		
		System.out.println("before swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c+ "  d="+d);
		
		
		
		temp = a;
		a = b;
		b = c;
		c = d;
		d = temp;
		
		System.out.println("after swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c+ "  d="+d);
		
		//swap 4 numbers without temp
		a = 10; b = 20; c = 30; d = 40;
		
		System.out.println("before swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c+ "  d="+d);
		
		
		 a = a + b;
	     b = a - b;
	     a = a - b;
	     
	     b = b + c;
	     c = b - c;
	     b = b - c;
	     
	     c = c + d;
	     d = c - d;
	     c = c - d;
	     
	    System.out.println("after swapping:\n");
		System.out.println("a = "+a+ "   b= "+b+ "  c="+c+ "  d="+d);
		
		//problem 7  cal jio fibre cost
		
		float cost  = 699;
		float gst = 0.18f;
		float finalCost = cost + cost * gst;
		System.out.println("final plan cost="+finalCost);
		
		//prb 8
		
		float costPizza = 399.0f;
		float discount = 0.20f;
		System.out.println("final bill amount="+ (costPizza - costPizza*discount));
		
		//prb 9
		
		float salary = 85000.0f;
		float tax = 0.20f;
		System.out.println("tax amount="+ (tax * salary));
		
		//prb 10
		
		float principal = 500000f;
		int time = 5;
		float interest = 0.068f;
		
		float interestAmount = principal * time * interest;
		
		System.out.println("interest amount="+interestAmount);
		
		System.out.println("final amount="+ (interestAmount+principal));
		
		//prb 11
		
		salary = 85000f;
		float ta = 0.15f;
		float da = 0.20f;
		float hra = 0.18f;
		tax = 0.25f;
		float pf = 0.20f;
		
		float grossAmount = salary + salary * (ta+da+hra);
		float netAmount = grossAmount - ((pf*salary) - (tax * salary));
		
		System.out.println("grossAmount"+grossAmount+"  netAmount="+netAmount);
			
	}	
	
}
