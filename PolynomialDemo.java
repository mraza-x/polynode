/**
   Mohammed Raza
   CSC 236 - Lab3 #1 (main)
*/

import java.util.*;

public class PolynomialDemo
{
	static Scanner keyboard = new Scanner(System.in);

	public static Polynomial getList1()
	{

		final int SENTINEL = -999;

		int base;
		int exp;

		Polynomial term1 = new Polynomial();

		System.out.println("Enter the 1st polynomial (coefficient & exponent)\nTerminate with -999 for both numbers:");
		base = keyboard.nextInt();
		exp = keyboard.nextInt();

		while (base != SENTINEL || exp != SENTINEL)
		{
			term1.add(base,exp);
			base = keyboard.nextInt();
			exp = keyboard.nextInt();
		}

		return term1;

	}

	public static Polynomial getList2()
	{

		final int SENTINEL = -999;

		int base;
		int exp;

		Polynomial term2 = new Polynomial();

		System.out.println("\nEnter the 2nd polynomial (coefficient & exponent)\nTerminate with -999 for both numbers:");
		base = keyboard.nextInt();
		exp = keyboard.nextInt();

		while (base != SENTINEL || exp != SENTINEL)
		{
			term2.add(base,exp);
			base = keyboard.nextInt();
			exp = keyboard.nextInt();
		}

		return term2;

	}

	public static boolean addition1(Polynomial term1, Object exp)
	{
		polyNode current = term1.getFirstNode();

		while (current != null)
		{
			if (current.getValue2().equals(exp))
				return true;
			current = current.getNext();
		}
		return false;
	}


	public static boolean addition2(Polynomial term2, Object exp)
	{
		polyNode current = term2.getFirstNode();

		while (current != null)
		{
			if (current.getValue2().equals(exp))
				return true;
			current = current.getNext();
		}
		return false;
	}


	public static void main(String[] args)
	{
		System.out.println("::: Polynomials as Linked List :::\n");

		Polynomial term1 = getList1();

		System.out.print("The first polynomial is: ");
		System.out.println(term1);

		System.out.println("");

		Polynomial term2 = getList2();

		System.out.print("The second polynomial is: ");
		System.out.println(term2);

	}

}