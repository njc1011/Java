
/*	Nicholas Carpino
	Interview Prep

	This program will convert Roman Numerals to Integer

*/

import java.util.*;
import java.io.*;

public class Roman_to_Int{


	static int value(char letter){

		switch(letter){
			case'I':
				return 1;
			case 'V':
				return 5;
			case 'X':
				return 10;
			case 'L':
				return 50;
			case 'C':
				return 100;
			case 'D':
				return 500;
			case 'M':
				return 1000;
			default:
				return -1;
		}

	}


	//Main method call for input
	public static void main(String args[]){

		Scanner scan = new Scanner(System.in);

		System.out.println("\n"+"Enter Roman Numeral: ");
		String input = scan.next();

		//wicked wango cards used to determine higher or lower
		int l1 = 0;
		int l2 = 0;
		int total = 0;


		if(input.length() <= 0)
			System.out.println("Nothing Entered");
		else if(input.length() == 1)
			total = value(input.charAt(0));
		else{

			for(int i = 0; i<input.length()-1; i++){

				l1 = value(input.charAt(i));
				l2 = value(input.charAt(i+1));

				if(l1 >= l2)
					total = total + l1;
				if(l1 < l2)
					total = total - l1;
			}
			total += l2;
		}

		System.out.println("Integer: " + total);


	}
}