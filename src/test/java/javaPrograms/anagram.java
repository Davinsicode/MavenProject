package javaPrograms;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

import org.testng.annotations.Test;

public class anagram 
{
	// input:abc,cba,abcd,bcda,tuv,xyz output:tuv,xyz
	@Test
	public void anagram()
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the String Values Along with Spaces: ");
		String input = sc.next();
		
		String[] arr = input.split(",");
		ArrayList list = new ArrayList<>();
		for (int i = 0; i < arr.length; i++) 
		{
			char[] arr2 = arr[i].toCharArray();
			Arrays.sort(arr2);
			String comp = new String(arr2);	
			list.add(comp);
		}
		
		for (int i = 0; i < list.size(); i++) 
		{
			int count = 0;
			for (int j = 0; j < list.size(); j++) 
			{
				if(list.get(i).equals(list.get(j))) 
				{
					if(j<i)
					{
						break;
					}
					if(list.get(i).toString().length()==list.get(j).toString().length())
					{
						count++;
					}
				}
			}
			if(count==1)
			{
				System.out.println(arr[i]+" is Not a Anagram");
			}
		}
	}
}
