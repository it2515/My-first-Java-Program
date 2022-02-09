/* @author Chris Thummel
 * @date 02/05/2022
 * @UW Stout CS-2
 * @brief program that will calculate the final grade of a class 
 */

import java.util.Scanner;

public class Grade_Calculator {
	
	public static void main(String[] args) {
		
		// setting up the scanner to gather input.
		Scanner console = new Scanner (System.in);
		
		// setting the values 
		double mid1;
		double mid2;
		double Final;
		double assingments;
		double totalGrade;
		char answer; 
		
		/** while statement that will loop through the main part of the program allowing the user to 
		  go over the program again to enter another grade.**/
		
		do {
			// getting the user input
			System.out.println("Please enter your first midterm grade: ");
			mid1 = console.nextDouble();
				
			System.out.println("Please enter your second midterm grade:  ");
			mid2 = console.nextDouble();
			
			System.out.println("Please enter your final grade: ");
			Final = console.nextDouble();
			
			System.out.println("Please enter the grade of your assingments: ");
			assingments = console.nextDouble();
			
			totalGrade = Final + mid1 + mid2 + assingments;
			
			// will find the grade value by comparing it to their retrospective value.
			if (totalGrade < 60) {
				
				System.out.println("Total grade = " + totalGrade + " and the Grade is F.");
				
			}
			else if(totalGrade >= 60 && totalGrade < 70) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is D.");
				
			}
			else if(totalGrade >=  70 && totalGrade < 73) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is C-.");
				
			}
			else if(totalGrade >= 73 && totalGrade < 78) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is C.");
				
			}
			else if(totalGrade >= 78 && totalGrade < 80) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is C+.");
				
			}
			else if(totalGrade >=  80 && totalGrade < 83 ) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is B-.");
				
			}
			else if(totalGrade >= 83 && totalGrade < 88 ) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is B.");
				
			}
			else if(totalGrade >= 88 && totalGrade < 90) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is B+.");
				
			}
			else if(totalGrade >= 90 && totalGrade < 93 ) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is A-.");
				
			}
			else if(totalGrade >= 93) {
				System.out.println("Total grade = " + totalGrade + " and the Grade is A.");
				
			}
			
			// asks user if they would want to enter another grade. 
			System.out.println("Do you want to execute again? [Y/N]");
			answer = console.next().charAt(0);
			
		}while(answer == 'Y' || answer ==  'y');
			
			
		
	System.out.println("GoodBye!");
	}// end main
}// end class
