/**
   Mohammed Raza
   CSC 236 - Lab3 #1 (class 2)
*/

import java.util.*;

public class Polynomial
{

	private polyNode firstNode;
	int base;
	int exp;
	int sum;

	public Polynomial()
	{
		firstNode = null;

	}

	public Polynomial(int base, int exp)
	{
		firstNode = null;

	}

	public void setPoly(int bb, int ee)
	{
		base = bb;
		exp = ee;
	}

	public boolean isEmpty()
	{
		return firstNode == null;
	}

	public polyNode getFirstNode()
	{
		return firstNode;
	}

	public void setFirstNode(polyNode node)
	{
		firstNode = node;
	}

	public void add(Object base, Object exp)
	{
		if (isEmpty())
			firstNode = new polyNode(base, exp, null);
		else
		{
			polyNode current = firstNode;
			while (current.getNext() != null)
				current = current.getNext();

			current.setNext(new polyNode(base, exp, null));
		}
	}

	public void polySum(Object base, Object exp)
	{
		if (isEmpty())
			firstNode = new polyNode(base, exp, null);
		else
		{
			polyNode current = firstNode;
			while (current.getNext() != null)
				current = current.getNext();


			if (firstNode.getValue1().equals(current.getValue2()))
			{
				polyNode p = current;

				System.out.print("The sum is: " + sum);
			}
		}

	}

	public String toString()
	{
		if(isEmpty())
			return "empty";
		else
		{
			String s = "";
			polyNode current = firstNode;
			while(current != null)
			{
				s = s + " + " + current.getValue1() + "x^" + current.getValue2();
				current = current.getNext();
			}
			return s;
		}

	}

}

