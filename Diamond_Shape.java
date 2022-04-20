/*Write an interactive program to print a diamond shape. For example, if user enters the 
number 3, the diamond will be as follows:
  *
 * *
* * *
 * *
  *




  */

import java.util.Scanner;

public class Diamond_Shape {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter row for diamond shape:");
	int n=sc.nextInt();
	
	for (int i=1;i<=n ;i++) {
		for (int j=n-1;j>=i ;j--) {
			System.out.print(" ");
		}
		for(int k=1;k<=i;k++){
			System.out.print(" *");	
		}
		System.out.println(" ");		
	}

	for (int i=2;i<=n ;i++ ) {
		for (int j=1;j<=i ;j++) {
			System.out.print(" ");
		}
		for(int k=n;k>=i;k--){
			System.out.print("* ");	
		}
		System.out.println(" ");		
	}
}
}