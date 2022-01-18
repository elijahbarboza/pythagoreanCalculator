package project;

import java.util.Scanner;

public class pythagCalculator {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner (System.in);

        System.out.println("What side do you need calculated? Use the letters a, b, or c. C is the hypotenuse, while a and b are base sides.");

        String answer = scan.nextLine();

        if(answer.equals("a"))
            {
                int b, c;
                System.out.println("What is the length of the other base side?");
                b = scan.nextInt();
                System.out.println("Now, what is the length of the hypotenuse?");
                c = scan.nextInt(); 
                double a = Math.sqrt(Math.pow(c,2) - Math.pow(b,2));
                
                System.out.println("The length of your missing side is: " + a);
		
		
	}
        
        if(answer.equals("b"))
        {
            int a, c;
            System.out.println("What is the length of the other base side?");
            a = scan.nextInt();
            System.out.println("Now, what is the length of the hypotenuse?");
            c = scan.nextInt(); 
            double b = Math.sqrt(Math.pow(c,2) - Math.pow(a,2));
            
            System.out.println("The length of your missing side is: " + b);

}
        
        if(answer.equals("c"))
        {
            int a, b;
            System.out.println("What is the length of the first base side?");
            a = scan.nextInt();
            System.out.println("Now, what is the length of the second base side?");
            b = scan.nextInt(); 
            double c = Math.sqrt(Math.pow(a,2) + Math.pow(b,2));
            
            System.out.println("The length of your missing side is: " + c);

}
	
	
	
	
	
	}}
