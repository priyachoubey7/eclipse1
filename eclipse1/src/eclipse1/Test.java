package eclipse1;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n;
System.out.print("enter an integer number:");
Scanner input = new Scanner(System.in);
n=input.nextInt();
if(n%2==0)
	System.out.print("entered number is even:");
else
	System.out.println("entered number is odd:");


	}

}
