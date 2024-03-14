package com.mayuri.DayNine;
//String Assignment given on 7Feb, 2024.
import java.util.Arrays;

public class StringAssignment {
	

		public void stringConcat(String str,int n)
		{		
			if(n==1)
			{
				System.out.println(str);
				return;
			}
			char[] str1=str.toCharArray();
			int len = str.length();
			
			String[] arr = new String[n];
			Arrays.fill(arr, "");
			int row=0;
			boolean down = true;
			
			for(int i = 0;i<len ;++i)
			{
				arr[row] += (str1[i]);
			
			if(row==n-1)
			{
				down = false;
			}
			else if(row==0)
			{
				down = true;
			}
			if(down)
			{
				row++;
			}
			else
			{
				row--;
			}

		}
		for(int i=0;i<n;++i)
		{
			System.out.println(arr[i]);
		}
		
		}

		public static void main(String[] args) {
			//String str = "ABCDEFGH";
			String str = "MayuriSable";
			//int n = 2;
			int n = 3;
			StringAssignment s1 = new StringAssignment();
			s1.stringConcat(str,n);
			
		}
	}


