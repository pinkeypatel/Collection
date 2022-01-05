package collection;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Exceptiondemo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int age2;
		int age = 0;
		try {
		System.out.println("Hi! Enter your age!");
		age = sc.nextInt();
		
		System.out.println("Hi! Enter your age!");
		age2 = sc.nextInt();
		
		System.out.println(age/age2);
		}
		catch(ArithmeticException e) {
			System.out.println("Please do not enter a zero in the dominator");
			
		}catch(InputMismatchException e) {
			System.out.println("Please enter only integer values");
		}catch(Exception e) {
			System.out.println("Please ebter a valid input");
		}finally {
			System.out.println("This part of code is always running");
		}
		}}

	
