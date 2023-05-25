package javaPrograms;

import java.util.Scanner;

public class createRowColumnCountTheSquares 
{
	// intput: 3 it created 3row 3column and count the squares
		public static void main(String[] args) 
		{
			Scanner sc = new Scanner(System.in);
			System.out.println("Please Enter The Number: ");
			int ans = sc.nextInt();
			int a = ans; int b = ans; 
			int fans = 0;
			for (int i = 1; i <=a ; i++) 
			{
				fans= fans+(int) Math.pow(b, 2);
				b--;
			}
			System.out.println(fans);
				
		}
}
