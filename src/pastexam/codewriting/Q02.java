package pastexam.codewriting;

import java.util.Scanner;

public class Q02 {

	/*
	 * Finish the following program such that it 
	 * will get user input for width and height and
	 * compute the area of rectangles until the user 
	 * enters values that result in an area of 0. For 
	 * example, if the height was 10.5 and the width 
	 * was 2, it should print out a message indicating 
	 * an area of 21.0 and continue to prompt for another 
	 * rectangle.
	 */
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("Please enter height");
		double height = in.nextDouble();
		System.out.println("Please enter width");
		double width = in.nextDouble();
		while(height * width != 0) {
			System.out.println(height * width);
			System.out.println("Please enter height");
		 height = in.nextDouble();
		System.out.println("Please enter width");
		 width = in.nextDouble();
			
		
			
		}
		in.close();
        System.out.println("Area is 0");
		
	}
}
