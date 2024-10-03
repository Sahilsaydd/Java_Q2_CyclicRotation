package CycaicRotation;

import java.util.Scanner;

public class CyclicRotation {

		public void RotateArray(int[]nums , int k) {
			
			int[] temp = new int[nums.length];
				
			//first print the array element
			
			System.out.println("Original Arary");
		for(int i=0; i<nums.length;i++) {
			
			System.out.print(" "+nums[i]);
		}
		
		//Rotating the elements
		
		
			for(int i=0; i<nums.length; i++) {
				
				temp[(i+k)%nums.length] = nums[i];
				
			}
			
			
			
			 System.out.println("Updated Array");
			for(int i=0; i<nums.length; i++) {
				System.out.print(" "+temp[i]);
			}
			
			
		}
	public static void main(String[] args) {
		
		
		CyclicRotation a = new CyclicRotation();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the how many elements you want :-");
		int n = sc.nextInt();
		
		
		
		System.out.println("Enter the Array Elements : ");
		int[] nums =  new int[n];
		for(int i=0; i<n; i++) {
			
			nums[i]=sc.nextInt();
		}
		
		
		// calling the method
		
		
		System.out.println("Enter teh value of k to shift the element");
		int k = sc.nextInt();
		a.RotateArray(nums, k);
	}

}
