package Dharmendra.Array;
import java.util.Scanner;

public class oneDArray {

	public static void main(String[] args) {

           int a[] = new int[5];
		   Scanner sc = new Scanner(System.in);
		   for(int i = 0; i< a.length; i++) {
		   System.out.println("Please enter the marks of Student " + i);
			    a[i] = sc.nextInt();
			 }
		   System.out.println("the marks of student are as follows");
			    for(int i = 0;i < a.length; i++) {	   
			    	 System.out.println(a[i]);
			   }

	}
}


	


